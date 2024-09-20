package no.hvl.dat100;

import java.util.Scanner;

public class Class_O3 {
	 public static long beregnFakultet(int n) {
	        long fakultet = 1; // Bruker long for å håndtere store tall
	        for (int i = 1; i <= n; i++) {
	            fakultet *= i;
	        }
	        return fakultet;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Les inn et positivt heltall fra brukeren
	        System.out.print("Oppgi et heltall n > 0: ");
	        int n = scanner.nextInt();

	        // Sjekker at n er større enn 0
	        if (n > 0) {
	            long resultat = beregnFakultet(n);
	            System.out.println("Verdien av " + n + "! er: " + resultat);
	        } else {
	            System.out.println("Feil: n må være større enn 0.");
	        }

	        scanner.close();
	    }
	}