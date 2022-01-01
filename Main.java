import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       // değikenleri ve fiyatları tanımla
        double kilo, toplam = 0;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kulanıcıya hangi meyve veya sebzeden kaç kilo aldığını sor
        System.out.print("Kaç kilo armut : ");
        kilo = inp.nextInt();
        toplam = toplam +  (armut * kilo);
        System.out.print("Kaç kilo elma : ");
        kilo = inp.nextInt();
        toplam = toplam + (elma * kilo);
        System.out.print("Kaç kilo domates : ");
        kilo = inp.nextInt();
        toplam = toplam + (domates * kilo);
        System.out.print("Kaç kilo muz : ");
        kilo = inp.nextInt();
        toplam = toplam + (muz * kilo);
        System.out.print("Kaç kilo patlıcan : ");
        kilo = inp.nextInt();
        toplam = toplam + (patlıcan * kilo);

        // Toplamı ekrana yazıdr
        System.out.println("Toplam alışveriş tutarı : " + toplam);

    }
}