import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subtotal = 0;
        int precio;

        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = sc.nextInt();
            subtotal += precio;
        } while (precio != 0);

        double iva = subtotal * 0.19;
        double totalConIva = subtotal + iva;
        double descuento = 0;

        if (totalConIva > 50000) {
            descuento = totalConIva * 0.10;
        }
        double totalFinal = totalConIva - descuento;

        System.out.println("Subtotal: $" + String.format("%.0f", (double) subtotal));
        System.out.println("IVA (19%): $" + String.format("%.0f", iva));
        if (descuento > 0) {
            System.out.println("Total con IVA: $" + String.format("%.0f", totalConIva));
            System.out.println("Descuento (10%): $" + String.format("%.0f", descuento));
            System.out.println("Total a pagar: $" + String.format("%.0f", totalFinal));
        } else {
            System.out.println("Total: $" + String.format("%.0f", totalFinal));
        }
    }
}