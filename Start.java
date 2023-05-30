package principale;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("inserisci valore : ");
        int num = Integer.parseInt(scan.nextLine());


        double valore[] = new double[num];
        for (int i = 0; i < valore.length; i++) {
            System.out.print("inserisci v." + (i + 1) + " : ");
            valore[i] = scan.nextDouble(); 
        }

        //Now display one by one
        for (int i = 0; i < valore.length; i++) {
            System.out.print("valore è  " + (i + 1) + " : ");
            System.out.print(valore[i] + "\n");
        }

/*Scanner a = new Scanner(System.in);
		System.out.println("inserisci la posizione");
		
		Scanner b = new Scanner (System.in);
		
		int [] numeri = new int[5];
		
		
		//String[] valori= {"mela","pera","banane","ciliegie","uva"};


		
		System.out.println(numeri.length);
		for(int i=0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}*/
	}

}
