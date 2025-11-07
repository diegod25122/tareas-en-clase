public class OperacionMatematicas {
    private int v1 ;
    private int v2 ;
    private int v3 ;
    private int operacion;
  ;
    //constructor
    public OperacionMatematicas(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    //constructor 2
    public OperacionMatematicas(){
        v1=0;
        v2=0;
    }
    //set resta
    public void setValor1(int v1){
        this.v1=v1;
    }
    public void setValor2(int v2){
        this.v2=v2;
    }
    //get
    public int getV1() {
        return v1;
    }
    public int getV2() {
        return v2;
    }
    public int getV3() {
        return v3;
    }


}
