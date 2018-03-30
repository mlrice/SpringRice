package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public ShoesDao shoesDao() {
		ShoesDaoInMemoryImpl bean = new ShoesDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public ShoesService shoesService() {
		ShoesServiceImpl bean = new ShoesServiceImpl();
		bean.setShoesDao(shoesDao());
		return bean;
	}
}
