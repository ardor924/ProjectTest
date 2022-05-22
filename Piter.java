package 연습용;

public class Piter extends Human implements Talkable{

	

	public Piter(int x, int y, int age, String name) {
		super(x, y, age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("Greethings! I'm Piter. Pleased to meet you.");
		
	}

	@Override
	void attack() {
		System.out.println("!!!!");
		
	}

	@Override
	void plintInfo() {
		System.out.println("Hi");		
	}

}
