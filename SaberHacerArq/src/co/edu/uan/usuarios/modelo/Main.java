package co.edu.uan.usuarios.modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration
		.buildSessionFactory(new
		StandardServiceRegistryBuilder().configure().build());
	
		Session session = factory.getCurrentSession();
		
		session.getTransaction().begin();
		// Create usuario
		Usuario user = new Usuario();
		user.setId(123);
		user.setNombre("Dragonoid");
		user.setApellido("Pyrus");
		user.setTelefono(112244);
		user.setSexo("Masculino");
		user.setEstadocivil("casado");
		// Save
		session.save(user);
		// Commit, calling of commit will cause save an instance of employee
		session.getTransaction().commit();

		
		

	}

}
