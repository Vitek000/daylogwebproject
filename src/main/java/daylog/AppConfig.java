package daylog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Date: 16.09.2017
 * Time: 19:37
 *
 * @author Viktor Aleksandrov
 */
@Configuration
public class AppConfig {
    /**
     * For @Value to work.

     * Must be static:
     * The reason for the issue it turns out, is that with @Configuration which internally uses annotations like @Autowired, @Value, and @PostConstruct, any BeanFactoryPostProcessor
     * beans have to be declared with a static, modifier. Otherwise the containing @Configuration class is instantiated very early and the BeanPostProcessors responsible for resolving
     * annotations like @Value, @Autowired etc, cannot act on it.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
