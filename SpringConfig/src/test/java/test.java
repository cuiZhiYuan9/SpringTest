import com.cui.api.Animal;
import com.cui.config.SpringConfig;
import com.cui.entity.Doctor;
import com.cui.impl.Cat;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(SpringConfig.class);
        ConfigurableListableBeanFactory beanFactory = acc.getBeanFactory();
        Object cat = acc.getBean("cat");
        Cat bean = acc.getBean(Cat.class);
        bean.show();
        bean.sleep();
        System.out.println(bean);
        System.out.println(cat);
    }
    @Test
    public void test01() throws NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        Class<Doctor> doctorClass = Doctor.class;
        System.out.println("doctorClass = " + doctorClass);
        Field field= doctorClass.getDeclaredField("name");
        Class<?> declaringClass = field.getDeclaringClass();
        System.out.println("declaringClass = " + declaringClass);
        System.out.println(field);
        field.setAccessible(true);
        Doctor doctor = doctorClass.newInstance();
        field.set(doctor,"崔之眼");


        String name = (String) field.get(doctor);
        System.out.println("doctorClass.newInstance() = " + doctorClass.newInstance().getClass());
        System.out.println("name = " + name);
        Method show = doctorClass.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(doctor);


    }
}
