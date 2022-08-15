package db;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PrecioEntityPK implements Serializable {
    @Column(name = "id_Precio")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrecio;
    @Column(name = "Criptomoneda_id_Criptomoneda")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int criptomonedaIdCriptomoneda;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioEntityPK that = (PrecioEntityPK) o;
        return idPrecio == that.idPrecio && criptomonedaIdCriptomoneda == that.criptomonedaIdCriptomoneda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrecio, criptomonedaIdCriptomoneda);
    }
}
