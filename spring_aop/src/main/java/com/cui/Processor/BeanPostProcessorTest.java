package com.cui.Processor;
import com.cui.Advice.MyAdvice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BeanPostProcessorTest implements BeanPostProcessor , ApplicationContextAware {
    ApplicationContext applicationContext;
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //目标
        if(bean.getClass().getPackage().getName().equals("com.cui.impl")){
            Object BeanProxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
            /*        (Object proxy, Method method, Object[] args) -> {
                        MyAdvice bean1 = applicationContext.getBean(MyAdvice.class);
                        bean1.beforeAdvice();
                        //执行目标对象目标方法
                        Object result = method.invoke(bean, args);
                        bean1.afterAdvice();
                        return result;
                    }*/

                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            MyAdvice bean1 = applicationContext.getBean(MyAdvice.class);
                            bean1.beforeAdvice();
                            //执行目标对象目标方法
                            Object result = method.invoke(bean, args);
                            bean1.afterAdvice();
                            return result;
                        }
                    }
            );
            return BeanProxy;
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= applicationContext;
    }
}
