package daylog;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Date: 16.09.2017
 * Time: 20:26
 *
 * @author Viktor Aleksandrov
 */
@Configuration
@EnableWebMvc
@Import({AppConfig.class})
@ComponentScan(basePackages = {"daylog.controllers"})
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/includes/**")
                .addResourceLocations("/includes/").setCachePeriod(31556926);
    }

}
