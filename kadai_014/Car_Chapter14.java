package kadai_014;

public class Car_Chapter14 {
	// 車データ
	private int gear  = 1;
	private int speed = 10;
	
	// コンストラクタ
	public Car_Chapter14( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed;
	}
	
	// ギアメソッド
	public void gearChange ( int afterGear ) {
		
		speed = afterGear * 10;
		
		// ギアを変換
		System.out.println( "ギア" + gear + "から" + afterGear + "に切り替えました" );
	}
	
	// ランメソッド
	public void run () {
		
		if( this.speed > 50 ) {
			System.out.println( "速度は時速10kmです" );
		} else {
			System.out.println( "速度は時速" + speed + "kmです" );
		}
	}

}
