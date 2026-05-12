package ch10;

public class SuperHero10_9 extends Hero10_1 {
	boolean flying;

	//飛ぶ
	public void fly() {

		this.flying = true;

		System.out.println("飛び上がった！！");

	}

	public void land() {
		this.flying = false;

		System.out.println("着地した");

	}
	
	public void attack(Matango m) {
		
		
		super.attack(m);
		
		if(this.flying) {
			
			super.attack(null);
		}
	}

}
