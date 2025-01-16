package test_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) {
        String path = "C:\\work-station\\cursos-de-programacao\\Curso-Java-udemy\\test_file\\dados (2).xml";

        Pattern numberPattern = Pattern.compile("\\d+(\\.\\d+)?");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<Integer> days = new ArrayList<Integer>();
            List<Double> values = new ArrayList<Double>();
            
            while (line != null) {
                Matcher matcher = numberPattern.matcher(line);

                while (matcher.find()) {
                	
                	String number =  matcher.group();
                    
                    if (number.contains(".") || number.contains(",")) {
						values.add(Double.parseDouble(matcher.group()));
					} else {
						days.add(Integer.parseInt(matcher.group()));
					}
                }
                line = br.readLine();
            }
            
            FaturamentoMensal faturamentoMes = new FaturamentoMensal();
            
            for (int i = 0; i < days.size(); i++) {
				FaturamentoDiario faturamentoDia = new FaturamentoDiario(days.get(i), values.get(i));
				faturamentoMes.addDay(faturamentoDia);
			}
            faturamentoMes.media();
            faturamentoMes.Lowest();
            faturamentoMes.Biggest();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
