package hck.idat.springboot.data.jpa.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hck.idat.springboot.data.jpa.app.models.entity.Producto;
@Repository
public class ProductoDaoImpI implements IProductoDao {
	@PersistenceContext
	private EntityManager em;
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true) //ReadOnly=true solo cuando es SELECT
	
    @Override
	public List<Producto> findAll() {
		return em.createQuery("from Producto").getResultList();
		
	}
	@Transactional
	@Override
	public void save(Producto producto) {
		em.persist(producto);
		
	}

}
