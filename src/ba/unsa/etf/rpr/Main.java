package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int rez = 0;
        while(n != 0) {
            rez += n%10;
            n /= 10;
        }
        return rez;
    }

    public static void main(String[] args) {
        System.out.print("Unesite n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            if(i % sumaCifara(i) == 0)System.out.print(i + " ");
/*
        char [] ciz = {'-','\\','|','/'};
        for(int i = 0;; i++) {
            System.out.printf("\r%c", ciz[i % 4]);
            Thread.sleep(250);
        }
*/
    }
}