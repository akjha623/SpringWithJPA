package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvctwo.dto.Mobile;
@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao {
	
	@PersistenceContext
	EntityManager em;
	

	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);
		em.flush();
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("FROM Mobile");
		List<Mobile> myAll=query.getResultList();
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		
		Query querydelete=em.createQuery("DELETE FROM Mobile WHERE mobId=:mobdata");
		querydelete.setParameter("mobdata", mobId);
		querydelete.executeUpdate();
		
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		Query querysearch=em.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querysearch.setParameter("mobdata", mobId);
		Mobile mob=(Mobile) querysearch.getResultList().get(0);
		return mob;
	}

	@Override
	public void updateMobile(int mobId, double price) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("UPDATE Mobile set mobPrice=:price WHERE mobId=:mobdata");
		query.setParameter("price", price);
		query.setParameter("mobdata", mobId);
		query.executeUpdate();
		
	}

}
