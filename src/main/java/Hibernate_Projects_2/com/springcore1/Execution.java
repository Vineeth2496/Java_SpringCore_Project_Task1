package Hibernate_Projects_2.com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Design d=new Primeno();
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("Hibernate_Projects_2\\com\\springcore1\\spring.xml");
		Design d=(Design)ctxt.getBean("primeno");
		d.task1();
		
		Design d1=(Design)ctxt.getBean("fabinacii");
		d1.task1();
	//	Design d1=new Fabinacii();
	//	d1.task1();

	}

}
