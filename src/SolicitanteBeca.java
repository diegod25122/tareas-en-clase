//package ec.gob.beca.modelo;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SolicitanteBeca {
    private String nombreCompleto;
    private String cedula;
    private double promedio;
    private double ingresosFamiliares;
    private boolean tieneRecomendacion;

    //constructor
    public SolicitanteBeca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del completo: ");
        nombreCompleto = sc.nextLine();
        System.out.println("Ingrese la cedula: ");
        cedula = sc.nextLine();
        System.out.println("Ingrese su promedio: ");
        promedio = sc.nextDouble();
        System.out.println("Ingrese sus ingresos familiares: ");
        ingresosFamiliares = sc.nextDouble();
        System.out.println("Tiene recomendacion (true/false): ");
        tieneRecomendacion = sc.nextBoolean();
        setNombreCompleto(nombreCompleto);
        setCedula(cedula);
        setPromedio(promedio);
        setingresosFamiliares(ingresosFamiliares);
        setTieneRecomendacion(tieneRecomendacion);
    }
    //metodos
    public String getNombreCompleto() {

        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto){
        if(nombreCompleto!=null && !nombreCompleto.trim().isEmpty()){
            this.nombreCompleto = nombreCompleto;
        }else{
            System.out.println("El nombre no puede estar vacio");
        }
    }
    public String cedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        if(cedula!=null && !cedula.trim().isEmpty() && cedula.length()==10){
            this.cedula = cedula;
        }else{
            System.out.println("Cedula invalida");
        }
    }
    public double getpromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        if(promedio>=0.0 && promedio<=10.0){
            this.promedio = promedio;
        }else{
            System.out.println("Promedio invalido");
        }
    }
    public double getingresosFamiliares(){
        return ingresosFamiliares;
    }
    public void setingresosFamiliares(double ingresosFamiliares){
        if(ingresosFamiliares >= 0){
            this.ingresosFamiliares = ingresosFamiliares;
        }else{
            System.out.println("Ingresos invalidos");
        }
    }
    public boolean isTieneRecomendacion() {
        return tieneRecomendacion;
    }
    public void setTieneRecomendacion(boolean tieneRecomendacion) {
        this.tieneRecomendacion = tieneRecomendacion;
    }
    //beca aprobada
    public boolean becaAprobada(){
        return (promedio >= 8 && ingresosFamiliares <1000 && tieneRecomendacion);
    }
    //genera un mensaje con resultados y motivos
    public void generarResultados(){
        if(becaAprobada()){
            System.out.println("Beca aprobada para "+nombreCompleto);
        }else{
            System.out.println("Beca rechazada para "+nombreCompleto);
            if(promedio < 8.0)
                System.out.println("Motivo promedio insuficiente");
            if(ingresosFamiliares >= 1000)
                System.out.println("Motivo ingresos familiares superiores a 1000");
            if(!tieneRecomendacion)
                System.out.println("Motivo falta de recomendacion");
        }
    }
    //muestra datos de estudiante
    @Override
    public String toString() {
        return "SolicitanteBeca{"+
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula='" + cedula + '\'' +
                ", promedio=" + promedio +
                ", ingresosFamiliares=" + ingresosFamiliares +
                ", tieneRecomendacion=" + tieneRecomendacion +
                '}';
    }
    //Metodostatico imprime reglas de las beca
    public static void mostrarReglasBeca(){
        System.out.println("***Reglas Beca***");
        System.out.println("- Promedio minimo de 8.0");
        System.out.println("- Ingresos familiares menores a 1000");
        System.out.println("- Contar con carta de recomendacion");
        System.out.println("====================================");
    }

    //sobrecarga cacularHOras
    //sin parametros
    public int calcularHorasEstudio(){
        if(promedio >= 9.5) {
            return 1;
        }else if (promedio >=8.0){
            return 2;
        }else{
            return 3;
        }
    }
    //con parametro adicional
    public int calcularHorasEstudio(int horasExtra){
        return calcularHorasEstudio() + horasExtra;
    }
}
