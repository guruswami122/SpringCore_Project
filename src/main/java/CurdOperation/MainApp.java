package CurdOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringCore.EmployeeSetterInjection;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //ApplicationContext context=new ClassPathXmlApplicationContext("/CurdOperation/applicationContext1.xml");
	     //Employee e1=(Employee)context.getBean("employee");
	       //EmployeeConstructorInjection e=(EmployeeConstructorInjection)context.getBean("employee");
	      Configuration conf=new Configuration();
	      conf.configure("/src/main/java/hibernate.cfg.xml");
	      SessionFactory factory=conf.buildSessionFactory();
	      Session session=factory.openSession();
	     Employee e1=new Employee();
	      e1.setEmpcode(1000);
	      e1.setEmpname("Guru");
	      e1.setEmailID("Gurusamratscb@gmail.com");
	      e1.setExperience(2);
	      e1.setJobTitle("Software");
	      e1.setLocation("Chennai");
	      Transaction tx=session.beginTransaction();
	      session.save(e1);
	      tx.commit();
	      session.close();
	      factory.close();
	      
	      
	}

}
