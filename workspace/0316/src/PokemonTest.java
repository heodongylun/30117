
public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pikachu = new Pokemon();
		pikachu.pokeName = "피카츄";
		pikachu.legs = 4;
		pikachu.skill = "물";
		pikachu.showInformation();
		
		Pokemon pairi = new Pokemon("파이리",4,"불");
		pairi.showInformation();
		
		
	}

}

class Pokemon{
	String pokeName;
	int legs;
	String skill;
	
	public Pokemon(){}
	public Pokemon(String n, int legs, String s) {
		this.pokeName = n;
		this.legs = legs;
		this.skill = s;
	}
	
	public void showInformation() {
		System.out.println("이름: " + pokeName);
		System.out.println("다리 개수" + legs);
		System.out.println("기술:" + skill);
	}
}
