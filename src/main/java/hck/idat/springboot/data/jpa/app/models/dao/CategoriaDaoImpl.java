package hck.idat.springboot.data.jpa.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hck.idat.springboot.data.jpa.app.models.entity.Categoria;

@Repository
public class CategoriaDaoImpl implements ICategoriaDao {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true) //ReadOnly=true solo cuando es SELECT
	
    @Override
    public List<Categoria> findAll() {
		
		return em.createQuery("from Categoria").getResultList(); //SELECT
	}
	@Transactional
    @Override
	public void save(Categoria categoria) {
		em.persist(categoria);//insert
		
	}

}
