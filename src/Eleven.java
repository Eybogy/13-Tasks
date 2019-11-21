import java.util.Scanner;

/* 7.143 Напишите программу, вводящую последовательность
         из нулей и единиц, печатающую число групп из единиц, разделенных нулями.         */

public class Eleven {
    static void Grops() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        int counter = 0;
        int x = in.nextInt();
        /*if (x == 1){
            System.out.println(" На даннный момент число групп из единиц равно: 1");
        } else


         */
        String y = in.next();
        int i;
        i = new Integer(y);
        if (x > i) {
            counter++;
        }
        boolean flag = true;
        while (x == 1 && i == 1) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) { break; }
            if (i == 0 || i == 1) {
                counter = 1;
            } else {  break;  }
            System.out.println("На даннный момент число групп из единиц равно: " + counter);
            x = i;
            y = in.next();
        }
        while (flag == true) {
            try {
                i = new Integer(y);
            } catch (NumberFormatException e) {
                break;
            }
            if (i == 0 || i == 1) {
                if (x == 0 && i == 1) {
                    counter++;
                }
            } else { break; }
            System.out.println("На даннный момент число групп из единиц равно: " + counter);
            x = i;
            y = in.next();
        }
        System.out.println(counter);
    }
}