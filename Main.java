import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario el tamaño del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = leer.nextInt();

        // Crear el arreglo de productos
        String[] productos = new String[n];

        // Pedir al usuario los nombres de los productos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            productos[i] = leer.next();
        }

        // Pedir al usuario el producto a buscar
        System.out.print("Ingresa el producto que deseas buscar: ");
        String productoBuscado = leer.next();

        // Buscar el producto en el arreglo usando el método insertion
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (productos[i].equalsIgnoreCase(productoBuscado)) {
                encontrado = true;
                break;
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El producto \"" + productoBuscado + "\" fue encontrado.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no fue encontrado.");
        }
    }
}
