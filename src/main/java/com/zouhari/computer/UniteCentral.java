package com.zouhari.computer;


/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class UniteCentral {

    private Vga vga;
    public void setVGA(Vga vga) {
        this.vga = vga;
    }
    public void print(String message) {
        System.out.println("++++++++++++++++++++++++++");
        vga.print(message);
        System.out.println("++++++++++++++++++++++++++");
    }
}
