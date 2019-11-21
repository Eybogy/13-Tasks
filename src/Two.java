import java.util.Scanner;

/* 7.134. Напишите программу, вводящую последовательность
          целых чисел, и печатающую количество различных значений квадратов
          ее элементов. */

public class Two {
    static void kvadrat() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the numbers:...");
    String x;
    int all = 0;
    String S1 = "";
    String S2 = "";
    int i;
    boolean flag = true;
    while (flag == true){
        x = in.next();
        try {
            i = new Integer(x);
        } catch (NumberFormatException e) {
            break; }
        S1 = Integer.toString(i*i);
        S1 = "*" +  S1 + "*";       // Создаёт уникаальную последовательность, чтобы числа не повторялись для типа String
        if (S2.contains(S1)) {
        } else {
            S2 = S2 + "\n "+ S1;
            all++;}
    }
    System.out.println(all);
}}