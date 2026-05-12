package ch10;

public class MatangoR10_3 {
	int hp;
	char suffix;
	
	public MatangoR10_3(char suffix) {
		this.suffix=suffix;
		
	}
	public void attack(Hero10_1 h) {
		System.out.println("キノコ"+ this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp-=10;
	}

}
