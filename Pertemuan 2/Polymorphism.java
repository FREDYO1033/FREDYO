/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author fredy
 */
class Hewan {
    public void suara() {
        System.out.println("Hewan bersuara : ");
    }
}

class Kuda extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kuda mengikik...");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing mengeong...");
    }
}

class Ayam extends Hewan {
    @Override
    public void suara() {
        System.out.println("Ayam berkokok...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Kuda kuda = new Kuda();
        Kucing kucing = new Kucing();
        Ayam ayam = new Ayam();

        hewan.suara();

        hewan = kuda;
        hewan.suara();

        hewan = kucing;
        hewan.suara();

        hewan = ayam;
        hewan.suara();
    }
}

