package factory.vehiculo;

import factory.Transporte;

public class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("El carro se está moviendo.");
    }
}
