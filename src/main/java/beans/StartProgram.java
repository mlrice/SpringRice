package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ShoesService shoesService = applicationContext.getBean("shoesService", ShoesService.class);

		
		System.out.println("Original Price: " +shoesService.getShoes("123").getPrice());
		shoesService.reducePrice("123", 10.00);
		System.out.println("Sale price: " +shoesService.getShoes("123").getPrice());
		
		//shoesService.sellShoes("222", 2);
		//System.out.println("Total Cost: " +shoesService.getShoes("222").getPrice());
	}

}
