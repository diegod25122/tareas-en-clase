public class Main2 {
    public static void main(String[] args) {
        //mostramos las reglas generales
        SolicitanteBeca.mostrarReglasBeca();
        //CREAMOS SOLICITANTE
        SolicitanteBeca s1 = new SolicitanteBeca("Diego Camacho", "172638611", 9.0,850.0, true);

        //generamos resultado de la beca
        s1.generarResultados();
    }
}
