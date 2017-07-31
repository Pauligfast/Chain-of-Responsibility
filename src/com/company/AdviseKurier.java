package com.company;

public class AdviseKurier extends CargoSenderAdvisor {
    @Override
    public void adviseSendingWay(Cargo cargo) {
        if (cargo.getWeight()<=20 && cargo.getCountry().getName().equals("Poland")){
            System.out.println(cargo.getWeight()+" kg cargo has been sent with courier to " +cargo.getCountry().getName());
        }else{
            getNext().adviseSendingWay(cargo);
        }
    }
     AdviseKurier(){
        this.setNext(new AdviseWlasnyTransport());
    }
}
