/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classscanner;

import java.util.Scanner;


/**
 *
 * @author fredy
 */
public class ClassScanner {

   public String nama;
    public double n1;
    public int n2, n3;
    Scanner input = new Scanner(System.in);
    
    public String getNama(){
        return nama;
    }


public void inputScanner(){
    System.out.print("Masukkan Nama Anda : ");
    nama = input.nextLine();
    System.out.print("Masukkan Nilai 1 : ");
    n1 = input.nextDouble();
    System.out.println("Masukkan Nilai 2 : ");
    n2 = input.nextInt();
}

public double rata(){
    return ((n1+n2)/2);
    }
    
}
