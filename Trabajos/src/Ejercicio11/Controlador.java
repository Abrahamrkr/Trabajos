package Ejercicio11;

import java.awt.event.*;


public class Controlador implements ActionListener{

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

}
