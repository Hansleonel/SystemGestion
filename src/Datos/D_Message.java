/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author kandskat
 */
public class D_Message {
    int idMessage;
    String FromMessage;
    String ToMessage;
    String Message;

    public D_Message() {
    }

    public D_Message(int idMessage, String FromMessage, String ToMessage, String Message) {
        this.idMessage = idMessage;
        this.FromMessage = FromMessage;
        this.ToMessage = ToMessage;
        this.Message = Message;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getFromMessage() {
        return FromMessage;
    }

    public void setFromMessage(String FromMessage) {
        this.FromMessage = FromMessage;
    }

    public String getToMessage() {
        return ToMessage;
    }

    public void setToMessage(String ToMessage) {
        this.ToMessage = ToMessage;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
}
