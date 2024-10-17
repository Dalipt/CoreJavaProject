package com.java.TelAssignment;
//7.Creating product with attribute initialize with different attribute
class Product
{
	String productName;
	double productPrice;
	int productQuantity;
	public Product(String productName, double productPrice, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	Product(String productName)
	{
		this.productName=productName;
	}
	Product(String productName,double productPrice)
	{
		this.productName=productName;
		this.productPrice=productPrice;
	}
	Product(int productQuantity,double productPrice)
	{
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
	}
	
	public void display()
	{
		System.out.println("ProductName:"+ productName +" "+"ProductPrice:"+productPrice+"ProductQuantity:"+productQuantity);
	}
	public void display1()
	{
		System.out.println("ProductQuantity:"+ productQuantity+" "+ "ProductPrice:" +productPrice);
	}
	public void display2()
	{
		System.out.println("ProductName:"+ productName+ " "+"ProductPrice:" +productPrice);
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + "]";
	}
	
}
public class ProductsImplements {

	public static void main(String[] args) 
	{
		Product pd= new Product("Shoe", 100.50, 20);
		pd.display();
		
		Product pd1= new Product(100, 20);
		pd1.display1();
		
		Product pd2= new Product("Books", 20);
		pd2.display2();
		

	}

}
