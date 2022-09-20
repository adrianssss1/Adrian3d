import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double ciastka;
        System.out.println("podaj liczbe zjedzonych ciastek");
        ciastka= klawiatura.nextDouble();

        double ciastko = 300/4 ;


        double kalorie = ciastka * ciastko;



        System.out.println("w tej ilości ciastek zjadłeś " + kalorie+ "kalorii");










    }

}
