package test_3;

import java.util.ArrayList;
import java.util.List;

public class FaturamentoMensal {
	private List<FaturamentoDiario> faturas = new ArrayList<FaturamentoDiario>();;
	
	public FaturamentoMensal() {
		
	}

	public FaturamentoMensal(List<FaturamentoDiario> faturas) {
		this.faturas = faturas;
	}

	public List<FaturamentoDiario> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<FaturamentoDiario> faturas) {
		this.faturas = faturas;
	}
	
	public void addDay(FaturamentoDiario faturamentoDia) {
		faturas.add(faturamentoDia);
	}
	
	public void media() {
	    double valueTotal = 0.0;
	    int count = 0; 

	    for (int i = 0; i < faturas.size(); i++) {
			if (faturas.get(i).getValue() != 0.0) {
				valueTotal += faturas.get(i).getValue();
				count += 1;
			} else {
				
			}
		}
	    
	    System.out.printf("Total: %.2f%n", valueTotal);
	    System.out.println("Dias utéis: " + count);
	    System.out.printf("Media: %.2f%n", (valueTotal/count));
	    
	    
	    for (int i = 0; i < faturas.size(); i++) {
			if (faturas.get(i).getValue() >= valueTotal/count) {
				System.out.printf("Acima da media: %.2f%n", faturas.get(i).getValue());
			} 
		}
	
	}
	
	public void Lowest() {
		double lowValue = faturas.get(0).getValue();
		
		for (FaturamentoDiario faturamentoDiario : faturas) {
			if (lowValue > faturamentoDiario.getValue() && faturamentoDiario.getValue() != 0.0) {
				lowValue = faturamentoDiario.getValue();
			} 
		}
		System.out.printf("Lowest: %.2f%n", lowValue);
	}
	
	public void Biggest() {
		double bigValue = faturas.get(0).getValue();
		
		for (FaturamentoDiario faturamentoDiario : faturas) {
			if (bigValue < faturamentoDiario.getValue()) {
				bigValue = faturamentoDiario.getValue();
			} 
		}
		System.out.printf("Biggest: %.2f%n", bigValue);
	}
}