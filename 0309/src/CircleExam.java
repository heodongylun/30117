import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 값 :");
		int radius = sc.nextInt();
		Circle c = sc.Circle(radius);
		System.out.println("반지름"+radius+"인 원의 넓이는 " + c.area()+"이다.");
		
		
	}

}
class Circle{
	int radius;
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double area() {
		return radius*radius*3.14;
	}
}











