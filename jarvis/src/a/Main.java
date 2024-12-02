package a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner xr = new Scanner(System.in);
			System.out.println(" Digite sua nota da NP1? ");
			double NP1 = xr.nextDouble();
			System.out.println("Digite sua segunda nota da NP2");
			double NP2 = xr.nextDouble();
			double media = (NP1 + NP2) / 2;
			if (media >= 7) {
				System.out.println("Você foi aprovado com a média " + media);
			} else {
				double NotaExame = 14 - (NP1 + NP2);
				System.out.println("Você precisa tirar " + NotaExame + " para passar no exame ");
			}
			 


		xr.close();
	}
}