
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
public class SumEven {
    //nhap cac so nguyen duong den khi nhap so <=0 thi ket thuc
    //hien thi tong cac so chan vua nhap
    public static void main(String[] args) {
        int a = 1, sum = 0;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        while(a > 0){
            System.out.println("nhap a: ");
            a = sc.nextInt();
            if(a >= 0 && a % 2 == 0)
                sum += a;
        }
        System.out.println("Sum : " + sum);
    }
}
