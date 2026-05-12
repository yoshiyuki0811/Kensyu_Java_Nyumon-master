package ch8;

public class Main8_16 {

	public static void main(String[] args) {
		
		Hero8_8 h= new Hero8_8();
		
		h.name ="ミナト";
		
		h.hp = 100;
		
		//お化けキノコ１召喚し初期知セット
		Matago8_15 m1 = new Matago8_15();
		
		m1.hp =50;
		
		m1.suffix= 'A';
		
		Matago8_15 m2 = new Matago8_15();
		
		m2.hp =48;
		
		m2.suffix= 'B';
		
		//冒険の始まり　　実行
		
		h.slip(); //勇者が逃げる
		m1.run();//キノコ１が逃げる
		m2.run();//キノコ２が逃げる
		h.run();//勇者が逃げる
		
		
		
		
		
				
		
	}

}
