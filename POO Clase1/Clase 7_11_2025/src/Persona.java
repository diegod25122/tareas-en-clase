public class Persona {
    String cedula;
    String nombre;
    int edad;

    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void Imprimir() {
        System.out.println("========== Datos Personales ==========");
        System.out.println("La cedula es: "+cedula);
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
    class Estudiante extends Persona {         //con extends sabemos que es clase hija ademas despues del extends va
    //la clase padre
        String codigo;
        public Estudiante(String cedula, String nombre, int edad, String codigo) {
            super(cedula, nombre, edad); // super llama al metodo constructor de la clase padre y solo se inicializa el atributo agregado en la clase hija
            this.codigo = codigo;
        }
                       // @Overide con override nos dice que estamos sobrescribiendo
        public void ImprimirEstudiante() {
            super.Imprimir();
            System.out.println("El codigo del estudiante es: "+codigo);
            System.out.println("======================================================");
        }
    }
    class Docente extends Persona {
        String materia;
        public Docente(String cedula, String nombre, int edad, String materia) {
            super(cedula, nombre, edad);
            this.materia = materia;
        }
        public void ImprimirDocente() {
            super.Imprimir();
            System.out.println("La materia que ejerce es: "+materia);
            System.out.println("======================================================");
        }

    }
