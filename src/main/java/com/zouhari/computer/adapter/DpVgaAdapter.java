package com.zouhari.computer.adapter;


import com.zouhari.computer.Dp;
import com.zouhari.computer.Hdmi;
import com.zouhari.computer.Vga;

/**
 * @author ZOUHARI Dyae errahmane
 * @Pseudo dezy
 **/
public class DpVgaAdapter implements Vga {
    private Dp dp;


    @Override
    public void print(String message) {
        System.out.println("*************** DP ADAPTER**************");
        dp.show(message);
        System.out.println("*************** DP ADAPTER**************");
    }
    public void setDp(Dp dp) {
        this.dp = dp;
    }
}

