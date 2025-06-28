/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public class NotificationSystemDecorator {

    public static void main(String[] args) {
        
        Notificacion notiB=new SMSNotifier();
        
        Notificacion notificacion=new EmailNotifier();
        notificacion=new WhatsAppNotifier(notificacion);
        notificacion=new SignalNotifier(notificacion);
        notificacion=new WireNotifier(notificacion);
        notificacion=new TelegramNotifier(notificacion);
        
        notiB.enviarNotificacion();
        notificacion.enviarNotificacion();
    }
}
