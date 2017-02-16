
package cartas;

import java.util.Scanner;

public class TestaCartas {
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        Cartas c1 = new Cartas();
        System.out.println("Digite 5 cartas 1 ...13 com um espaço para separar");
        c1.cartas = teclado.nextLine();
        System.out.println(c1.testaOrdem());
        
    }
}
