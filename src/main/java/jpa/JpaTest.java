package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import domain.*;

public class JpaTest {

	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager managerr = factory.createEntityManager();
		JpaTest test = new JpaTest(managerr);
		EntityTransaction tx = managerr.getTransaction();
		tx.begin();
		try {
			test.createPerson();
			test.listPerson();
			test.createHome();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		
		managerr.close();
		factory.close();
	}
	
	private void createPerson() {
		
		int NbrEnrgPerson = manager.createQuery("SELECT a From Person a",Person.class).getResultList().size();
		
		if(NbrEnrgPerson<=10) {
			Person vama = new Person("Diakite","Hamed","hamed@gmail.fr"); 
			Person gatien = new Person("Anoh","abbah","abbah@yahoo.fr");
			vama.addfriend(gatien);
			manager.persist(vama);
			manager.persist(gatien);
		}
	}
	
	private void listPerson() {
		CriteriaBuilder builder=manager.getCriteriaBuilder();
		CriteriaQuery<Person> query=builder.createQuery(Person.class);
		Root<Person>personRoot=query.from(Person.class);
		query.select(personRoot);
	    TypedQuery<Person>quer=manager.createQuery(query);
		List<Person> Persons=quer.getResultList();
		System.out.println(Persons.size());
		for(Person person : Persons) {
			System.out.println(person.toString());
		}
	}
	
	private void createHome() {

		int NbrEnrgPerson = manager.createQuery("SELECT a From Home a",Home.class).getResultList().size();
		if(NbrEnrgPerson<=10) {
			Home studio = new Home(); 
			studio.setNbrpiece("10");
			studio.setTaille("100");
			manager.persist(studio);
		}
	}

}
