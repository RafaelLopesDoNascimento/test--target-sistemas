package test_4;

public class Program {

	public static void main(String[] args) {
		double total = 0.0;
		
		Cities sp = new Cities(67836.43);
		Cities rj = new Cities(36678.66);
		Cities mg = new Cities(29229.88);
		Cities es = new Cities(27165.48);
		Cities others = new Cities(19849.53);
		
		total = sp.getValue() + rj.getValue() + mg.getValue() + es.getValue() + others.getValue();
		
		System.out.printf("total: %.2f%n", total);
		System.out.printf("SP: %.2f%n", sp.percent(total));
		System.out.printf("RJ: %.2f%n", rj.percent(total));
		System.out.printf("MG: %.2f%n", mg.percent(total));
		System.out.printf("ES: %.2f%n", es.percent(total));
		System.out.printf("Others: %.2f%n", others.percent(total));
	}

}
