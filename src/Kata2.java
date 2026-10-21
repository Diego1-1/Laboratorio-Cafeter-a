import java.util.Scanner;

public class Kata2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la bebida: ");
        String bebida = sc.nextLine();


        System.out.print("Temperatura en grados celsius: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 60) {
            System.out.println( bebida + ": Caliente");
        } else if (temperatura >= 30 || temperatura <= 60)
            System.out.println( bebida + ": Templada");
        else if (temperatura < 30) {
            System.out.println(bebida + ": Fria");
        }
    }
}
