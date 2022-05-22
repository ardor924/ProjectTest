package 연습용;

abstract class Creature {
	
	// 속성
	int x;
	int y;
	int age;
	String name;
	
	//생성자
	
	public Creature(int x , int y , int age , String name) {
		
	}
	
	// 기능
	abstract void attack();
	abstract void plintInfo();
	
	void increaseAge() {
		++age;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}


	
}
