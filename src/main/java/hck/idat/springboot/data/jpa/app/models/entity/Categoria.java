package hck.idat.springboot.data.jpa.app.models.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Categoria implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String descripcion;
public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getDescripcion() {
	return descripcion;
}



public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



public static long getSerialversionuid() {
	return serialVersionUID;
}



private static final long serialVersionUID = 1L;
  
}
