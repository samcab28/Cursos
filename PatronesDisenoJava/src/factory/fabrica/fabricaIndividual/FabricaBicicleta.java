package factory.fabrica.fabricaIndividual;


import factory.vehiculo.Bicicleta;
import factory.Transporte;

public class FabricaBicicleta extends FabricaTransporte {
    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
}
