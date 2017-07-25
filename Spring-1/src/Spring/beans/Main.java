package Spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建Spring的IOC容器
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获得Bean实例
		//Helloworld helloworld = (Helloworld) ctx.getBean("helloWorld");
		
		//3，调用hello方法
		//helloworld.hello();
	}

}
