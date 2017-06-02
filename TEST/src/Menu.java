
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
public class Menu {

    //nhap vao chon lua tu 1 den 5, hien thi menu chon lua
    //1 - open, 2 - new, 3 - save, 4 - update, 5 - exit.nguoc lai 
    //tbao khong hop le
    int n;

    void input() {
        System.out.println("Nhap chon lua tu 1-5");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.input();
        switch (m.n) {
            case 1:
                System.out.println("Ban da chon Open");
                break;
            case 2:
                System.out.println("Ban da chon New");
                break;
            case 3:
                System.out.println("Ban da chon Save");
                break;
            case 4:
                System.out.println("Ban da chon Update");
                break;
            case 5:
                System.out.println("Ban da chon Nhat TUan");
                break;
            default: System.out.println("Chon lua khong dung");
        }
    }
}
