package day3;

public class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	public String toString() {
		return name+"\n"+price+"\n"+qtyInStock+"\n"+author;
	}

}
