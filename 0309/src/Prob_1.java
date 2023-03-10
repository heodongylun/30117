import java.util.Scanner;

public class Prob_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1000이하의 자연수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		 for(int i = 1; i <= num; i++) {
	            if(i % 4 == 0) {
	                sum += i;
	            }
	        }{
		 if(num <num/4)
			 System.out.println("4의 배수 :"+num/4);
		 }
		 
		 System.out.println("4의 배수의 합은 : " + sum);
		
	}

}
