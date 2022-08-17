package domain;

import javax.persistence.*;

@Entity
@TableGenerator(name = "criptomoneda")
public class Criptomoneda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_criptomoneda", nullable = false)
    private Long id_criptomoneda;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_inversionista")
    private Inversionista inversionista;

    @Column
    private String nombre;

    @Column
    private Disponibilidad disponibilidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_valor")
    private Valor valor;

    public Long getId_criptomoneda() {
        return id_criptomoneda;
    }

    public void setId_criptomoneda(Long id_criptomoneda) {
        this.id_criptomoneda = id_criptomoneda;
    }

    public Criptomoneda(Inversionista inversionista) {
        this.inversionista = inversionista;
    }

    public Criptomoneda() {}

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Criptomoneda(String nombre, Disponibilidad disponibilidad, Valor valor) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.valor = valor;
    }

    public long getId_Criptomoneda() {
        return id_criptomoneda;
    }

    public void setId_Criptomoneda(long id_Criptomoneda) {
        this.id_criptomoneda = id_Criptomoneda;
    }

    public Inversionista getInversionista() {
        return inversionista;
    }

    public void setInversionista(Inversionista inversionista) {
        this.inversionista = inversionista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
