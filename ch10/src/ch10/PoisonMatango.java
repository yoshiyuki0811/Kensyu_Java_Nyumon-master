package ch10;

//１０章練習問題１０－３の解答
public class PoisonMatango extends MatangoR10_3{
	
	int pisonCount = 5;
	
	public PoisonMatango (char suffix) {
		super(suffix);
	}
	public void attack(Hero10_1 h) {
		super.attack(h);
		if(this.pisonCount>0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			
			int dmg = h.hp/5;
			
			h.hp-=dmg;
			
			System.out.println(dmg +"ポイントのダメージ！！");

			this.pisonCount--;
		}
		
		
		
	}
}
