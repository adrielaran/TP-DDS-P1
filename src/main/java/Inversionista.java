import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity (name = "Inversionista")
public class Inversionista {
<<<<<<< HEAD
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private List<Criptomoneda> criptomonedas = new ArrayList<>();
    private Variacion interes;
    public void setInteres(Variacion interes) {
        this.interes = interes;
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Inversoinista")
    private Integer id_Inversionista;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Correo")
    private String correo;

    @Column(name = "Celular")
    private String celular;

    @OneToMany(mappedBy = "Inversionista", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Criptomoneda> criptomonedas;

    @Column(name = "Variacion")
    private Variacion variacion;


    public void setVariacion(Variacion variacion) {
        this.variacion = variacion;
>>>>>>> ac53c2237495c46e3fc08f2908e7e8d2c173f5f5
    }
    public void comprobarDisponibilidad() {
    }
<<<<<<< HEAD
    public void analizarTendencias(Integer margen){}
=======

    public void analizarTendencias(Integer margen) {
    }

>>>>>>> ac53c2237495c46e3fc08f2908e7e8d2c173f5f5

}
