package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public void fruitsUp(String[] words){
	
		HashMap<String,String> fruitsMap = new HashMap<String,String>();
		
			String fruits = "";
		
			fruitsMap.put("apple","リンゴ");
			fruitsMap.put("peach", "もも");
			fruitsMap.put("banana", "バナナ");
			fruitsMap.put("lemon", "レモン");
			fruitsMap.put("pear", "なし");
			fruitsMap.put("kiwi", "キウイ");
			fruitsMap.put("strawbelly", "いちご");
			fruitsMap.put("grape", "ぶどう");
			fruitsMap.put("muscat", "マスカット");
			fruitsMap.put("cherry", "さくらんぼ");
			
			for(int i = 0; i < words.length; i++) {
				fruits = fruitsMap.get(words[i]);
				if(fruits == null) {
					System.out.println(words[i] + "は辞書に存在しません");
				} else {
					System.out.println(words[i] + "の意味は" + fruits);
				}
			}
	}
}
