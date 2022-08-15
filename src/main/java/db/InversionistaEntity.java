package db;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Inversionista", schema = "SistemaDeRecomendacionDeInversiones", catalog = "")
public class InversionistaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Inversionista")
    private int idInversionista;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Apellido")
    private String apellido;
    @Basic
    @Column(name = "Correo")
    private String correo;
    @Basic
    @Column(name = "Celular")
    private String celular;
    @Basic
    @Column(name = "Criptomonedas")
    private String criptomonedas;
    @Basic
    @Column(name = "Interes")
    private String interes;

    public int getIdInversionista() {
        return idInversionista;
    }

    public void setIdInversionista(int idInversionista) {
        this.idInversionista = idInversionista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCriptomonedas() {
        return criptomonedas;
    }

    public void setCriptomonedas(String criptomonedas) {
        this.criptomonedas = criptomonedas;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InversionistaEntity that = (InversionistaEntity) o;
        return idInversionista == that.idInversionista && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(correo, that.correo) && Objects.equals(celular, that.celular) && Objects.equals(criptomonedas, that.criptomonedas) && Objects.equals(interes, that.interes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInversionista, nombre, apellido, correo, celular, criptomonedas, interes);
    }
}
