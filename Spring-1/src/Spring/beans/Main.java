package Spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����Spring��IOC����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л��Beanʵ��
		//Helloworld helloworld = (Helloworld) ctx.getBean("helloWorld");
		
		//3������hello����
		//helloworld.hello();
	}

}
