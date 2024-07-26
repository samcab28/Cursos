package factory;

import factory.fabrica.fabricaIndividual.FabricaAvion;
import factory.fabrica.fabricaIndividual.FabricaBicicleta;
import factory.fabrica.fabricaIndividual.FabricaCarro;
import factory.fabrica.fabricaIndividual.FabricaTransporte;

public class MainFactory {
    public static void main(String[] args) {
        FabricaTransporte fabricaCarro = new FabricaCarro();
        Transporte carro = fabricaCarro.crearTransporte();
        carro.mover();

        FabricaTransporte fabricaBicicleta = new FabricaBicicleta();
        Transporte bicicleta = fabricaBicicleta.crearTransporte();
        bicicleta.mover();

        FabricaTransporte fabricaAvion = new FabricaAvion();
        Transporte avion = fabricaAvion.crearTransporte();
        avion.mover();
    }
}
