import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//Advice들을 포함하고 있는 Aspect 클래스
@Aspect
public class MyInterceptor {

        @Before("selectSavePerson()")
        public void beginTransaction(){
                System.out.println("begin transaction");
        }

        @Pointcut("execution(* PersonDaoImpl.savePerson(..))")
        private void selectSavePerson(){}

        @After("selectSavePerson()")
        public void commit(){
                System.out.println("commit");
        }

}
