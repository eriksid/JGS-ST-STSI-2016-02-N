
package cartas;

public class Cartas {
    String cartas;
    int maior = 0;
    int menor = 0;
    int contadorMe;
    int contadorMa;
    String ordem;
    String cartasArray [] = new String [5];
    public String testaOrdem(){
    cartasArray = cartas.split(" ");    
    for (int i = 0; i < 5; i++ ){
        if (Integer.parseInt(cartasArray[0]) > maior){
            maior = Integer.parseInt(cartasArray[0]);
            contadorMa ++;
            
        }else if (Integer.parseInt(cartasArray[0]) < menor){
            menor = Integer.parseInt(cartasArray[0]);
            contadorMe ++;
        }
        
    }
    
    if (contadorMa == 5){
        ordem = "C";
        
    }else if (contadorMe == 5){
        ordem = "D";
    }else{
        ordem = "N";
    }
    return ordem;
    }
    
}
