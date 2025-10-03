import java.util.Scanner;
public class Loginnnn {
    public static void main(String[] args) {
        String usuario ="Diego";
        String contrasenia ="Camacho";
        String user, password;
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("Ingrese su usuario: ");
            user = entrada.nextLine();
            System.out.println("Ingrese un contraseña: ");
            password = entrada.nextLine();
            //System.out.println(usuario==(usuario)); //equal para cadenas, == para numeros
            if(user.equals(usuario) && password.equals(contrasenia)){
                System.out.println("Acceso concedido");
                    break;
            }else{
                System.out.println("Usuario no valido");
            }
        }
        entrada.close();

    }
}
