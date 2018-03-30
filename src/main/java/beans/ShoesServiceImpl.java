package beans;

public class ShoesServiceImpl implements ShoesService {

	private ShoesDao shoesDao;
	
	public ShoesDao getShoesDao() {
		return shoesDao;
	}
	
	public void setShoesDao(ShoesDao shoesDao) {
		this.shoesDao = shoesDao;
	}
	
	public void reducePrice(String shoesItemNum, double amount){
		Shoes shoes = shoesDao.find(shoesItemNum);
		shoes.setPrice(shoes.getPrice() - amount);
		shoesDao.update(shoes);

	
	}

	public void sellShoes(String shoesItemNum, int quantity) {
		Shoes shoes = shoesDao.find(shoesItemNum);
		shoes.setPrice((shoes.getPrice() * quantity));
		
	}

	public Shoes getShoes(String shoesItemNum) {
		return shoesDao.find(shoesItemNum);
	}
	
}
