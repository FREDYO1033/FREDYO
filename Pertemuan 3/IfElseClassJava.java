/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseclassjava;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class IfElseClassJava {

    public String nama, ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData() 
    {
        System.out.print("Masukkan Nama Siswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir: ");
        nilAkhir = input.nextInt();
    }
        
    public String getKeterangan()
    {
        if(nilAkhir > 70) {
            ket = "Lulus";
        } else {
            ket = "Gagal";
        }
        return ket;
    }
    
}
