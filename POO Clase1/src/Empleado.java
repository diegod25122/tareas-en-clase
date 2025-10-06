import java.util.Scanner;
public class Empleado {
    String nombre;
    String cargo;
    Double salario;
    String ingreso ;
    //metodo constructor
    public Empleado(String nombre, String cargo, Double salario, String ingreso){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.ingreso = ingreso;
    }
    //mostrar en pantalla
    void mostrar(){
        System.out.println(nombre+ "con el cargo de "+cargo+" tiene un salario de $"+salario+ " y su fecha de ingreso fue: "+ingreso);
    }
    //objetos
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer empleado empleado: ");
        String nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el cargo del empleado: ");
        String cargo = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        Double salario = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el ingreso del empleado: ");
        String ingreso = sc.nextLine();
        sc.nextLine();
        Empleado emp1 = new Empleado(nombre, cargo, salario, ingreso);

        System.out.println("Ingrese el nombre del segundo empleado empleado: ");
        String nombre2 = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado: ");
        String cargo2 = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        Double salario2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el ingreso del empleado: ");
        String ingreso2 = sc.nextLine();
        sc.nextLine();
        Empleado emp2 = new Empleado(nombre2, cargo2, salario2, ingreso2);

        System.out.println("Ingrese el nombre del tercer empleado empleado: ");
        String nombre3 = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado: ");
        String cargo3 = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        Double salario3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el ingreso del empleado: ");
        String ingreso3 = sc.nextLine();
        sc.nextLine();
        Empleado emp3 = new Empleado(nombre3, cargo3, salario3, ingreso3);
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
    }
}
