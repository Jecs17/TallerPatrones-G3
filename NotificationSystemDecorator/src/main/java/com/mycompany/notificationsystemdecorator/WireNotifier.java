/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public class WireNotifier extends NotificationDecorator {
    public WireNotifier(Notificacion notificacionDecor){
        super(notificacionDecor);
    }
    @Override
    public void enviarNotificacion(){
        super.enviarNotificacion();
        enviarWire();
    }
    private void enviarWire(){
        System.out.println("Envio notificacion por Wire");
    }
      
}
    

