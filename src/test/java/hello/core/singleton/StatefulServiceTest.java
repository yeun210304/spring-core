package hello.core.singleton;

// import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SuppressWarnings("unused")
public class StatefulServiceTest {

    @Test
    void StatefulServiceSingleton() {
        @SuppressWarnings("resource")
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA: A 사용자 10000 주문
        int userAprice = statefulService1.order("userA", 10000);
        //ThreadB: B 사용자 20000 주문
        int userBprice = statefulService2.order("userB", 20000);

        //ThreadA: 사용자A 주문 금액 조회
        // int price = statefulService1.getPrice();
        System.out.println("price = " + userAprice);

        // Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}
