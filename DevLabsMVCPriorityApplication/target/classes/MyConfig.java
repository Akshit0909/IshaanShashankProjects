import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.spring"})
public class MyConfig  {
	@Bean
	public InternalResourceViewResolver resolver(){
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	internalResourceViewResolver.setViewClass(JstlView.class);
	internalResourceViewResolver.setPrefix("/WEB-INF/view/");
	internalResourceViewResolver.setSuffix(".jsp");
	
		return internalResourceViewResolver;
		
	}

}
