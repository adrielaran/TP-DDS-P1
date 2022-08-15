package db;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class CriptomonedaEntityPK implements Serializable {
    @Column(name = "id_Criptomoneda")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCriptomoneda;
    @Column(name = "Inversionista_id_Inversionista")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inversionistaIdInversionista;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriptomonedaEntityPK that = (CriptomonedaEntityPK) o;
        return idCriptomoneda == that.idCriptomoneda && inversionistaIdInversionista == that.inversionistaIdInversionista;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCriptomoneda, inversionistaIdInversionista);
    }
}
