import java.util.ArrayList;
import java.util.List;

public abstract class Aviso {
    private Inversionista receptor;
    private List<Criptomoneda> motivo = new ArrayList<>();
    private String asunto;
    private String cuerpoDelMensaje;

    public Aviso(Inversionista inversionista) { receptor = inversionista; };

    public Aviso copiar(Inversionista nuevoReceptor){return null;}
}
