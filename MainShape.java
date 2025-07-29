package day3;

public class MainShape {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(5);
		s.display();
		System.out.println("Area of circle:"+s.area());
		s=new Rectangle(4,6);
		s.display();
		System.out.println("Area of Rectangle:"+s.area());
	}

}
