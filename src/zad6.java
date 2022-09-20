public class zad6 {
    public static void main(String[] args) {
        double pom1, pom2, pom3, pom4;
        double dlugosc, szerokosc;

        dlugosc = 3;
        szerokosc = 4;
        pom1 = dlugosc * szerokosc;

        dlugosc = 3;
        szerokosc = 4;
        pom2 = dlugosc * szerokosc;

        dlugosc = 2;
        szerokosc = 3;
        pom3 = dlugosc * szerokosc;

        dlugosc = 2;
        szerokosc = 2;
        pom4 = dlugosc * szerokosc;

        System.out.println(" powierzchnia pokoju 1 " + pom1);
        System.out.println(" powierzchnia pokoju 2 " + pom2);
        System.out.println(" powierzchnia pokoju 3 " + pom3);
        System.out.println(" powierzchnia pokoju 4 " + pom4);

        double mieszkanie = pom1 + pom2 + pom3 + pom4;

        System.out.println(" powierzchnia mieszkania wynosi " + mieszkanie);

        double powierzchnia = mieszkanie / 4;
        System.out.println(" powierzchnia mieszkania na 1 osobę wynosi " +powierzchnia);


    }
}


