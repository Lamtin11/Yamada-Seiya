package カリキュラムB;

import java.util.Scanner;

public class ７｛

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 生徒数の入力
	        System.out.print("生徒の人数を入力してください（2以上）: ");
	        int n = sc.nextInt();

	        // 点数を保存する配列 [生徒][教科]
	        // 教科の順番：0=英語, 1=数学, 2=理科, 3=社会
	        int[][] scores = new int[n][4];

	        String[] subjects = {"英語", "数学", "理科", "社会"};

	        // 点数入力
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
	                scores[i][j] = sc.nextInt();
	            }
	            System.out.println();
	        }

	        // 各生徒の平均点
	        double totalSum = 0.0;
	        for (int i = 0; i < n; i++) {
	            int studentSum = 0;
	            for (int j = 0; j < 4; j++) {
	                studentSum += scores[i][j];
	            }
	            double studentAvg = studentSum / 4.0;
	            totalSum += studentSum;
	            System.out.printf("%d人目の平均点は%.2f点です。%n", i + 1, studentAvg);
	        }

	        System.out.println();

	        // 各教科の平均点
	        for (int j = 0; j < 4; j++) {
	            int subjectSum = 0;
	            for (int i = 0; i < n; i++) {
	                subjectSum += scores[i][j];
	            }
	            double subjectAvg = subjectSum / (double) n;
	            System.out.printf("%sの平均点は%.2f点です。%n", subjects[j], subjectAvg);
	        }

	        // 全体の平均点
	        double overallAvg = totalSum / (n * 4.0);
	        System.out.printf("全体の平均点は%.2f点です。%n", overallAvg);

	        sc.close();
	    }
	}

}