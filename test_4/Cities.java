package test_4;

public class Cities {
	private Double value;

	public Cities(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double percent(Double total) {
		return (value * 100)/total;
	}
	
	
}
