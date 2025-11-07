import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //instancia
        Area a = new Area();
        System.out.println("******** Menu ********");
        System.out.println("1. Calcular Area cuadrado");
        System.out.println("2. Calcular Area rectangulo");
        System.out.println("3. Calcular Area Trapecio");
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el lado del cuadrado: ");
            double lado = sc.nextDouble();
            System.out.println("El area del cuadrado es: "+a.calcularArea(lado));
        }else if(opcion == 2) {
            System.out.println("Ingrese la base del rectangulo: ");
            double lado = sc.nextDouble();
            System.out.println("Ingrese la altura del rectangulo: ");
            double altura = sc.nextDouble();
            System.out.println("El area del rectangulo es: "+a.calcularArea(lado, altura));
        }else if(opcion == 3) {
            System.out.println("Ingrese la base mayor del Trapecio: ");
            double baseMayor = sc.nextDouble();
            System.out.println("Ingrese la base menor del Trapecio: ");
            double baseMenor = sc.nextDouble();
            System.out.println("Ingrese la altura del Trapecio: ");
            double altura = sc.nextDouble();
            System.out.println("El area del trapecio es: "+a.calcularArea(baseMayor, baseMenor, altura));
        }else{
            System.out.println("Opcion no valida");
        }
    }
}
