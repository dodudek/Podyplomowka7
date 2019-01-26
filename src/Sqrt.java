import java.util.Scanner;
import java.util.InputMismatchException;

public class Sqrt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Pdaj liczbę, z której chcesz obliczyć pierwiastek");
            double liczba = scanner.nextDouble();

            if (liczba <0){
                throw new IllegalArgumentException();
            }

            System.out.println("Wybrana przez Ciebie liczba to: " + liczba + " ,pierwiastek z " + liczba + " to:" + Math.sqrt(liczba));
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            System.err.println("Wyjatek! Podałeś liczbę ujemną!");
        }
        catch (InputMismatchException ime) {
            ime.printStackTrace();
            System.err.println("Wyjatek! Podałeś liczbę w błędnym formacie!");
        }
        scanner.close();
    }
}
