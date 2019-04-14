import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInterceptor implements InvocationHandler{

	private Object tager;
	private Transaction transation;
	
	public MyInterceptor(Object tager, Transaction transation) {
		this.tager = tager;
		this.transation = transation;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		transation.beginTransaction();// 선정
		method.invoke(tager, args);
		transation.commit();
		return null;
	}

}
