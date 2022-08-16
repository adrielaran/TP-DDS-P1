package domain;

import javax.persistence.*;
import java.util.List;
@Entity (name = "tareasprogramadas.Inversionista")
public class Inversionista {
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

    @OneToMany(mappedBy = "tareasprogramadas.Inversionista", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Criptomoneda> criptomonedas;

    @Column(name = "tareasprogramadas.Variacion")
    private Variacion variacion;
    public void setVariacion(Variacion variacion) {
        this.variacion = variacion;
    }
    public void comprobarDisponibilidad() {}
    public void analizarTendencias(Integer margen) {}
}
