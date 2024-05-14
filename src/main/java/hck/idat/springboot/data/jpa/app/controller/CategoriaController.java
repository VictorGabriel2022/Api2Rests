package hck.idat.springboot.data.jpa.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hck.idat.springboot.data.jpa.app.models.dao.ICategoriaDao;
import hck.idat.springboot.data.jpa.app.models.entity.Categoria;

@Controller
public class CategoriaController {
	@Autowired
	private ICategoriaDao categoriaDao;
		
	
//Metodos
	@GetMapping(value="/listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Lista de categoria");
		model.addAttribute("categorias",categoriaDao.findAll());
		return "LCategoria";
   }
	//inserción (formularios)
	@GetMapping(value="/formc")
	public String crear(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		model.addAttribute("titulo", "formulario de categoria");
		return "formcategoria";
	}
	@PostMapping(value="/formc")
	public String guardar(Categoria categoria) {
		categoriaDao.save(categoria);
		return "redirect:listar";
	}
	
	
}
