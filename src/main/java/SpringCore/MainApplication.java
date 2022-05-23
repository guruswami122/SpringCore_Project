package SpringCore;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CurdOperation.Employee;

public class MainApplication 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/SpringCore/applicationContext.xml");
       EmployeeSetterInjection e=(EmployeeSetterInjection)context.getBean("employee");
        //EmployeeConstructorInjection e=(EmployeeConstructorInjection)context.getBean("employee");
        e.display();
       
        
        
    }
}
