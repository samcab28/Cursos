package factory.vehiculo;

import factory.Transporte;

public class Avion implements Transporte {
    @Override
    public void mover() {
        System.out.println("El avión está volando.");
    }
}