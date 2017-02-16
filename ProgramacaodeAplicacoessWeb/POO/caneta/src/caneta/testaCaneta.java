
package caneta;


public class testaCaneta {
 public static void main (String [] args){
     Caneta c1 = new Caneta();
     c1.cor = "Azul";
     c1.ponta = 0.5f;
     c1.tampada = false;
     c1.rabiscar();
     
     Caneta c2 = new Caneta();
     c2.cor = "vermelha";
     c2.ponta = 1.0f;
     c2.tampada = false;
     c2.tampar();
 }    
}
