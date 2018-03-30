package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoesDaoInMemoryImpl implements ShoesDao{
	
	private Map<String,Shoes>shoeMap = new HashMap<String,Shoes>();
	
	{
		
		Shoes shoes1 = new Shoes("123", "black", "heels", 50.00, "8");
		Shoes shoes2 = new Shoes("222", "white", "running", 80.00, "8");
		
		shoeMap.put(shoes1.getItemNum(), shoes1);
		shoeMap.put(shoes2.getItemNum(), shoes2);
		
	}
	
	public void insert(Shoes shoes) {
		shoeMap.put(shoes.getItemNum(), shoes);
	}

	public void update(Shoes shoes) {
		// TODO Auto-generated method stub
		shoeMap.put(shoes.getItemNum(), shoes);
		
	}

	public void update(List<Shoes> shoe) {
		// TODO Auto-generated method stub
		for(Shoes shoes: shoe) {
			update(shoes);
	}
	}

	public void delete(String shoesItemNum) {
		// TODO Auto-generated method stub
		shoeMap.remove(shoesItemNum);
	
	}

	public Shoes find(String shoesItemNum) {
		// TODO Auto-generated method stub
		return shoeMap.get(shoesItemNum);
	}

	public List<Shoes> find(List<String> shoesItemNum) {
		List<Shoes> shoes = new ArrayList<Shoes>();
		for(String itemNum:shoesItemNum) {
			shoes.add(shoeMap.get(itemNum));
		}
		return shoes;
		}

}
