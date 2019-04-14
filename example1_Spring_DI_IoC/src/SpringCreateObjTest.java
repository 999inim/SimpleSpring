import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCreateObjTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void createObjTest_default(){
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
	}

	@Test
	public void createObjTest_static_factory(){
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld2");
		helloWorld.hello();
	}

	@Test
	public void createObTest_instance_factory(){
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld3");
		helloWorld.hello();
	}
}
