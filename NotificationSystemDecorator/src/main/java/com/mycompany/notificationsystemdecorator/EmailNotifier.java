/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notificationsystemdecorator;

/**
 *
 * @author domen
 */
public class EmailNotifier implements Notificacion{
    @Override
    public void enviarNotificacion(){
        System.out.println("Enviar notificacion por Email");
    }
}
