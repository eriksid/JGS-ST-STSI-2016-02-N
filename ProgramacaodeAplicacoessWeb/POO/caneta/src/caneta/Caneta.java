
package caneta;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    public void rabiscar (){
        if (tampada){
            System.out.println("Erro!");
            
        }else {
            System.out.println("Rabiscando");
        }
    }
    public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
}
