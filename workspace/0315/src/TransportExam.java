
public class TransportExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1  = new Car("디젤",5);
		Car c2 = new Car("가스",110);
		
		c1.refuel();
		c2.refuel();
		c1.speedDown();
		c2.speedUP();
		
		Airplane a1 = new Airplane("보잉 747",10000,1000);
		Airplane a2 = new Airplane("에어버스 380",20000,5000);
		Airplane a3 = new Airplane("보잉 707",10000,5000);
		
		a1.refuel();
		a2.refuel();
		a3.refuel();
		System.out.println(a1.airplanName+"의 비행시간은 " + a1.flighTime() + "시간 입니다.");
		System.out.println(a2.airplanName+"의 비행시간은" + a2.flighTime() + "시간 입니다.");
		a1.speedDown();
		a2.speedUp();
		
	}

}



abstract class Transport{ //상위 클래스
	abstract void refuel();	//운송수단의 주유를 담당하는 메소드
	abstract void speedUP();//운송수단의 속도 증가를 담당하는 메소드
	abstract void speedDown();//운송수단의 속도 감소를 담당하는 메소드
}

class Car extends Transport{ //하위 클래스1
	int speed; //멤버변수
	String oilType; // 가스,디젤,전기
	
	
	public Car() {//생성자
		
	}
	public Car(String oilType,int speed) {
		super();
		this.speed = speed;
		this.oilType = oilType;
	}



	//메소드
	
	@Override
	void refuel() {
		if(oilType == "전기") {
		System.out.println(oilType + "를 충전합니다");
		}else {
			System.out.println(oilType + "를 주유합니다");
		}
	}
	@Override
	void speedUP() {
		speed+=10; //sped = speed +10;
		if(speed > 110) {
			System.out.println("속력위반 벌칙금 10만원 부과합니다.");
			speed = 10;
		}
	}
	@Override
	void speedDown() {
		speed -= 10;
		if(speed <0) {
			System.out.println("차가 뭠췄습니다");
			speed = 10;
		}
	}
	
	
	
}
class Airplane extends Transport{//하위 클래스 2
	String airplanName;
	int distance;
	int speed;
	static int totalJetFuel = 1500;
	int jetFuel; // 항공유 계산 변수
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	public Airplane(String airplanName, int distance, int speed) {
		super();
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;
	}
	
	void refuel() {
		jetFuel = distance / 20;
		
		if(jetFuel<=totalJetFuel) {
			totalJetFuel -= jetFuel;
			System.out.println("항공유 " + jetFuel + "L를 주유합니다.");
		}
		else {
			System.out.println("항공유가 부족하여 주유할수 없습니다.");
		}
		
	}
	void speedUp() {
		speed += 1000;
		if(speed>5500) {
			System.out.println("비행속도는 5500km를 넘을 수 없습니다.");
			speed = 5500;
		}
	}

	void speedDown() {
		speed -= 1000;
		if(speed<0) {
		System.out.println("비행기가멈췄습니다.");
		speed = 10;
	}
}
	double flighTime() { // 메소드
		
		return (double)distance/(double)speed;
	}

	@Override
	void speedUP() {
		// TODO Auto-generated method stub
		
	}
}