import java.util.Scanner;

/* 7.138. Напишите программу, вводящую последовательность
          целых чисел, и печатающую номер первого элемента, равного нулю, и
          нуль при отсутствии такого элемента в последовательности. */

public class Six {
    static void Zero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        String y = in.next();
        int Zero;
        int ZeroID = 0;
        int ID = 1;
        boolean flag = true;
        boolean flag2 = true;
        while (flag == true) {
            try {
                Zero = new Integer(y);
            } catch (NumberFormatException e) {
                break; }
            while (flag2 == true){      // Добавляю ещё один цикл, чтобы найдя ещё один Нуль - он не запомнился никак
                try {
                    Zero = new Integer(y);
                } catch (NumberFormatException e) {
                    break; }
                if (Zero == 0){
                    ZeroID = ID;
                    System.out.println("Первый элемент равный нулю идёт по номером " + ZeroID);
                    flag2 = false;
                    break; }
                System.out.println(0);
                y = in.next();
                ID++;
            }
            if (ZeroID > 0){
                System.out.println("Первый элемент равный нулю идёт по номером " + ZeroID);
            } else {
                System.out.println(0);}
            y = in.next();
        }
    }
}