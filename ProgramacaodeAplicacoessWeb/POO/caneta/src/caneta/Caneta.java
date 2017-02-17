
package caneta;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    public void rabiscar (){
        if (tampada){
            System.out.println("Erro! não posso rabiscar");
            
        }else {
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Uma coaneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("a ponta é de: " + this.ponta);
        System.out.println("com a carga de: " + this.carga + "%" );
}
}
