package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	private HashMap<String,String> fruitsMap = new HashMap<String,String>();
	
	public void createDictionary() {
		
		this.fruitsMap.put("apple","リンゴ");
		this.fruitsMap.put("peach", "もも");
		this.fruitsMap.put("banana", "バナナ");
		this.fruitsMap.put("lemon", "レモン");
		this.fruitsMap.put("pear", "なし");
		this.fruitsMap.put("kiwi", "キウイ");
		this.fruitsMap.put("strawbelly", "いちご");
		this.fruitsMap.put("grape", "ぶどう");
		this.fruitsMap.put("muscat", "マスカット");
		this.fruitsMap.put("cherry", "さくらんぼ");
		
	}
	
	public void seachDictionary(String word) {
		
		if ( this.fruitsMap.get(word) == null ){
			System.out.println(word + "は辞書に存在しません");
		}else { System.out.println(word + "の意味は" + this.fruitsMap.get(word));
		}
	}
}
