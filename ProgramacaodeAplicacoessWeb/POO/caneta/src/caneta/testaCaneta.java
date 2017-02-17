
package caneta;


public class testaCaneta {
 public static void main (String [] args){
     Caneta c1 = new Caneta();
     c1.cor = "Azul";
     c1.ponta = 0.5f;
     c1.tampada = false;
     c1.carga = 50;
     c1.rabiscar();
     c1.status();
     
     Caneta c2 = new Caneta();
     c2.cor = "vermelha";
     c2.ponta = 1.0f;
     c2.tampada = false;
     c2.carga = 85;
     c2.tampar();
     c2.status();
 }    
}
