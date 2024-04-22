package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	public String getMychoice() {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String myhand = scanner.next();
			
			if(myhand.equals("r") || myhand.equals("s") || myhand.equals("p")) {
			} else {
				System.out.println("エラーです。再度入力してください");
			}
		
			scanner.close();
			
			return myhand;
		
	}
	
	public String getRandom() {
		String[] computerHand = {"r", "s", "p"};
		
		String youhand = computerHand [(int)Math.floor(Math.random() * 3)];
		
		return youhand;
		
		
	}
	
	public void playGame() {
		
		HashMap<String, String> play = new HashMap<String, String>();
		
		play.put("r", "グー");
		play.put("s", "チョキ");
		play.put("p", "パー");
		
		String me = this.getMychoice();
		String you = this.getRandom();
		
		System.out.println("自分の手は" + play.get(me) + "相手の手は" + play.get(you));
		
		if((me.equals("r") && you.equals("r")) || (me.equals("s") && you.equals("s")) || (me.equals("p") && you.equals("p"))) {
			System.out.println("あいこです");
		}
		
		if((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		
		if((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r")) || (me.equals("p") && you.equals("s"))) {
			System.out.println("自分の負けです");
		}
	}

}
