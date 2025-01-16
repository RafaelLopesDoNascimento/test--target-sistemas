package test_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        List<Integer> fibonacci = new ArrayList<>();
        
        fibonacci.add(0);
        fibonacci.add(1);
        
        System.out.println("Digite um valor:");
        int value = sc.nextInt();
        
        boolean stop = false;
        int position1 = 0;
        int position2 = 1;
        
        while (!stop) {
            int nextToAdd = fibonacci.get(position1) + fibonacci.get(position2);
            fibonacci.add(nextToAdd);

            position1 += 1;
            position2 += 1;

            if (nextToAdd >= value) {
                stop = true;
                if (nextToAdd == value) {
                    System.out.println("Está dentro!");
                    System.out.println(value + " | " + nextToAdd);
                } else {
                    System.out.println("Não está na sequência.");
                }
            }
        }

        System.out.println("Sequência de Fibonacci gerada: " + fibonacci);
    }
}
