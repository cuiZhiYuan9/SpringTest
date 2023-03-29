import com.cui.Processor.BeanPostProcessorTest;
import com.cui.Service.DemoService;
import com.cui.api.Advice;
import com.cui.api.Animal;
import com.cui.entity.User;
import com.cui.impl.AdviceImpl;
import com.cui.impl.Cat;
import com.cui.impl.Mouse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Advice bean = (Advice) context.getBean("advice2");
        bean.show();
    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cat bean = context.getBean(Cat.class);
        bean.cal();
        bean.name();
    }

    @Test
    public void test03() {
        String orgno = "123456912345678";
        String idno = "123456789123456789";
        DemoService.ComPareID(orgno, idno);
    }

}
