package ch8;

import java.util.Random;

//練習問題8-1の回答
public class Cleric {
	//練習問題8-2の解答
	String name;
	
	int hp = 50;
	
	final int MAX_HP =50;
	
	int mp = 10;
	
	final int MAX_MP =10;
	
	//練習問題8-3の解答
	public void selfAid() {
		System.out.println("聖職者がセルフエイドを使用");

		this.hp=this.MAX_HP;
		
		this.mp-=5;
		
		System.out.println("HPが最大まで回復した");
		
		
	}
	//練習問題8-4の回答
	public int pray(int sec) {
		
		System.out.println(this.name + "は" + sec + "秒間点に祈った！" );
		
		//回復量をJavaの標準API(Random)を使用しランダム値を取得
		int recover = new Random().nextInt(3) +sec;
		
		//実際の回復量を計算
		int recoverActual = Math.min(this.MAX_MP -this.mp ,recover);//Minは右辺と左辺を比べて小さい方を返す標準API
		
		//回復量をセット
		this.mp += recoverActual;
		
		System.out.println("MPが"+ recoverActual + "回復した" );

		
		return recoverActual;
		
		

		
		
		
	}
	
	
	
	
	

}
