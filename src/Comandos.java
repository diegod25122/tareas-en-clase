import java.util.Scanner;

public class Comandos {
    public static void main(String[] args) {
        String usuario ="Diego";
        String contrasenia ="Camacho";
        String user, password;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        user = entrada.nextLine().trim();

        System.out.print("Ingrese una contraseña: ");
        password = entrada.nextLine().trim();


        if (user.equals(usuario) && password.equals(contrasenia)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Usuario no válido");
        }

        entrada.close();
    }
}
