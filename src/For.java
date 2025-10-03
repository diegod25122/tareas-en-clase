import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        int num;
        int resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = entrada.nextInt();
        for(int i = 1; i<= 10; i++){
            resultado = num * i;
            System.out.println(+num+" * "+i+" = "+resultado);
        }
    }
//xd
}
