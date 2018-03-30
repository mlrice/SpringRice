package beans;

import java.util.List;

public interface ShoesDao {
	
	public void insert(Shoes shoes);
	public void update(Shoes shoes);
	public void update(List<Shoes>shoes);
	public void delete(String shoeItemNum);
	public Shoes find(String shoeItemNum);
	public List<Shoes>find(List<String>shoeItemNum);
	

}
