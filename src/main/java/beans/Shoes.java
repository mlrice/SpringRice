package beans;

public class Shoes {

	private String itemNum;
	private String color;
	private String style;
	private double price;
	private String size;
	
	
	public Shoes() {
	}


	public Shoes(String itemNum, String color, String style, double price, String size) {
		this.itemNum = itemNum;
		this.color = color;
		this.style = style;
		this.price = price;
		this.size = size;
	}


	public String getItemNum() {
		return itemNum;
	}


	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	
	
	
}
