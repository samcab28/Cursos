package factory.fabrica.fabricaIndividual;

import factory.vehiculo.Avion;
import factory.Transporte;

public class FabricaAvion extends FabricaTransporte {
    @Override
    public Transporte crearTransporte() {
        return new Avion();
    }
}
