/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUXX
 */
public class PrimeNum {
    /**
     * ham kiem tra a co phai la nguyen to hay khong
     * @param a
     * @return 
     */
    boolean check(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //hien thi tong cac so nguyen to tu 5 den 100
    public static void main(String[] args) {
        PrimeNum pr = new PrimeNum();
        int sum = 0;
        System.out.println(Math.sqrt(16));
        System.out.println("Cac so nguyen to: ");
        for (int i = 5; i <= 100; i++) {
            if(pr.check(i)){
                System.out.print(i + "\t");
                sum += i;
            }

        }
        System.out.println("\nSum: " + sum);
    }
}
