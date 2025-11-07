public class Estudiante {
    //atributos
    private String codigo = "A001";
    private String nombre = "Juan Perez";
    private String carrera = "Desarrollo de Software ";
    private int semestre = 3;

    //metodos
    //mostrar
    //et leer y set modificaer
    public void setNombre(String nuevoNombre, int nuevoSemestre) {
        this.nombre = nuevoNombre;
        this.semestre = nuevoSemestre;
    }

    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                '}';
    }
    //aplique sobrecarga al metodo saludar}

    public void Saludar(){
        //no retorna
       // System.out.println("Hola q tal");
    }
    public void Saludar(String nombre){
        System.out.println("Hola q tal "+nombre);
    }
    public void Saludar(String nombre, int semestre){
        System.out.println("Nombre "+nombre+", cursa "+semestre+" semestre");
    }
}
