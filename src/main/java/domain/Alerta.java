package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class Alerta extends Aviso {
    @Autowired
    private JavaMailSender mailSender;
    private String asunto = "Recomendacion | ¡Margen superado! | Analizar Tendencias de ";
    private String cuerpoDelMensaje = "Tenemos el agrado de informarle desde nuestro Sistema que detectamos una oportunidad para invertir";
    @Override
    public Boolean enviarMensaje(String to, String motivo){
            SimpleMailMessage email = new SimpleMailMessage();
            email.setTo(to);
            email.setSubject( asunto + motivo);
            email.setText(cuerpoDelMensaje);
            mailSender.send(email);
            return true;
    }
}
