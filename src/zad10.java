import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
Scanner klawiatura = new Scanner(System.in);
        double wartość;
        System.out.println("podaj wartość");
        wartość = klawiatura.nextDouble();
        klawiatura.nextLine();

        double nettoStanowy =wartość - (wartość*0.04);
        System.out.println(nettoStanowy);
        double nettoLokalny =wartość - (wartość*0.03);
        System.out.println(nettoLokalny);












    }



}
