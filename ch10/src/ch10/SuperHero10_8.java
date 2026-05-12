package ch10;

public class SuperHero10_8 extends Hero10_1 {
	
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
		
		System.out.println(this.name + "の攻撃！");
		
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
		
		if(this.flying) {
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた！");
			
		}

		
	}

}
