package day1;

public class Box {
	int width,height,depth;

	public Box(int w,int h,int d) {
		width=w;
		height=h;
		depth=d;
	
	}
	int getVolume() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		Box myBox=new Box(5,10,3);
		int volume=myBox.getVolume();
		System.out.println("Volume of the box is:"+volume);
	}

}
