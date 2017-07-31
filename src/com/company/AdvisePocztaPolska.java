package com.company;

public class AdvisePocztaPolska extends CargoSenderAdvisor {
    @Override
    public void adviseSendingWay(Cargo cargo) {
        if (cargo.getWeight() <= 0.5) {
            System.out.println(cargo.getWeight()+" kg cargo has been sent with a Poczta Polska to " +cargo.getCountry().getName());
        } else {
            getNext().adviseSendingWay(cargo);
        }
    }

    public AdvisePocztaPolska() {
        setNext(new AdviseKurier());
    }
}
