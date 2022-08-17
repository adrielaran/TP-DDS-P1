package domain;

import javax.persistence.*;
import java.util.List;
@Entity
@TableGenerator(name = "inversionista")
public class Inversionista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_inversionista", nullable = false)
    private Long id_inversionista;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correo;

    @Column
    private String celular;

    @OneToMany(mappedBy = "inversionista", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Criptomoneda> criptomonedas;

    @Column
    private String variacion;

    public Long getId_inversionista() {
        return id_inversionista;
    }

    public void setId_inversionista(Long id_inversionista) {
        this.id_inversionista = id_inversionista;
    }

    public void comprobarDisponibilidad() {}
    public void analizarTendencias(Integer margen) {}

    public long getId_Inversionista() {
        return id_inversionista;
    }

    public void setId_Inversionista(long id_Inversionista) {
        this.id_inversionista = id_Inversionista;
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

    public List<Criptomoneda> getCriptomonedas() {
        return criptomonedas;
    }

    public void setCriptomonedas(List<Criptomoneda> criptomonedas) {
        this.criptomonedas = criptomonedas;
    }


}
