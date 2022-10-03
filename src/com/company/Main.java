package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void trDrive(List<RidingTransport> ridingTransports) {
        for(RidingTransport ridingTransport: ridingTransports) {
            ridingTransport.drive();
        }
    }

    public static void main(String[] args) {
        List<RidingTransport> ridingTransports = new ArrayList<RidingTransport>();
        ridingTransports.add(new Car());
        trDrive(ridingTransports);
    }
}


