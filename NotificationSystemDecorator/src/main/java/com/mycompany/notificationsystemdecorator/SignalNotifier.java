/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public class SignalNotifier extends NotificationDecorator {
    public SignalNotifier(Notificacion notificacionDecor){
        super(notificacionDecor);
    }
    public void enviarNotifiacion(){
        super.enviarNotificacion();
        enviarSignal();
    }
    private void enviarSignal(){
        System.out.println("Enviando notificacion por Signal");
    }


            
}

    

