import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        One a = new One();
        Two b = new Two();
        Three c = new Three();
        Four d = new Four();
        Five e = new Five();
        Six f = new Six();
        Seven g = new Seven();
        Eight h = new Eight();
        Nine i = new Nine();
        Ten j = new Ten();
        Eleven k = new Eleven();
        Twelve l = new Twelve();
        Thirteen m = new Thirteen();
        System.out.println("1 - Задание 7.133, 2 - Задание 7.134, 3 - Задание 7.135, 4 - Задание 7.136, 5 - Задание 7.137, 6 - Задание 7.138, 7 - Задание 7.139" );
        System.out.println("8 - Задание 7.140, 9 - Задание 7.141, 10 - Задание 7.142, 11 - Задание 7.143, 12 - Задание 7.144, 13 - Задание 7.145,  " );
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        if (v==1){
            a.maximus();
        } else if(v==2){
            b.kvadrat();
        } else if(v==2){
            b.kvadrat();
        }else if (v==3) {
            c.Averge();
        }else if (v==4) {
            d.Duplicate();
        }else if (v==5) {
            e.MaxMin();
        }else if (v==6) {
            f.Zero();
        }else if (v==7) {
            g.Bigger();
        }else if (v==8) {
            h.TwoMax();
        }else if (v==9) {
        }else if (v==10) {
            j.MaxLength();
        }else if (v==11) {
            k.Grops();
        }else if (v==12) {
            l.Numbers1();
        }else if (v==13) {
            m.Numbers2();
}}}
