package ch8;

public class Main8_13 {

	public static void main(String[] args) {
		
		//1.勇者の生成
		Hero8_8 h = new Hero8_8();

		// 2.フィールドに初期値をセット
		h.name ="ミナト";
		
		h.hp =100;
		
		System.out.println("勇者" + h.name + "生み出しました！");
		
		// 3.勇者メソッドを呼び出しておく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		

		
		
				
		
		
	}

}
