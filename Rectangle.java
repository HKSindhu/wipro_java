package day3;

class Rectangle extends Shape {
	double length,width;
	Rectangle(double l,double w){
		length=l;
		width=w;
	}
	double area() {
		return length*width;
	}
	

}
