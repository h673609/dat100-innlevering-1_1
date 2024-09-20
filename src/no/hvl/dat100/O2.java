package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static double beregnTrinnskatt(double bruttoinntekt) {
		// Definer terskler og satser for trinnskatt 2024
		double[] terskler = { 208050, 297900, 643800, 969200, 2000000 };
		double[] satser = { 0.017, 0.04, 0.134, 0.164, 0.174 };

		double trinnskatt = 0;

		// Beregn trinnskatt for hvert trinn
		if (bruttoinntekt > terskler[4]) {
			trinnskatt += (bruttoinntekt - terskler[4]) * satser[4];
			bruttoinntekt = terskler[4];
		}
		if (bruttoinntekt > terskler[3]) {
			trinnskatt += (bruttoinntekt - terskler[3]) * satser[3];
			bruttoinntekt = terskler[3];
		}
		if (bruttoinntekt > terskler[2]) {
			trinnskatt += (bruttoinntekt - terskler[2]) * satser[2];
			bruttoinntekt = terskler[2];
		}
		if (bruttoinntekt > terskler[1]) {
			trinnskatt += (bruttoinntekt - terskler[1]) * satser[1];
			bruttoinntekt = terskler[1];
		}
		if (bruttoinntekt > terskler[0]) {
			trinnskatt += (bruttoinntekt - terskler[0]) * satser[0];
		}

		return trinnskatt;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Oppgi bruttoinntekt: ");
		double bruttoinntekt = scanner.nextDouble();

		double trinnskatt = beregnTrinnskatt(bruttoinntekt);
		System.out.printf("Trinnskatt å betale: %.2f kr%n", trinnskatt);

		scanner.close();
	}
}