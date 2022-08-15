import javax.persistence.*;

@Entity (name = "Criptomoneda")
public class Criptomoneda {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_Criptomoneda")
    private Integer id_Criptomoneda;

    @ManyToOne
    @JoinColumn (name = "id_Inversionista")
    private Inversionista inversionista;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Disponibilidad")
    private Disponibilidad disponibilidad;

    @Column(name = "Valor")
    private Valor valor;

}
