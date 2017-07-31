package com.company;

public class AdvisePocztaLotnicza extends CargoSenderAdvisor {

    @Override
    public void adviseSendingWay(Cargo cargo) {
        if(cargo.getWeight()<=100){
            System.out.println(cargo.getWeight()+" kg cargo has been sent with a plane to " +cargo.getCountry().getName());
        }else{
            getNext().adviseSendingWay(cargo);
        }
    }

    AdvisePocztaLotnicza(){
        setNext(new AdviseDrogaMorska());
    }
}
