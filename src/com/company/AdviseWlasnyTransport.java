package com.company;

/**
 * Created by Paulig on 5/21/2017.
 */
public class AdviseWlasnyTransport extends CargoSenderAdvisor {
    @Override
    public void adviseSendingWay(Cargo cargo) {
       if(cargo.getCountry().getDistance()<1000){
           System.out.println(cargo.getWeight()+" kg cargo has been sent with a truck to " +cargo.getCountry().getName());
       }else{
           getNext().adviseSendingWay(cargo);
       }
    }

     AdviseWlasnyTransport(){
        setNext(new AdvisePocztaLotnicza());
    }
}
