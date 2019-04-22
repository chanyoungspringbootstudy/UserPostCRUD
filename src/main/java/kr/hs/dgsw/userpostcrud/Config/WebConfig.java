package kr.hs.dgsw.userpostcrud.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String root = System.getProperty("user.dir");
        registry.addResourceHandler("/images/**").addResourceLocations("file:///" + root + "/uploads/").setCachePeriod(0);
    }
}