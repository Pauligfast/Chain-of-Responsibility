package com.company;

public abstract class CargoSenderAdvisor {
    private CargoSenderAdvisor next;

    abstract void adviseSendingWay(Cargo cargo);

    public CargoSenderAdvisor getNext() {
        return next;
    }

    void setNext(CargoSenderAdvisor next) {
        this.next = next;
    }
}
