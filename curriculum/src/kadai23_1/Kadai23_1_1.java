package kadai23_1;

import kadai23_2.Kadai23_2_1;

public class Kadai23_1_1{
    public static void main(String[] args) {

        // インスタンス生成
        Kadai23_2_1 animal = new Kadai23_2_1();

        // 値をセット
        animal.setName("ライオン");
        animal.setLength(2.1);
        animal.setSpeed(80);

        // コンソール出力
        System.out.println("動物名：" + animal.getName());
        System.out.println("体長：" + animal.getLength() + "m");
        System.out.println("速度：" + animal.getSpeed() + "km/h");
    }
}