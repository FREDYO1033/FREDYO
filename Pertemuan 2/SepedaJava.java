/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sepedajava;

/**
 *
 * @author fredy
 */
public class SepedaJava {

    static class Sepeda {
        int kecepatan = 0;
        int gir = 0;

        // method
        void ubahGir(int pertambahanGir) {
            gir += pertambahanGir;
            System.out.println("Gir : " + gir);
        }

        void tambahKecepatan(int pertambahanKecepatan) {
            kecepatan += pertambahanKecepatan;
            System.out.println("Kecepatan : " + kecepatan);
        }
    }

    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda();

        sepeda.ubahGir(2);
        sepeda.tambahKecepatan(20);
    }
}

