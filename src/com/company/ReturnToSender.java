package com.company;

/**
 * Created by Paulig on 5/21/2017.
 */
 class ReturnToSender extends CargoSenderAdvisor {
    @Override
    void adviseSendingWay(Cargo cargo) {
        System.out.println("Have no idea how to send this crap");
    }
}
