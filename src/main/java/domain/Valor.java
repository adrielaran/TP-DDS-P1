package domain;

import java.time.LocalDateTime;

public class Valor {
    private Double valorActual;
    private Float capitalizacion;
    private Float volumen;
    private LocalDateTime fecha;

    public Valor(Double valorActual,LocalDateTime fecha) {
        this.valorActual = valorActual;
        /*            Aqui deberia colocarse la capitalizacion y el volumen,
            tuvimos dificultades con la API, aparentemente estos datos no los comparte"
        */
        this.fecha = fecha;
    }

    public Integer compararVariacion(Integer margen) {
        return margen;
    }
}
