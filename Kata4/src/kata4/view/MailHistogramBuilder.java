/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4.view;

/**
 *
 * @author aleja
 */
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mails)
    {
        Histogram<String> histo = new Histogram<>();

        for(Mail m : mails)
            histo.increment(m.getDomain());

        return histo;
    }

}