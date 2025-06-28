/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public abstract class NotificationDecorator implements Notificacion{
    protected Notificacion notificacionDecor;
    public NotificationDecorator(Notificacion notificacionDecor){
        this.notificacionDecor =notificacionDecor;
    }
    @Override
    public void enviarNotificacion(){
        notificacionDecor.enviarNotificacion();
    }
}
