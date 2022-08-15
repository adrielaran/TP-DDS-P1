public class Alerta extends Aviso {
    public Alerta(Inversionista nuevoReceptor) {
        super(nuevoReceptor);
    }
    public Aviso copiar(Inversionista nuevoReceptor){
        return new Alerta(nuevoReceptor);
    };
};
