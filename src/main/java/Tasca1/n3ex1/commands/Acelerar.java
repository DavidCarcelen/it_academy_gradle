package Tasca1.n3ex1.commands;

import Tasca1.n3ex1.vehiculos.Vehiculo;

public class Acelerar implements Command{
    @Override
    public void execute(Vehiculo vehiculo) {
        System.out.println(vehiculo + " está acelerando");
    }
}
