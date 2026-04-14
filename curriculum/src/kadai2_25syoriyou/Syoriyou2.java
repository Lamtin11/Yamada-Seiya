package kadai2_25syoriyou;

public class Syoriyou2 extends Syoriyou {
    private String yuusya;

    // コンストラクタ
    public Syoriyou2(String name) {
        super(); // 親クラスのコンストラクタ呼び出し
        this.yuusya = name;
    }

    // getter
    public String getName() {
        return yuusya;
    }

    // setter
    public void setName(String name) {
        this.yuusya = name;
    }
}