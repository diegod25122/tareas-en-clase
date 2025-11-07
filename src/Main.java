public class Main{
    public static void main(String[] args) {
        OperacionMatematicas suma = new OperacionMatematicas(15,20,25);
        int rRuma = suma.getV1() + suma.getV2() + suma.getV3();
            System.out.println("La suma es:" +rRuma);

        System.out.println("----------------------------------------------------");
        OperacionMatematicas resta = new OperacionMatematicas();
        resta.setValor1(50);
        resta.setValor2(20);
        int rResta= resta.getV1() - resta.getV2() - resta.getV3();
        System.out.println("La suma es:" +rResta);
    }
}