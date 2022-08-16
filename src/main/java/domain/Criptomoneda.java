package domain;

import javax.persistence.*;

@Entity (name = "domain.Criptomoneda")
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

    @Column(name = "domain.Disponibilidad")
    private Disponibilidad disponibilidad;

    @Column(name = "domain.Valor")
    private Valor valor;
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
}
