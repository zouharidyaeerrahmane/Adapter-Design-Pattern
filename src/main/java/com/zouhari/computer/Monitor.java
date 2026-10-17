package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class Monitor implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("............... Monitor .............");
        String message = new String(data);
        System.out.println(message);
        System.out.println("............... Monitor .............");
    }
}
