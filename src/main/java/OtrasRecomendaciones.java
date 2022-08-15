public class OtrasRecomendaciones extends Alerta {
    public OtrasRecomendaciones(Inversionista nuevoReceptor) {
        super(nuevoReceptor);
    }

    public OtrasRecomendaciones copiar(Inversionista nuevoReceptor){
        return new OtrasRecomendaciones(nuevoReceptor);
    };
};

