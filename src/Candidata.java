class DatoInvalidoException extends Exception{
    public DatoInvalidoException(String mensaje){
        super(mensaje);
    }
}
abstract class Candidata {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String distrito;
    protected double puntajeJurado;
    //constructor
    public Candidata (int id, String nombre, int edad, String distrito, double puntajeJurado)throws DatoInvalidoException{
        //o	Lanzarla si nombre vacío, edad <= 0 o puntajes negativos, etc
        if (id<=0){
            throw new DatoInvalidoException("El id debe ser mayor o igual a 0");
        }
        if (nombre==null || nombre.trim().isEmpty()){
            throw new DatoInvalidoException("El nombre no puede estar vacio.");
        }
        if (edad<16 || edad >90){
            throw new DatoInvalidoException("Edad invalida.");
        }
        if (distrito==null || distrito.trim().isEmpty()){
            throw new DatoInvalidoException("El distrito no puede estar vacio.");
        }
        if (puntajeJurado<0 || puntajeJurado>100 ){
            throw new DatoInvalidoException("Puntaje invalido.");
        }
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.distrito=distrito;
        this.puntajeJurado=puntajeJurado;
    }

    // getters && setters
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getDistrito(){
        return distrito;
    }
    public double getPuntajeJurado(){
        return puntajeJurado;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setDistrito(String distrito){
        this.distrito=distrito;
    }
    public void setPuntajeJurado(double puntajeJurado){
        this.puntajeJurado=puntajeJurado;
    }
    //metodo abstracto mostrar detalles
    public abstract void mostrarDetalles();
}

// creamos dos clases hijas que hereden
class CandidataEstudiante extends Candidata{
    protected String Universidad;
    protected String carrera;
    public CandidataEstudiante(int id, String nombre, int edad, String distrito, double puntajeJurado,String Universidad, String carrera)throws DatoInvalidoException{
        super(id,nombre,edad,distrito,puntajeJurado);
        this.Universidad=Universidad;
        this.carrera=carrera;
    }
    //sobreescribimos el metodo
    @Override
    public void mostrarDetalles(){
        System.out.println("=== Candidata Estudiante ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Distrito: " + getDistrito());
        System.out.println("Puntaje del Jurado: " + getPuntajeJurado());
        System.out.println("Universidad: " + Universidad);
        System.out.println("Carrera: " + carrera);
    }
}
// clase abstracta candidataProfesional
class CandidataProfesional extends Candidata{
    protected String profesion;
    protected int aniosExperiencia;
    public CandidataProfesional(int id, String nombre, int edad,
                                String distrito, double puntajeJurado, String profesion, int aniosExperiencia)throws DatoInvalidoException{
        super(id,nombre,edad,distrito,puntajeJurado);
        this.profesion=profesion;
        this.aniosExperiencia=aniosExperiencia;
    }
    //sobreescribimos
    @Override
    public void mostrarDetalles(){
        System.out.println("=== Candidata Profesional ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Distrito: " + getDistrito());
        System.out.println("Puntaje del Jurado: " + getPuntajeJurado());
        System.out.println("Profesion: "+profesion);
        System.out.println("Años de experiencia: "+aniosExperiencia);
    }
}
