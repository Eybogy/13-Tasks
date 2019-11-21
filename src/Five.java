import java.util.Scanner;

/* 7.137. Напишите программу, вводящую последовательность
          целых чисел, и печатающую номера первого и последнего ее максимальных элементов.*/

public class Five {
    static void MaxMin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:...");
        int x = in.nextInt();
        String y = in.next();
        int ID = 1;
        int ID1 = 1;
        int ID2 = 0;
        int Max1 = x;
        int Max2;
        boolean flag = true;
        while (flag == true) {
            ID++;
            try {
                Max2 = new Integer(y);
            } catch (NumberFormatException e) {
                break; }
            if (Max2 > Max1){
                Max1 = Max2;
                ID1 = ID;
                ID2 = ID;
            } else if (Max2 == Max1){
                ID2 = ID;
            }
            System.out.println("На даннный момент номера первого максимального элемента равен: " + ID1 + " ,а номер последнего равен: " + ID2);
            y = in.next();
        }
        if ((ID1 == 1) && (ID2 == 1) || (ID2 < ID1)){
            System.out.println("Есть только один максимальный элемент");
        } else {
        System.out.println("Первый максимальный элемент имеет номер - " + ID1 + "\n" + "Второй максимальный элемент имеет номер - " + ID2);
    }}
}