import java.util.Scanner;

/* 7.136. Напишите программу, вводящую последовательность
          целых чисел, и печатающую максимальное число идущих подряд одинаковых элементов.*/

public class Four {
    static void Duplicate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        int all = 1;
        int counter = 1;
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
            if (x == i) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > all) {
                all = counter;
            }
            System.out.println("На даннный момент число идущих подряд элементов равно: " + all);
            x = i;
            y = in.next();
        }
        System.out.println(all);
    }
}