package domain;

import java.util.List;

public abstract class Aviso {
    private Inversionista receptor;
    private String asunto;
    private String cuerpoDelMensaje;
    public Aviso copiar(Inversionista receptor, List<Criptomoneda> motivo, String asunto, String cuerpoDelMensaje) { return null; }
    public abstract Boolean enviarMensaje(String to, String motivo);
}

