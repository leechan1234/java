package src;

import javax.swing.*;

public class GUguClass {
    public static void main(String[] args) {
        for(int i=2; i < 10; i=i+1) {
            for (int j=1; j<10; j=j+1){
                System.out.println(i+"x"+j+"=" + i*j);
            }
        }
    }

}
