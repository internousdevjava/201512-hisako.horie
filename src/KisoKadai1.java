
/**
 * @author hisako
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class KisoKadai1 {
		public static void main(String[] args) {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			boolean b = true;
			System.out.println("【九九を計算します】");

			try {
				while (b) {
					try {
						System.out.println("数字2個入力して");
						String i = r.readLine();
						String j = r.readLine();
						int x = Integer.parseInt(i);
						int y = Integer.parseInt(j);

						if (x > 100 || x < 1 || y > 100 || y < 1) {
							System.out.println("数字の範囲は1から100までだよ");
						}else{
							for (int a = 1; a <= x; a++) {
								for (int c = 1; c <= y; c++) {
									System.out.print(a * c + " ");
								}
								System.out.println();

							}
						}
					} catch (IOException e) {
						System.out.println(e);
					} catch (NumberFormatException e) {
						System.out.println("半角数字で入力してください");
					}
					System.out.println("まだ九九見る？");
					System.out.println("y.続ける\tそれ以外:終わる");
					BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
					String s = p.readLine();
					if (s.equals("y")) {
						System.out.println("続けます");
						continue;
					} else {
						System.out.println("終わります");
						b = false;
					}
				}
			} catch (IOException e) {
				System.out.println(e);
				System.out.println("終わり");
		}
		}
	}





