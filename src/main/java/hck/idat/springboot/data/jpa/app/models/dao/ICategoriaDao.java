package hck.idat.springboot.data.jpa.app.models.dao;

import java.util.List;

import hck.idat.springboot.data.jpa.app.models.entity.Categoria;

public interface ICategoriaDao {
  public List<Categoria> findAll();

public void save(Categoria categoria);//Guardar un objeto cliente


}