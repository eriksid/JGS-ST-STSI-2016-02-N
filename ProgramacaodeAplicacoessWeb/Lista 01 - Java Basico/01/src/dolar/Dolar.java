package dolar;

public class Dolar {
 private double valorReais;
 private double valorDolar;
public double getValorReais() {
	return valorReais;
}
public void setValorReais(double valorReais) {
	this.valorReais = valorReais;
}
public double getValorDolar() {
	return valorDolar;
}
public void setValorDolar(double valorDolar) {
	this.valorDolar = valorDolar;
}
 public void converterEmReais(String valorDolar){
	 this.valorReais = Double.parseDouble(valorDolar) / 3.12;
	 
 }

 
}
