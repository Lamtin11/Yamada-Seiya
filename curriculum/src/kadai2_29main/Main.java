package kadai2_29main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kadai2_29jikkou.Jikkou;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = {
            "北海道:札幌市:83424",
            "青森県:青森市:9646",
            "岩手県:盛岡市:15275",
            "宮城県:仙台市:7282",
            "秋田県:秋田市:11638",
            "山形県:山形市:9323",
            "福島県:福島市:13784",
            "茨城県:水戸市:6097",
            "栃木県:宇都宮市:6408",
            "群馬県:前橋市:6362",
            "埼玉県:さいたま市:3798"
        };

        System.out.println("番号を入力（例: 8,5,9）");
        String input = scanner.nextLine();

        System.out.println("昇順 or 降順 を入力");
        String order = scanner.nextLine();

        String[] indexes = input.split(",");

        List<Jikkou> list = new ArrayList<>();
        
        for (String idx : indexes) {
            int i = Integer.parseInt(idx.trim());

            String[] parts = data[i].split(":");

            String name = parts[0];
            String capital = parts[1];
            double area = Double.parseDouble(parts[2]);

            list.add(new Jikkou(name, capital, area));
        }

        list.sort((a, b) -> {
            if (order.equals("昇順")) {
                return Double.compare(a.getArea(), b.getArea());
            } else {
                return Double.compare(b.getArea(), a.getArea());
            }
        });

        for (Jikkou p : list) {
            System.out.println("都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2");
            System.out.println();
        }

        scanner.close();
    }
}