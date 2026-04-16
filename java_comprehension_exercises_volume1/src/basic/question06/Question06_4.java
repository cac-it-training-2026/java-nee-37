package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amountBooke = 0;
		int sellFlag = 0;
		int bookPrice = 200;

		System.out.println("本を売却します。");

		do {
			amountBooke++;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("売却する本の冊数を１つ増やしますか？");
			System.out.print("はい:0、いいえ:1>");
			String str = reader.readLine();
			sellFlag = Integer.parseInt(str);

		} while (sellFlag == 0);
		System.out.println("売却する本の冊数は" + amountBooke + "冊です。");
		System.out.println("売却する本の合計金額は" + (amountBooke * bookPrice) + "円です。");

	}

}
