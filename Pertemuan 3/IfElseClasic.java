/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseclasic;

/**
 *
 * @author fredy
 */
public class IfElseClasic {

     public static void main(String[] args)
    {
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
        System.out.println("Hasil Akhir: ");
        System.out.println("================================");
        System.out.println("Nama Siswa               : " + ifclass.nama);
        System.out.println("Nilai Final              : " + ifclass.nilAkhir);
        System.out.println("Keterangan Akhir         : " + ifclass.getKeterangan());
    }
    
}
