/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public class WhatsAppNotifier extends NotificationDecorator{
    public WhatsAppNotifier(Notificacion notificacionDecor){
        super(notificacionDecor);
    }
    @Override
    public void enviarNotificacion(){
        super.enviarNotificacion();
        enviarWhats();
    }
    private void enviarWhats(){
        System.out.println("Envio notificacion por Ws");
    }

    
            
}
