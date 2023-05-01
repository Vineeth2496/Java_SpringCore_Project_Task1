package Hibernate_Projects_2.com.springcore1;

import org.springframework.stereotype.Component;

@Component
public class Fabinacii extends Design{
	int a=0, b=1, c, i;
	public void task1()
	{
		System.out.println("Fabinacii series from 1 to 10: ");	
		for(i=0; i<=10; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
