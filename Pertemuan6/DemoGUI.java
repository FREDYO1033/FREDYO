/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemaun6;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author fredy
 */
public class DemoGUI extends JFrame {
    JPanel jp = new JPanel();
    JTextField jt = new JTextField();
    JLabel jl = new JLabel("Contoh Label");
    
    public DemoGUI() {
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jt.setBounds(120,20,80,25);
    }
    public static void main(String[] args) {
        DemoGUI demo2 = new DemoGUI();
        
        demo2.setTitle("Form Dengan Label dan Textfield");
        demo2.setSize(300, 300);
        demo2.setVisible(true);
    }
}
