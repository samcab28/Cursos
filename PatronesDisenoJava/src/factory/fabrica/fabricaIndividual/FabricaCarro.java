package factory.fabrica.fabricaIndividual;

import factory.vehiculo.Carro;
import factory.Transporte;

public class FabricaCarro extends FabricaTransporte {
    @Override
    public Transporte crearTransporte() {
        return new Carro();
    }
}
