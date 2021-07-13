/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listaenconceptocola;

/**
 *
 * @author frankdev
 */
public class Cola {
    Nodo inicio,fin;
    int tamanio;
    public Cola(){
        inicio=fin=null;
        this.tamanio=0;
    }
    //METODO PARA VERIFICAR SI LA COLA ESTA VACIA
    public boolean estaVacia(){
        return inicio==null;
    }
    //METODO PARA INSERTAR (encolar) UN NODO EN LA COLA
    public void insertar(int edad){
        Nodo nuevo = new Nodo(edad);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamanio++;
    }
    //METODO PARA ELIMINAR (desencolar) UN NODO EN LA COLA
    public int desencolar(){
        int edad=inicio.edad;
        inicio=inicio.siguiente;
        tamanio--;
        return edad;
    }
    //METODO PARA VERIFICAR CUAL ES EL NODO QUE ESTA AL INICIO DE LA COLA
    public int inicioCola(){
        return inicio.edad;
    }
    //METODO PARA VERIFICAR EL TAMANIO DE LA COLA
    public int tamanioCola(){
        return tamanio;
    }
}
