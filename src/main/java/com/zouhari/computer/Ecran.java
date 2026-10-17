package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class Ecran implements Vga {
    @Override
    public void print(String message) {
        System.out.println("----------- Ecran ------------");
        System.out.println(message);
        System.out.println("----------- Ecran ------------");
    }
}
