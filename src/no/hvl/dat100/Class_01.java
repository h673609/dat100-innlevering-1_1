package no.hvl.dat100;

import static java.lang.Integer.*;

import java.util.Scanner;

public class Class_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	        // Leser inn poengsum fra brukeren
	        System.out.print("Skriv inn poengsummen (0-100): ");
	        int poengsum = scanner.nextInt();
       
        char karakter;
        if (poengsum >= 90 && poengsum <= 100) {
            karakter = 'A';
        } else if (poengsum >= 90 && poengsum < 101) {
            karakter = 'B';
        } else if (poengsum >= 80 && poengsum < 90) {
            karakter = 'C';
        } else if (poengsum >= 50 && poengsum < 80) {
            karakter = 'D';
        } else if (poengsum >= 40 && poengsum < 50) {
            karakter = 'E';
        } else if (poengsum >= 0 && poengsum < 40) {
            karakter = 'F';
        } else {
            System.out.println("Ugyldig poengsum! Vennligst oppgi et tall mellom 0 og 100.");
            scanner.close();
            return;
        }

        // Skriver ut resultatet
        System.out.println("Karakteren din er: " + karakter);

        scanner.close();
    }
}