

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai2 {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		boolean b = true;
		System.out.println("□■数当てゲーム■□");
		System.out.println("1から100までの数字を当てるゲーム");
		System.out.println("ヒント：誤差によってコメントが異なるよ");
		System.out.println("");
		System.out.println("数字を入れてね");
		while (b) {
			int i = (int)(Math.random() * 100) + 1;
			try {
				//
				while (b) {
					try {
						String s = r.readLine();
						int ans = Integer.parseInt(s);
						if ( ans >= 101) {
							System.out.println("数字の範囲は1から100までだよ");
						}
						int in = ans - i;
						if (in < 0) {
							if (in >= -5) {
								System.out.println("あとすこし大きい");
							} else if (in >= -10) {
								System.out.println("すこし大きい");
							} else {
								System.out.println("大きい");
							}
						//
						} else if (in > 0) {
							if (in <= 5) {
								System.out.println("あとすこし小さい");
							} else if (in <= 10) {
								System.out.println("すこし小さい");
							} else {
								System.out.println("小さい");
							}
						} else {
							System.out.println("正解!!");
							break;
						}
					} catch (IOException e) {
						System.out.println(e);
					} catch (NumberFormatException e) {
						System.out.println("半角数字で入力してください");
					}
				}
				System.out.println("ゲームを続ける？");
				System.out.println("y.続ける\tそれ以外:終わる");
				String s = r.readLine();
				if (s.equals("y")) {
					continue;
				} else {
					b = false;
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("お疲れ");
	}

}



