package ch10;

public class Hero10_7 {

	int hp =100;

	String name;

	//finalをつけたメソッドはオーバーライド（上書き）できない
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");

	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！！");
	}
}
