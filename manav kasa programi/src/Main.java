import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        double ar, el, dom, muz, pat;
        double tutar, a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5 ;
        Scanner input = new Scanner (System.in);
        System.out.print("Armut Kaç Kilo    : ");
        ar = input.nextDouble();
        System.out.print("Elma Kaç Kiklo    : ");
        el = input.nextDouble();
        System.out.print("Domates Kaç Kilo  : ");
        dom = input.nextDouble();
        System.out.print("Muz Kaç Kilo      : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        pat = input.nextDouble();
        tutar = (ar*a) + (el*e) + (dom*d) +(muz*m) + (pat*p);
        System.out.print("Toplam Tutar      : " + tutar);

    }
}