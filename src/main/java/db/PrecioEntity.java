package db;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Precio", schema = "SistemaDeRecomendacionDeInversiones", catalog = "")
@IdClass(PrecioEntityPK.class)
public class PrecioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Precio")
    private int idPrecio;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Criptomoneda_id_Criptomoneda")
    private int criptomonedaIdCriptomoneda;
    @Basic
    @Column(name = "ValorActual")
    private int valorActual;
    @Basic
    @Column(name = "Capitalizacion")
    private double capitalizacion;
    @Basic
    @Column(name = "Volumen")
    private double volumen;
    @Basic
    @Column(name = "Fecha")
    private Date fecha;

    public int getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(int idPrecio) {
        this.idPrecio = idPrecio;
    }

    public int getCriptomonedaIdCriptomoneda() {
        return criptomonedaIdCriptomoneda;
    }

    public void setCriptomonedaIdCriptomoneda(int criptomonedaIdCriptomoneda) {
        this.criptomonedaIdCriptomoneda = criptomonedaIdCriptomoneda;
    }

    public int getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    public double getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(double capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioEntity that = (PrecioEntity) o;
        return idPrecio == that.idPrecio && criptomonedaIdCriptomoneda == that.criptomonedaIdCriptomoneda && valorActual == that.valorActual && Double.compare(that.capitalizacion, capitalizacion) == 0 && Double.compare(that.volumen, volumen) == 0 && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrecio, criptomonedaIdCriptomoneda, valorActual, capitalizacion, volumen, fecha);
    }
}
