package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @Component가 붙은 클래스를 찾아서 스프링 빈으로 등록해준다.
@ComponentScan(
    // 제외항목
    excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION, classes = Configuration.class)
) 
public class AutoAppConfig {

}
