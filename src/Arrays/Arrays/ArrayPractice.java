package Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] scores;
//        scores = new int[4];

//        scores[0] = 85;
//        scores[1] = 90;
//        scores[2] = 48;
//        scores[3] = 56;

//        System.out.println(Arrays.toString(scores));

        int[] scores = {85, 98, 40, 56};
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }

        // enhanced forLoop
//        for (int score : scores) {
//            System.out.println(score);
//        }

        // loop to find sum
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum +=scores[i];
        }
//        System.out.println(sum);

//        int num = scores[0];
//        for (int i = 0; i < scores.length; i++) {
//            if (num < scores[i]) {
//                num = scores[i];
//            }
//        }

        int num = 500;
        boolean found = false;

        for (int i = 0; i <scores.length; i++) {
            if (num == scores[i]) {
                found = true;
                break;
            }
        }

//        System.out.println(Arrays.toString(scores));
    }
}
