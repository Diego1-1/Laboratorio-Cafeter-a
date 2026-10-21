//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la cuenta: ");
        double cuenta = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de propina (0-100): ");
        double porcentaje = sc.nextDouble();

        if (cuenta <= 0) {
            System.out.println("Error: la cuenta debe ser mayor que 0");
            return;
        }
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: el porcentaje debe estar entre 0 y 100");
            return;
        }

        double propina = cuenta * porcentaje / 100;
        double totalPagar = cuenta + propina;

        System.out.println("Propina: " + propina);
        System.out.println("Total a pagar: " + totalPagar);


        if (porcentaje > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentaje < 5) {
            System.out.println("Propina muy baja");
        }
    }
}