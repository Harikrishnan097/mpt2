package com.capg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.spring.dto.Gear;

public class GearDao implements IGearDao {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	
	
	@Override
	public void addList(Gear e) {
		// TODO Auto-generated method stub
		entityManager.persist(e);
	}

	@Override
	public List<Gear> showGear() {
		// TODO Auto-generated method stub
		List<Gear> list =new ArrayList<>();
		Query q=entityManager.createQuery("from query_master");
		list =q.getResultList();
		return list;
		
	}

	@Override
	public void deleteGear(int id) {
		// TODO Auto-generated method stub
		Query queryOne=entityManager.createQuery
				("FROM query_master where query_id=:id");
		queryOne.setParameter("id",id);
		Gear gearList=(Gear) queryOne.getSingleResult();
		
		
		entityManager.remove(gearList);
	}

	@Override
	public Gear searchGear(int id) {
		// TODO Auto-generated method stub
		Gear gearList =	entityManager.find(Gear.class, id);
//		
		return gearList;
	}

	@Override
	public void updateGear(Gear e) {
		// TODO Auto-generated method stub

		entityManager.merge(e);


		
	}

	
	
	
	
}
