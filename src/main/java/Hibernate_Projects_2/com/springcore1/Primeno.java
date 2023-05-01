package Hibernate_Projects_2.com.springcore1;

import org.springframework.stereotype.Component;

@Component
public class Primeno extends Design{
	public void task1()
	{
		System.out.println("Prime No from 0 to 20:");
		int temp=0;
		for(int a=0; a<=20; a++)
		{
			
			for(int i=2; i<=a-1; i++)
			{
				if(a%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.print(a+" ");
			}
			else
			{
				temp=0;
			}
			
		}
		System.out.println(" ");
	}
	
}
