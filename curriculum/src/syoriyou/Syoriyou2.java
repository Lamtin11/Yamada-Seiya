package syoriyou;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Syoriyou2 {

    private String msg1;
    private String msg2;
    private String msg3;
    private String now;

    // コンストラクタ
    public Syoriyou2() {
        this.msg1 = "こんにちは！ここは日本です！";
        this.msg2 = "この寿司はうまい";
        this.msg3 = "寿司は和食です";

        // 現在日時を取得
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.now = date.format(fmt);
    }

    // 表示用メソッド
    public void printMessage() {
        System.out.println(this.msg1);
        System.out.println(this.msg2);
        System.out.println(this.msg3);
        System.out.println("今の現在日時は" + this.now + "です");
    }
}