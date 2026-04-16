package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] itemNames = new String[5];
		int[] prices = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください:>");
			String input_name = reader.readLine();
			itemNames[i] = input_name;
		}
		for (int i = 0; i < prices.length; i++) {
			System.out.print("各商品の単価を順に入力してください");
			String input_num = reader.readLine();
			int input_price = Integer.parseInt(input_num);
			prices[i] = input_price;

		}
		System.out.println("登録商品一覧");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");
		}
	}

}
