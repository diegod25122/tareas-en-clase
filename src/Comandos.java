import java.util.Scanner;
public class Comandos {
    public static void main(String[] args) {
        String usuario ="diegouu2512";
        String contrasenia = "251220004";
        String user,password;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        user = entrada.nextLine();
        System.out.println("Ingrese un contraseña: ");
        password = entrada.nextLine();
        //System.out.println(usuario==(usuario)); //equal para cadenas, == para numeros
        if(user.equals(usuario) && password.equals(contrasenia)){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Usuario no valido");
        }

    }
}