package org.regnant.bean;

public class OrderBean_byid 
{
	private String productname;
	private String productquantity;
	private String productImg;
	private String price;
	public OrderBean_byid(String productname, String productquantity, String productImg, String price) 
	{
		
		this.productname = productname;
		this.productquantity = productquantity;
		this.productImg = productImg;
		this.price = price;
	}
	public OrderBean_byid() 
	{
		
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
