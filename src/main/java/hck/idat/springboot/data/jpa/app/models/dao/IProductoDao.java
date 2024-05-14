package hck.idat.springboot.data.jpa.app.models.dao;

import java.util.List;


import hck.idat.springboot.data.jpa.app.models.entity.Producto;

public interface IProductoDao {
 //Permite crear metodos
	public List<Producto> findAll();//El nombre puede ser otro.
	public void save(Producto producto);
}
