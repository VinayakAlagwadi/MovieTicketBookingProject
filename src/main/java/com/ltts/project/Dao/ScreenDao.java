package com.ltts.project.Dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Screen;

@Repository
public class ScreenDao {

//	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	public boolean InsertScreen(Screen Sc) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(Sc);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		/*
		 * finally { sf.close(); }
		 */
		
		return b;
	}
}
