package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class Tv implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("00000000000000 TV 00000000000");
        String message = new String(data);
        System.out.println(message);
        System.out.println("00000000000000 TV 00000000000");
    }
}
