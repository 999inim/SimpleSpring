import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {

    @Test
    public void Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        PersonDaoImpl personDaoImpl=(PersonDaoImpl)context.getBean("personDaoImpl");

        AspectJProxyFactory proxyFactory= new AspectJProxyFactory(personDaoImpl);
        proxyFactory.addAspect(MyInterceptor.class);

        PersonDao newProxy=(PersonDao)proxyFactory.getProxy();
        newProxy.savePerson();
    }

}
