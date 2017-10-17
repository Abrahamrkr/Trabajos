package Ejercicio8;

import java.awt.event.*;
;

public class Controlador implements  ActionListener{
    Vista2 v;
    public Controlador() {
        v = new Vista2();
        v.setVisible(true);
        v.btnCalcular.addActionListener(this);
        
    }
    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==v.btnCalcular){
           boolean tot,iva,total;
           tot=(v.txtUnidades.getText())*(v.txtPrecio.getText());
        }
    }


}
