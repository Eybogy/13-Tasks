import java.util.Scanner;

/* 7.140 Напишите программу, вводящую последовательность
         целых чисел, и печатающую второй по величине ее элемент и No, если такого элемента нет.         */

public class Eight {
    static void TwoMax() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        String y = in.next();
        int i = new Integer(y);
        int max = i, max2 = 0;
        boolean flag = true;
        while (flag == true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i > max) {
                max2 = max;
                max = i;
            } else if (max > i && i > max2) {
                max2 = i;
            }
            System.out.println("На даннный момент второй по величине элемент равен: " + max2);
            y = in.next();
        }
        System.out.println(max2);
    }
}
