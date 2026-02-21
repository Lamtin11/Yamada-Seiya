package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		  Dog dog = new Dog("コン", 2);
	        System.out.println("名前は " + dog.name + " です。");
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
	        System.out.println("数は " + dog.count + " です。");
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
	        String formattedDate = now.format(formatter);
	        System.out.println("現在日時は " + formattedDate + " です。");
	}
}
