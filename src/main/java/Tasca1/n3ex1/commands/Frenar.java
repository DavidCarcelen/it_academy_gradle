package Tasca1.n3ex1.commands;

import Tasca1.n3ex1.vehiculos.Vehiculo;

public class Frenar implements Command{
    @Override
    public void execute(Vehiculo vehiculo) {
        System.out.println(vehiculo + " está frenando");
    }
}
