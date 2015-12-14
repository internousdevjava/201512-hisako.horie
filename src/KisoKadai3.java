import java.util.Scanner;

/**
 *
 */

public class KisoKadai3 {
	public static void main(String[] args) {
		int x = 0;
		while (x < 9) {
			System.out.println("MENU");
			System.out.println("1　新規");
			System.out.println("2　開く");
			System.out.println("3　保存");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
			System.out.println("9　終了");

			System.out.println("数字を入力してください");
			x = new Scanner(System.in).nextInt();
			switch (x) {
			case 1:

				// Inputline il = new Inputline[];
				System.out.println("数字を入力してください");
				String inputline = new Scanner(System.in).nextLine();
				break;
			}

		}
	}
}
