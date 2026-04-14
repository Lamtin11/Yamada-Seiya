package kadai2_27;

import java.util.Scanner;

public class Kadai2_27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        String input = scanner.nextLine();

        // ① 「,」で分割
        String[] animals = input.split(",");

        // ② ループで1つずつ処理
        for (String animalData : animals) {

            // ③ 「:」で分割
            String[] data = animalData.split(":");

            String name = data[0];
            String length = data[1];
            String speed = data[2];

            // ④ 学名取得
            String scientificName = getScientificName(name);

            // ⑤ 出力
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
            System.out.println();
        }

        scanner.close();
    }

    // 学名を返すメソッド
    public static String getScientificName(String name) {

        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }
}