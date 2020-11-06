/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reloj_cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author carlo
 */
public class Funciones_Reloj_crono {
    /*
    * Creacion de variables
    */
    private Integer min = 0;
    private Integer seg = 0;
    private Integer hora = 0;
    private String tiempoActual = "00:00:00";
    
    /*
    * Comprueba que las unidades de tiempo sean las correctas y devulve el tiempo
    */
    public String Actualizar_crono(int segundos,Boolean inicio){ 
        if(inicio){
            this.seg = segundos % 60;           
            if (seg == 59){
                this.min++;
            }
            if (this.min == 60){
                this.min = 0;
                this.hora++;
            }
        }else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
        
        this.tiempoActual = hora + ":" + min + ":" + seg;
        return this.tiempoActual;
    }
    
    /*
    * Recoge la hora del sistema y la devuelve para su escritura
    */
    public String Actualizar_reloj(){
        Date HoraActual = new Date();
        DateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
        String Tiempo_reloj = formatTime.format(HoraActual);
        
        return Tiempo_reloj;
    }
    
}
