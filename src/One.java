import java.util.Scanner;

/* 7.133 Напишите программу, вводящую последовательность
         целых чисел, и печатающую количество ее максимальных элементов. */

public class One {
        static void maximus() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the numbers:...");
            int all = 1;
            String x = in.next();
            int i = new Integer(x);
            int max = i - 1;
            boolean flag = true;
            while (flag == true){
                try {
                    i = new Integer(x);
                } catch (NumberFormatException e) {
                    break; }
                if (max > i){
                } else if (max < i) {
                    max = i;
                    all = 1;
                }  else if (max == i) {
                    all++; }
                System.out.println("На даннный момент количество максимальных элементов равно: "+ all);
                x  = in.next(); }
            System.out.println(all);
}}