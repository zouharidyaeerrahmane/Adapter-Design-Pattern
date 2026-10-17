package com.zouhari;


import com.zouhari.computer.*;
import com.zouhari.computer.adapter.HdmiDpAdapter;
import com.zouhari.computer.adapter.HdmiVgaAdapter;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVGA(new Ecran());
        uniteCentral.print("Bonjour");
        uniteCentral.setVGA(new VideoProjecteur());
        uniteCentral.print("Bonjour");
        System.out.println("--------------------------------------------------");
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Tv());
        uniteCentral.setVGA(hdmiVgaAdapter);
        uniteCentral.print("Bonjour");
        System.out.println("--------------------------------------------------");


    }
}