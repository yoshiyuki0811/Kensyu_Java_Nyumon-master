package ch10;

public class SuperHero10_5 extends Hero10_1 {

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

	//親クラスにもあるが再定義すると上書きされる
	public void run() {

		System.out.println(this.name + "は撤退した");
	}

}
