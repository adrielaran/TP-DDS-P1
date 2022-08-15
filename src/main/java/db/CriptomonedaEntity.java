package db;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Criptomoneda", schema = "SistemaDeRecomendacionDeInversiones", catalog = "")
@IdClass(CriptomonedaEntityPK.class)
public class CriptomonedaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Criptomoneda")
    private int idCriptomoneda;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Inversionista_id_Inversionista")
    private int inversionistaIdInversionista;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Disponibilidad")
    private double disponibilidad;
    @Basic
    @Column(name = "Precio")
    private double precio;
    @Basic
    @Column(name = "Historico")
    private Date historico;

    public int getIdCriptomoneda() {
        return idCriptomoneda;
    }

    public void setIdCriptomoneda(int idCriptomoneda) {
        this.idCriptomoneda = idCriptomoneda;
    }

    public int getInversionistaIdInversionista() {
        return inversionistaIdInversionista;
    }

    public void setInversionistaIdInversionista(int inversionistaIdInversionista) {
        this.inversionistaIdInversionista = inversionistaIdInversionista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(double disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getHistorico() {
        return historico;
    }

    public void setHistorico(Date historico) {
        this.historico = historico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriptomonedaEntity that = (CriptomonedaEntity) o;
        return idCriptomoneda == that.idCriptomoneda && inversionistaIdInversionista == that.inversionistaIdInversionista && Double.compare(that.disponibilidad, disponibilidad) == 0 && Double.compare(that.precio, precio) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(historico, that.historico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCriptomoneda, inversionistaIdInversionista, nombre, disponibilidad, precio, historico);
    }
}
