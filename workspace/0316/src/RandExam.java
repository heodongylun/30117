import java.util.Scanner;

public class RandExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		System.out.println("주사위 던질 횟수 입력: ");
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		
		for(int i=1; i<=round; i++) {
			num = (int)(Math.random()*6+1);
			System.out.println(i+"번째 숫자는 "+ num +"입니다.");
			sum += num;
			System.out.println("주사위를"+round+"번 던진결과, 총 합은 "+sum+"입니다.");
		}
	}

}
