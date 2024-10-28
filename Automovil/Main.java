import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del automóvil: ");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del automóvil: ");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese el color del automóvil: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese el cilindraje del automóvil: ");
        double cilindraje = scanner.nextDouble();
        Automovil automovil = new Automovil(marca,modelo,color,cilindraje);
        scanner.close();

        System.out.println("Informacion del Vehiculo"+"\n"+automovil.detalleAutomovil());
    }
}