package com.kevin.sp.ElectionGuesserSPA.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevin.sp.ElectionGuesserSPA.entity.County;

@Repository
public class CountyDAOimp implements CountyDAO {
	
	private EntityManager entityManager;
	
	// entity manager handles database queries
	@Autowired
	public CountyDAOimp (EntityManager _entityManager)
	{
		entityManager = _entityManager;
	}

	// returns all counties in database
	@Override
	public List<County> findAll() {
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<County> query = session.createQuery("from County",County.class);
		
		List<County> counties = query.getResultList();
		
		return counties;
	}

	// returns a county based on unique ID - not FIPS
	@Override
	public County findById(int _id) {
		Session session = entityManager.unwrap(Session.class);
		
		County county = session.get(County.class, _id);
		
		return county;
	}
	
	// returns random county
	@Override
	public County getRandomCounty() {
		Random random = new Random();
		
		List<County> counties = findAll();
		int N = random.nextInt(counties.size()) + 1;
		
		return findById(N);
	}
	



}
