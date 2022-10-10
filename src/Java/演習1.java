package Java;

public class 演習1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 15;
		int y = 30;
		
		int tmp = 1;
		for(int i = 2;i<=x;i++) {
			while(x % i == 0 && y % i == 0) {
				tmp *= i;
				x /= i;
				y /= i;
			}
		}
		System.out.println(tmp);

	}

}
