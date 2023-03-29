import com.cui.Pojo.Order;
import com.cui.Pojo.RuleTest;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class test {
    @Test
    public void test1() {
/*        KieServices kieServices1 = KieServices.Factory.get();
        // 获取Kie容器对象（默认容器对象
        KieContainer kieContainer = kieServices1.newKieClasspathContainer();
        // 从Kie容器对象中获取会话对象（默认session对象
        String ruletype = "ksession-rule";
        KieSession kieSession = kieContainer.newKieSession(ruletype);
        System.out.println("kieSession = " + kieSession);
        Order order = new Order();
        order.setOriginalPrice(160d);

        // 将order对象插入工作内存
        kieSession.insert(order);

        System.out.println("匹配规则前优惠后价格：" + order.getRealPrice());

        // 匹配对象
        // 激活规则，由drools框架自动进行规则匹配。若匹配成功，则执行
        kieSession.fireAllRules();

        // 关闭会话
        kieSession.dispose();

        System.out.println("优惠前价格：" + order.getOriginalPrice() + "\n优惠后价格：" + order.getRealPrice());*/
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        String ruleType = "test01";
        KieSession kieSession = kieClasspathContainer.newKieSession(ruleType);
        RuleTest ruleTest = new RuleTest();
        ruleTest.setName("22222222222222");
        ruleTest.setFalg("2");
        kieSession.insert(ruleTest);

        kieSession.fireAllRules();
        System.out.println(ruleTest.getName());
        // 关闭会话
        kieSession.dispose();
    }

    @Test
    public void RuleTest() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        String ruleType = "test01";
        KieSession kieSession = kieClasspathContainer.newKieSession(ruleType);
        RuleTest ruleTest = new RuleTest();
        ruleTest.setFalg("1");
        kieSession.insert(ruleTest);

        kieSession.fireAllRules();

        // 关闭会话
        kieSession.dispose();
    }
}
