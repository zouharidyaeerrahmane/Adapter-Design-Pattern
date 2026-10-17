package com.zouhari.computer.adapter;


import com.zouhari.computer.Hdmi;
import com.zouhari.computer.Vga;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("/////////////// ADAPTER ///////////////");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("/////////////// ADAPTER ///////////////");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
