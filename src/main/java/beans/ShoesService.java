package beans;

public interface ShoesService {
	
	public void reducePrice(String shoesItemNum, double amount) throws Exception;
	public void sellShoes(String shoesItemNum, int quantity);
	public Shoes getShoes(String shoesItemNum);
	
	
}