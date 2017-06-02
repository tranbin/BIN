
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUXX
 */
public class Maximum {
    //nhap n so nguyen, hien thi gia tri lon nhat
    public static void main(String[] args) {
        int n, a, max = -200000;
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("a: ");
            a = sc.nextInt();
            if(a > max)
                max = a;
        }
        System.out.println("maximum : " + max);
    }
}
