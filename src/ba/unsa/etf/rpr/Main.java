package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
        int suma=0;
        int pom=broj;
        do {
            int cifra=pom%10;
            suma+=cifra;
            pom=pom/10;

        }while(pom!=0);
        return suma;
    }


    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n=in.nextInt();

        for(int i=1; i<n; i++) {
            if(i%sumaCifara(i)==0) {
                System.out.println(i);
            }
        }
    }
}
