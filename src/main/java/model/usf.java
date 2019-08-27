package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
@Lazy(true)
public class usf {

	@Bean
	public Type trans() {
		return new Type(2, "mmmm");
	}
	
}
