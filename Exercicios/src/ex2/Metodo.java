package ex2;

import java.util.Scanner;

public class Metodo {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite algo : ");
	        String input = scanner.nextLine();

	        int countLower = cmi(input);
	        int countUpper = cma(input);

	        if (countLower > 0 || countUpper > 0) {
	            System.out.println("A letra 'a' aparece " + countLower + " vez(es).");
	            System.out.println("A letra 'A' aparece " + countUpper + " vez(es).");
	        } else {
	            System.out.println("Não foi encontrado nenhuma letra a.");
	        }

	        scanner.close();
	    }

	    public static int cmi(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (c == 'a') {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static int cma(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (c == 'A') {
	                count++;
	            }
	        }
	        return count;
	    }
	}



