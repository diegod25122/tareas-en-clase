import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        System.out.println("MENÚ:");
        System.out.println("1 - Iniciar sesión (una vez)");
        System.out.println("2 - Tabla de multiplicar");
        System.out.println("3 - Iniciar sesión (con reintentos)");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextLine().trim();

        switch (opcion) {
            case "1": {
                String usuario = "Diego";
                String contrasenia = "Camacho";
                String user, password;

                System.out.print("Ingrese su usuario: ");
                user = sc.nextLine().trim();

                System.out.print("Ingrese una contraseña: ");
                password = sc.nextLine().trim();

                if (user.equals(usuario) && password.equals(contrasenia)) {
                    System.out.println("Acceso concedido");
                } else {
                    System.out.println("Usuario no válido");
                }
                break;
            }

            case "2": {
                int num;
                int resultado;

                System.out.print("Ingrese un número entero: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Por favor, ingrese un número válido: ");
                    sc.next(); // limpia la entrada no válida
                }
                num = sc.nextInt();
                sc.nextLine(); // limpiar el salto de línea

                for (int i = 1; i <= 10; i++) {
                    resultado = num * i;
                    System.out.println(num + " * " + i + " = " + resultado);
                }
                break;
            }

            case "3": {
                String usuario = "Diego";
                String contrasenia = "Camacho";
                String user, password;

                while (true) {
                    System.out.print("Ingrese su usuario: ");
                    user = sc.nextLine().trim();

                    System.out.print("Ingrese una contraseña: ");
                    password = sc.nextLine().trim();

                    if (user.equals(usuario) && password.equals(contrasenia)) {
                        System.out.println("Acceso concedido");
                        break;
                    } else {
                        System.out.println("Usuario no válido, intente de nuevo.");
                    }
                }
                break;
            }

            default:
                System.out.println("Opción no válida");
        }

        sc.close(); // ✅ Cerramos el Scanner UNA SOLA VEZ al final
    }
}
