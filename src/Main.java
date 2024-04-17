import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte contador = 0;
        byte ed = 0;
        double t2 = 0;

        System.out.println("Cual es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.println("Cual es tu edad? ");
        ed = scanner.nextByte();
        for (int i = 0; i <= 7; i++) {

            System.out.println("Visitaste el apartamento hoy?: (y/n)");
            char sino = scanner.next().charAt(0);
            scanner.nextLine();

            if (sino == 'y') {
                contador++;
                t2 += t2;

                System.out.println("Por cuanto tiempo te quedaste en el edificio? (horas): ");
                t2 = scanner.nextDouble();
            }
        }

        double tiempo = t2 / contador;
        System.out.println("Visitaste el edificio " + contador + " veces esta semana");
        System.out.println("Su promedio de estadia fue de: "+tiempo);
        if (ed < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }


    }
}