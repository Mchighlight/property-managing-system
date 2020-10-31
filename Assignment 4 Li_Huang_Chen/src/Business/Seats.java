/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Yining Chen
 */

public class Seats {
   ArrayList<String> seat;
    
    public Seats(){
    seat = new ArrayList<String>();
        for (int i = 0; i < 150; i++) {
            
            String num = String.valueOf((i+6)/6);
            if (i%6==0) {
                seat.add(num+"A Window");
            }if (i%6==1) {
                seat.add(num+"B Middle");
            }if (i%6==2) {
                seat.add(num+"C Aisle");
            }if (i%6==3) {
                seat.add(num+"D Aisle");
            }if (i%6==4) {
                seat.add(num+"E Middle");
            }if (i%6==5) {
                seat.add(num+"F Window");
            }
        }
    }
    public Seats(int capacity){
    seat = new ArrayList<String>();
        for (int i = 0; i < capacity; i++) {
            
            String num = String.valueOf((i+6)/6);
            if (i%6==0) {
                seat.add(num+"A Window");
            }if (i%6==1) {
                seat.add(num+"B Middle");
            }if (i%6==2) {
                seat.add(num+"C Aisle");
            }if (i%6==3) {
                seat.add(num+"D Aisle");
            }if (i%6==4) {
                seat.add(num+"E Middle");
            }if (i%6==5) {
                seat.add(num+"F Window");
            }
        }
    }

    public ArrayList<String> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<String> seat) {
        this.seat = seat;
    }
}
