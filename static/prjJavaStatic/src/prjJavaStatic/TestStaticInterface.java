package prjJavaStatic;

interface Drawable
{
	void draw();
	static int cube(int x) {
		return x*x*x;
	}
}

class rectangle1 implements Drawable
{
	public void draw(){
		System.out.println("drawing rectangle");
		System.out.println("drawing rectangle");
		System.out.println("drawing rectangle");
		System.out.println("drawing rectangle");
	}
}

public class TestStaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new rectangle1();
		d.draw();
		//System.out.println(Drawable.cube(10));

	}

}
