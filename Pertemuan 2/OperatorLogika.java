/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operatorlogika;

/**
 *
 * @author fredy
 */
public class OperatorLogika {

     public static void main(String[] args) {
        System.out.println("Operator AND");
        System.out.println("True && True = " + (true&&true));
        System.out.println("True && False = " + (true&&false));
        System.out.println("False && True = " + (false&&true));
        System.out.println("False && False = " + (false&&false));
        System.out.println("\nOperator OR");
        System.out.println("True || True = " + (true||true));
        System.out.println("True || False = " + (true||false));
        System.out.println("False || True = " + (false||true));
        System.out.println("False || False = " + (false||false));
        System.out.println("\nOperator XOR");
        System.out.println("True ^ True = " + (true^true));
        System.out.println("True ^ False = " + (true^false));
        System.out.println("False ^ True = " + (false^true));
        System.out.println("False ^ False = " + (false^false));
        System.out.println("\nOperator NOT");
        System.out.println("!True = " + (!true));
        System.out.println("!False = " + (!false));
    }
    
}