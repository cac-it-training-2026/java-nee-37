package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("年齢を入力してください。");
		String input_age = reader.readLine();
		int age = Integer.parseInt(input_age);

		if (age < 20) {
			System.out.println("20未満なので、お酒の提供が出来ません。");
		} else {
			System.out.println("20以上なので、お酒を提供することが可能です。");
		}

	}
}
