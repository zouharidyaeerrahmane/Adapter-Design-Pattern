package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class VideoProjecteur implements Vga {
    @Override
    public void print(String message) {
        System.out.println("########### VP #############");
        System.out.println(message);
        System.out.println("########### VP #############");
    }
}
