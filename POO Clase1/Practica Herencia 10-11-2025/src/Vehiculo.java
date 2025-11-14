public abstract class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String propietario;

    //Constructor
    public Vehiculo(String placa, String marca, int anio, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario = propietario;
    }

    //Getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public abstract double calcularValorMatricula();
}
class Auto extends Vehiculo{
    int  anioMatricula;
    public Auto(String placa, String marca, int anio, String propietario, int anioMatricula) {
        super(placa, marca, anio, propietario);
        this.anioMatricula = anioMatricula;
    }
    @Override
    public double calcularValorMatricula() {
        int antiguedad = 2025 - anioMatricula;
        return 300 - (antiguedad * 10);
    }
}
class Moto extends Vehiculo{
    int  anioMatricula;
    public Moto(String placa, String marca, int anio, String propietario, int anioMatricula) {
        super(placa, marca, anio, propietario);
        this.anioMatricula = anioMatricula;
    }
    @Override
    public double calcularValorMatricula() {
        int antiguedad = 2025 - anioMatricula;
        return 200- (antiguedad * 10);
    }
}
class Camion extends Vehiculo{
    int  anioMatricula;
    public Camion(String placa, String marca, int anio, String propietario, int anioMatricula) {
        super(placa, marca, anio, propietario);
        this.anioMatricula = anioMatricula;
    }
//hola
    @Override
    public double calcularValorMatricula() {
        int antiguedad = 2025 - anioMatricula;
        return 700- (antiguedad*10);
    }
}