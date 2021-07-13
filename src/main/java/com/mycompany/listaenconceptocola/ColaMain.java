/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listaenconceptocola;

import javax.swing.JOptionPane;

/**
 *
 * @author frankdev
 */
public class ColaMain {

    public static void main(String args[]) {
        int opc = 0, edad = 0;
        Cola cola = new Cola();
        do {
            try {
                opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la cola\n"
                        + "2. Quitar un elemento en la cola\n"
                        + "3. ¿La cola esta vacia?\n"
                        + "4. Elemento ubicado al inicio de la cola\n"
                        + "5. Tamaño de la cola\n"
                        + "6. Salir\n"
                        + "Que desea hacer..?",
                        "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(opc){
                    case 1:
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese tu edad","Encolando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        cola.insertar(edad);
                        break;
                    case 2:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, cola.desencolar()+": eliminado",
                                    "Desencolando datos",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Cola vacia.! Nada que desencolar",
                                    "Desencolando datos",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La cola contiene datos",
                                    "Datos de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"La cola esta vacia..!",
                                    "Datos de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null,"El dato al inicio de la cola es: "
                            +cola.inicioCola(),"Datos de la cola",
                            JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"La cola esta vacia.!!","Datos de la cola",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"El tamaño de la cola es: "
                        +cola.tamanioCola(),"Datos de la cola",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,"Gracias por utilizar los servicios de FrankDev");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorecta","Opcion desconocido",
                                JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
            }
        } while (opc != 6);
    }
}
