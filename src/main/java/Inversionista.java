import java.util.ArrayList;
import java.util.List;

public class Inversionista {
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private List<Criptomoneda> criptomonedas = new ArrayList<>();
    private Variacion interes;

    public void setInteres(Variacion interes){ this.interes = interes; }
    public void comprobarDisponibilidad(){}
    public void analizarTendencias(Integer margen){}
}
