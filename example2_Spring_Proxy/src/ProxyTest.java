import org.junit.Test;

import java.lang.reflect.Proxy;


public class  ProxyTest {

	@Test
	public void testProxy(){
		PersonDao personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor myInterceptor = new MyInterceptor(personDao, transaction);

		PersonDao newProxy = (PersonDao)Proxy.newProxyInstance(personDao.getClass().getClassLoader(), personDao.getClass().getInterfaces(), myInterceptor);
		newProxy.savePerson();
	}
}
