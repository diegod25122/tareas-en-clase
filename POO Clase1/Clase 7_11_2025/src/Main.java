public class Main{
    public static void main(String[] args) {
        Persona p1 = new Persona("1723456897", "Juanito", 19);
        Estudiante e1 = new Estudiante("1723456897", "Michael", 17,"ABC123");
        Docente d1 = new Docente("1723456897", "Esteban", 35, "EDO");
        p1.Imprimir();
        e1.ImprimirEstudiante();
        d1.ImprimirDocente();
    }
}