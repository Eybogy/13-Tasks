import java.util.Scanner;

/* 7.135. Напишите программу, вводящую последовательность
          вещественных чисел, и печатающую среднее арифметическое ее элементов
          (для непустой последовательности).*/
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Three {
    static void Averge() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        double all = 1;
        String x = in.next();
        int i = new Integer(x);
        double averge = i;
        double sum = i;
        boolean flag = true;
        while (flag == true){
            x  = in.next();
            all++;
            try {
                i = new Integer(x);
            } catch (NumberFormatException e) {
                break; }
            sum+=i;
            averge = sum/all;
            System.out.println("На даннный момент среднее арифметическое равно: "+ averge);
        }
        System.out.println(averge);
    }
}
