package day3;

class Circle extends Shape {
	double radius;
	Circle(double r){
		radius=r;
	}
	double area() {
		return Math.PI*radius*radius;
	}

}
