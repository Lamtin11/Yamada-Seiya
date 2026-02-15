package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void hello(String str, int num) {
        System.out.println(str + " " + num);
    }

    // Q2引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // Q3引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // Q4（Q2のオーバーロード）Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
    public static void multiply(double a, double b) {
        System.out.println(a + b);
    }

    // Q5引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    public static int[] randomNumbers(int count) {
        Random rand = new Random();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int num;
            do {
                num = rand.nextInt(101); // 0～100
            } while (num == 0); // 0は除外

            numbers[i] = num;
            System.out.println(num);
        }

        return numbers;
    }

    // Q6引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double avg = (double) sum / arr.length;
        System.out.println(avg);
        return avg;
    }

    // Q7引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static boolean isAbove50(double avg) {
        boolean result = avg >= 50;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        // Q1
        hello("Hello JavaSE", 11);

        // Q2
        multiply(5, 3);

        // Q3
        int[] sampleArray = {1, 2, 3, 4, 5};
        printArray(sampleArray);

        // Q4
        multiply(2.5, 3.5);

        // Q5
        int[] randomArray = randomNumbers(5);

        // Q6
        double avg = average(randomArray);

        // Q7
        isAbove50(avg);
    }
}

