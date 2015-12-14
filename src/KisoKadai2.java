/**
 *
 */

public class KisoKadai2 {
	public static void main(String[] args) {
		int answer;
		int input;
		int counter = 0;
		System.out.println("[数当てゲーム]");
		System.out.println("1～100の数を当てよう。");

		answer = 1 + (int) (Math.random() * 100.0);

		while (true) {
			counter++;
			System.out.println("数字を入力してください");
			int x = new java.util.Scanner(System.in).nextInt();

			if (x < answer) {
				System.out.println(x + "よりは大きい。");
			} else if (x > answer) {
				System.out.println(x + "よりは小さい。");
			} else {
				System.out.println("正解!");
				break;
			}
		}
		System.out.println("正答は " + answer);
		System.out.println("正解までに " + counter + "回かかりました。");
	}
}
