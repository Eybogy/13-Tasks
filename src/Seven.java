import java.util.Scanner;

/* 7.139. Напишите программу, вводящую последовательность
          целых чисел, и печатающую число элементов, больших предыдущего (пер-
          вый элемент последовательности тоже считается таким).  */

public class Seven {
    static void Bigger() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        int counter = 0;
        int x = in.nextInt();
        String y = in.next();
        int i;
        boolean flag = true;
        while (flag == true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i > x) {
                counter++;
            }
            System.out.println("На даннный момент число элементов, больших предыдущего равно: " + counter);
            x = i;
            y = in.next();
        }
        System.out.println(counter);
    }
}
