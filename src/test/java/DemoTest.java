import com.demo.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zpx
 * @version : 1.0
 * @ClassName : DemoTest
 * @Description : TODO
 * @date : 2021/6/28 0:02
 **/
public class DemoTest {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookService as = (BookService) ac.getBean("bookService");
        as.findAll();
    }


}
