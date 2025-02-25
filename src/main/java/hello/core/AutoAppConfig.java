package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @Component가 붙은 클래스를 찾아서 스프링 빈으로 등록해준다.
@ComponentScan(
    basePackages =  "hello.core", // 탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
    excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION, classes = Configuration.class)
) 
public class AutoAppConfig {

}
