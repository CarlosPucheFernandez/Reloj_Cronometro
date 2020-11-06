/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reloj_cronometro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author carlo
 */
public class Listas {
    
    /*
    * Creacion de variables
    */
    private DefaultListModel listModel_vueltas;
    private DefaultListModel listModel_alarma;
    int numVueltas = 0;

    /*
    * Inicializacion de variables
    */
    public Listas() {
        listModel_alarma = new DefaultListModel();
        listModel_vueltas = new DefaultListModel();
    }      
    
    /*
    * añade las larmas al modelo de la lista alarmas
    */
    public DefaultListModel modeloAlarma(String s){
        String horaAlarma = s;
        listModel_alarma.addElement(s);
        return listModel_alarma;
    }

    public DefaultListModel getListModel_alarma() {
        return listModel_alarma;
    }

    public DefaultListModel getListModel_vueltas() {
        return listModel_vueltas;
    }
    
    /*
    * añade las vueltas al modelo de la lista vueltas
    */
    public DefaultListModel modeloVueltas(String s){
        String vuelta = "Vuelta nº"+ (numVueltas + 1) + " = " + s;
        listModel_vueltas.addElement(vuelta);
        numVueltas++;
        return listModel_vueltas;
    }

    public void borrarListaVueltas() {
        numVueltas = 0;
        listModel_vueltas.removeAllElements();
    }
    
    public void borrarListaAlarmas() {
        listModel_alarma.removeAllElements();
    }
    
    public void borrarUnoListaAlarmas(int n) {
        listModel_alarma.removeElementAt(n);
    }
}
