import java.util.Scanner;

/* 7.142  Напишите программу, вводящую последовательность
          целых чисел, и печатающую максимальную длину монотонного участка её элементов.        */

public class Ten {
    static void MaxLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        int x = in.nextInt();
        System.out.println("На даннный момент максимальная длина монотонного участка равна: 1");
        int i, counter = 1, max = 1;
        String y = in.next();
        i = new Integer(y);
        boolean flag = true;
        while (flag == true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            while (i > x) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
                System.out.println("На даннный момент максимальная длина монотонного участка равна: " + max);
                x = i;
                y = in.next();
                i = new Integer(y);
            }
            counter = 1;
            while (i < x) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
                System.out.println("На даннный момент максимальная длина монотонного участка равна: " + max);
                x = i;
                y = in.next();
                i = new Integer(y);
            }
            counter = 1;
            System.out.println("На даннный момент максимальная длина монотонного участка равна: " + max);
            x = i;
            y = in.next();
        }
        System.out.println(max);
    }
}
