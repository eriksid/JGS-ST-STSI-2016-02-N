import java.util.Scanner;

public class TestaSalario {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		Salario salJoao = new Salario();
		System.out.println("Digite a Quantidade de horas trabalhadas:");
		salJoao.setQtdHorasTrabalhadas(Double.parseDouble(teclado.nextLine()) );
		System.out.println("digite o valor da hora:");
		salJoao.setValorHora(Double.parseDouble(teclado.nextLine()) );
		System.out.println("Digite a Quantidade de Dependentes");
		salJoao.setnDependentes(Integer.parseInt(teclado.nextLine()) );
		System.out.println("Seu Salario liquiquido é " + salJoao.calcularSalLiquido());
		
	  

	}

}
