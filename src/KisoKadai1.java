/**
 *
 */

/**
 * @author hisako
 *
 */
import java.util.Scanner;

public class KisoKadai1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("【九九を計算します】");
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}