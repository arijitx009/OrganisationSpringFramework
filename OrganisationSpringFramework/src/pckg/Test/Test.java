package pckg.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.organisation.Organisation;



public class Test {
	
	public static void main(String args[]) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("capgemini.xml");
		Organisation orgn=(Organisation)context.getBean("organisation");
		System.out.println(orgn);
		
	}

}
