package test_4;

public class Program {

	public static void main(String[] args) {
		double total = 0.0;
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double others = 19849.53;
		
		total = sp + rj + mg + es + others;
		
		System.out.printf("total: %.2f%n", total);
		System.out.printf("SP: %.2f%n", ((sp * 100) / total));
		System.out.printf("RJ: %.2f%n", ((rj * 100) / total));
		System.out.printf("MG: %.2f%n", ((mg * 100) / total));
		System.out.printf("ES: %.2f%n", ((es * 100) / total));
		System.out.printf("Others: %.2f%n", ((others * 100) / total));
	}

}
