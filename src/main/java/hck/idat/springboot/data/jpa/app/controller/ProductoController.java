package hck.idat.springboot.data.jpa.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hck.idat.springboot.data.jpa.app.models.dao.ICategoriaDao;
import hck.idat.springboot.data.jpa.app.models.dao.IProductoDao;
import hck.idat.springboot.data.jpa.app.models.entity.Categoria;
import hck.idat.springboot.data.jpa.app.models.entity.Producto;
@Controller
public class ProductoController {
	@Autowired
	private IProductoDao productoDao;
		
	@Autowired
	private ICategoriaDao categoriaDao;
//Metodos
	@GetMapping(value="/listarp")
	public String listar(Model model) {
		model.addAttribute("titulo","Lista de producto");
		model.addAttribute("productos",productoDao.findAll());
		return "lproducto";
   }
	//inserción (formularios)
	@GetMapping(value="/formp")
	public String crear(Model model) {
		List<Categoria>listaCategorias = categoriaDao.findAll();
		Producto producto = new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("listaCategorias",listaCategorias);
		model.addAttribute("titulo", "formulario de producto");
		return "formproducto";
	}
	@PostMapping(value="/formp")
	public String guardar(Producto producto) {
		productoDao.save(producto);
		return "redirect:listarp";
	}

}
