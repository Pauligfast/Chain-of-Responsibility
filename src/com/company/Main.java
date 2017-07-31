package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Country Isengard = new Country("Isengard", 1100);
        Country Rohan = new Country("Rohan", 800);
        Country Mirkwood = new Country("Mirkwood", 20000);
        Country Mordor = new Country("Mordor", 1500);
        Country Gondor = new Country("Gondor", 15000);
        Country Shire = new Country("The Shire", 400);
        Country Poland = new Country("Poland", 0);
        List<Cargo> cargos = new LinkedList<>();
        cargos.add(new Cargo(Isengard, 30));
        cargos.add(new Cargo(Rohan, 120));
        cargos.add(new Cargo(Mirkwood, 500));
        cargos.add(new Cargo(Mordor, 0.1));
        cargos.add(new Cargo(Gondor, 500));
        cargos.add(new Cargo(Poland, 15));
        cargos.add(new Cargo(Shire, 133));
        cargos.add(new Cargo(Gondor, 80));
        cargos.add(new Cargo(Isengard, 1300));
        cargos.add(new Cargo(Mordor, 80));
        cargos.add(new Cargo(Poland, 0.4));
        CargoSenderAdvisor cargoSenderAdvisor = new AdvisePocztaPolska();
        for (Cargo cargo :
                cargos) {
            cargoSenderAdvisor.adviseSendingWay(cargo);


        }


    }
}
