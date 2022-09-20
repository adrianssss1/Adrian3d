import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double km, l;
        System.out.println("podaj liczbę przejechanych km ");
        km = klawiatura.nextDouble();

        System.out.println("podaj liczbę zużytych litrów paliwa ");
         l = klawiatura.nextDouble();

        double spalanie = km/l;
        System.out.println("Na jednym litrze paliwa przejechano  " +spalanie +"kilometrów" );








    }




}
