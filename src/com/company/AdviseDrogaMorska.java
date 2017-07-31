package com.company;

/**
 * Created by Paulig on 5/21/2017.
 */
public class AdviseDrogaMorska extends CargoSenderAdvisor {
    @Override
    public void adviseSendingWay(Cargo cargo) {
      if(cargo.getWeight()>=100){
          System.out.println(cargo.getWeight()+" kg cargo has been sent with a boat to " +cargo.getCountry().getName());
      }else{
          getNext().adviseSendingWay(cargo);
      }
    }

    AdviseDrogaMorska(){
        setNext(new ReturnToSender());
    }
}
