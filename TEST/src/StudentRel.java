
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
public class StudentRel {

    int math, liter, re;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap math, liter: ");
        math = sc.nextInt();
        liter = sc.nextInt();
    }

    public static void main(String[] args) {
        StudentRel st = new StudentRel();
        st.input();
        String result = "";
        st.re = (st.math * 2 + st.liter) / 3;
        if (st.re >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        if(st.re < 5)
            result = "Yeu";
        else if(st.re < 6.5)
            result = "Trung binh";
        else if(st.re < 8)
            result = "Kha";
        else result = "Gioi";
        System.out.println("Result: " + result);
    }
}
