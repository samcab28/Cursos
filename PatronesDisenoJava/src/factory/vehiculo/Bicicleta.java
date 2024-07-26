package factory.vehiculo;

import factory.Transporte;

public class Bicicleta implements Transporte {
    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo.");
    }
}