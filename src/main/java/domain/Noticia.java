package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service @Primary
public class Noticia extends Alerta {
    @Autowired
    private JavaMailSender mailSender;
    private String asunto = "Agregamos nuevas Criptomonedas";
    private String cuerpoDelMensaje = "Tenemos el agrado de informarle que agregamos una nueva Criptomoneda: ";
    @Override
    public Boolean enviarMensaje(String to, String motivo){
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(to);
        email.setSubject(asunto);
        email.setText(cuerpoDelMensaje + motivo);
        mailSender.send(email);
        return true;
    }
}