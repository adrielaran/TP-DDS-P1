package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ejecucionDeLaAplicacion {
    @Autowired private Alerta alertaDetectada;
    @Autowired private Noticia nuevaNoticia;
    public static void main(String[] args) {
        SpringApplication.run(ejecucionDeLaAplicacion.class, args);
    }
   // @EventListener(ApplicationReadyEvent.class)
    @EventListener(ApplicationReadyEvent.class)
    public void sendAlerta(){
        alertaDetectada.enviarMensaje("aadriel@frba.utn.edu.ar","Bitcoin");
        System.out.println("Alerta enviada exitosamente");
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendNoticia(){
        nuevaNoticia.enviarMensaje("aadriel@frba.utn.edu.ar","Bitcoin");
        System.out.println("Noticia enviada exitosamente");

    }
}
