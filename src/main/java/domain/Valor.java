package domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@TableGenerator(name = "valor")
public class Valor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_valor", nullable = false)
    private Long id_valor;

    @Column
    private Double valorActual;

    @Column
    private Float capitalizacion;

    @Column
    private Float volumen;

    @Column
    private LocalDateTime fecha;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_criptomoneda")
    private Criptomoneda criptomoneda;

    public Valor(Double valorActual,LocalDateTime fecha) {
        this.valorActual = valorActual;
        /*            Aqui deberia colocarse la capitalizacion y el volumen,
            tuvimos dificultades con la API, aparentemente estos datos no los comparte"
        */
        this.fecha = fecha;
    }

    public Valor() {}

    public Integer compararVariacion(Integer margen) {
        return margen;
    }

    public long getId_valor() {
        return id_valor;
    }

    public void setId_valor(long id_valor) {
        this.id_valor = id_valor;
    }

    public Double getValorActual() {
        return valorActual;
    }

    public void setValorActual(Double valorActual) {
        this.valorActual = valorActual;
    }

    public Float getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(Float capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public Float getVolumen() {
        return volumen;
    }

    public void setVolumen(Float volumen) {
        this.volumen = volumen;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Criptomoneda getCriptomoneda() {
        return criptomoneda;
    }

    public void setCriptomoneda(Criptomoneda criptomoneda) {
        this.criptomoneda = criptomoneda;
    }
}
