/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4.model;

/**
 *
 * @author aleja
 */

public class Mail {

    private String mail;

    public Mail(String mail)
    {
        this.mail = mail;
    }

    public String getDomain()
    {
        return mail.substring(mail.indexOf('@')+1);
    }

}