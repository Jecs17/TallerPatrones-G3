/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author estudiante
 */
public class TelegramNotifier extends NotificationDecorator {
    public TelegramNotifier(Notificacion notificacionDecor){
        super(notificacionDecor);
    }
    @Override
    public void enviarNotificacion(){
        super.enviarNotificacion();
        enviarTelegram();
    }
    private void enviarTelegram(){
        System.out.println("Envio notificacion por Telegram");
    }
    
}
