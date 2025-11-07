public class Area {
    public double calcularArea(double lado){
        return lado*lado;
    }
    public double calcularArea(double baseMayor, double baseMenor, double altura){
        return ((baseMayor+baseMenor)*altura)/2;
    }
    public double calcularArea(double aR, double bR){
        return bR*aR;
    }
}
