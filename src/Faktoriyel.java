import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n,r;

        int combination;
        double sumKume = 1;
        double sumGroup = 1;
        double combinationSum = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        n = inp.nextInt();
        System.out.println("Sayi giriniz :");
        r = inp.nextInt();
        combination = n-r;
        for (int i = n;i > 1;i--) {
            sumKume = sumKume * i;
            System.out.println("(n)! "+sumKume);
        }
        for (int i = r;i > 1;i--) {
            sumGroup = sumGroup * i;
            System.out.println("(r)! "+sumGroup);
        }
        for (int i = combination;i > 1;i--) {
            combinationSum = combinationSum * i;
            System.out.println("(n-r)! " + combinationSum);
        }
        double sonuc;
        sonuc = sumKume / (sumGroup * combinationSum);
        System.out.println("Sonuc : "+ sonuc);
    }
}

/*
faktoriyel için bir sayı girilir
mesela 5
5*4*3*2*1
seklinde 1'e kadar gider
sum = sayi * sum
sum = sum * sayi-1

 */