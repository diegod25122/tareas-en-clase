import java.util.Scanner;
public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int dorsal;

    //metodo constructor
    public Jugador(String nombre, String posicion, int edad, int dorsal){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.dorsal = dorsal;
    }
    //imprimimos
    void mostrar(){
        System.out.println(nombre+ ", juega en la posicion de "+posicion+", tiene "+edad+" años de edad y juega con el dorsal "+dorsal);
    }
    //los objetos
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Jugador objeto1 = new Jugador("Lionel Messi", "Delantero", 38, 10);
        Jugador objeto2 = new Jugador("Cristiano Ronaldo","Delantero", 40,7);
        objeto1.mostrar();
        objeto2.mostrar();
        System.out.println("Ingrese los datos del tercer jugador: \n");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Posicion: ");
        String posicion = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Dorsal: ");
        int dorsal = sc.nextInt();
        //creamos el 3 jugador
        Jugador objeto3 = new Jugador(nombre, posicion, edad, dorsal);
        objeto3.mostrar();
    }
}

