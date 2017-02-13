
public class Salario {
	private double qtdHorasTrabalhadas;
	private double valorHora;
	private int nDependentes;
	private double salBruto;
	private double descInss;
	private double descIr;
	private double salLiquido;
    
    public double calcularSalBruto(){
    	
    	return this.salBruto = this.qtdHorasTrabalhadas * this.valorHora + (50 * this.nDependentes);
    	
    }
    
    public double calcularDescInss(){
    	
    	if (this.salBruto <= 1000) {
    		
    		this.descInss = this.salBruto * 8.5/100;
    		
    	}else {
    		this.descInss =  this.salBruto * 9/100;
    		
    	}
    	
    	return this.descInss;
    }
    
    public double calcularDescIr(){
    	
    	if (this.salBruto <= 500){
    		this.descIr = 0;
    	}else if  (this.salBruto >500 && this.salBruto <=1000 ){
    		this.descIr = this.salBruto * 5/100;
    	}else{
    		this.descIr = this.salBruto * 7/100;
    		
    	}
    	
    	return this.descIr;
    }

    public double calcularSalLiquido() {
    	double sbruto =this.calcularSalBruto();
    	double inss = this.calcularDescInss();
    	double ir = this.calcularDescIr();
    	
    	return sbruto - inss - ir;
    }
    
	public double getQtdHorasTrabalhadas() {
		return qtdHorasTrabalhadas;
	}
	public void setQtdHorasTrabalhadas(double qtdHorasTrabalhadas) {
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getnDependentes() {
		return nDependentes;
	}
	public void setnDependentes(int nDependentes) {
		this.nDependentes = nDependentes;
	}
	public double getSalLiquido() {
		return salLiquido;
	}
	public void setSalLiquido(double salLiquido) {
		this.salLiquido = salLiquido;
	}


}
