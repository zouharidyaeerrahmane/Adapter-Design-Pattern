package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class SuperVP implements Vga,Dp{

    @Override
    public void print(String message) {
        System.out.println("+++++++++++++ SUPER VP Vga +++++++++++++");
        System.out.println(message);
        System.out.println("+++++++++++++ SUPER VP Vga +++++++++++++");
    }

    @Override
    public void show(String message) {
        System.out.println("+++++++++++++ SUPER VP Dp +++++++++++++");
        System.out.println(message);
        System.out.println("+++++++++++++ SUPER VP Dp +++++++++++++");
    }
    }

