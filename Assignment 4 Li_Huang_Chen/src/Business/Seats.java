/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class Seats {
   ArrayList<String> seat;
    
    public Seats(){
    seat = new ArrayList<String>();    
    seat.add("1A");
    seat.add("2A");
    seat.add("3A");
    seat.add("4A");
    seat.add("5A");
    
    seat.add("1B");
    seat.add("2B");
    seat.add("3B");
    seat.add("4B");
    seat.add("5B");
    
    seat.add("1C");
    seat.add("2C");
    seat.add("3C");
    seat.add("4C");
    seat.add("5C");
    
     seat.add("1D");
    seat.add("2D");
    seat.add("3D");
    seat.add("4D");
    seat.add("5D");
    
     seat.add("1E");
    seat.add("2E");
    seat.add("3E");
    seat.add("4E");
    seat.add("5E");
    
     seat.add("1F");
    seat.add("2F");
    seat.add("3F");
    seat.add("4F");
    seat.add("5F");
    
     seat.add("1G");
    seat.add("2G");
    seat.add("3G");
    seat.add("4G");
    seat.add("5G");
    }
    public Seats(int capacity){
    seat = new ArrayList<String>();
        for (int i = 0; i < capacity; i++) {
            
            String num = String.valueOf(i+4/4);
            if (i%8==0) {
                seat.add(num+"A");
            }if (i%8==1) {
                seat.add(num+"B");
            }if (i%8==2) {
                seat.add(num+"C");
            }if (i%8==3) {
                seat.add(num+"D");
            }if (i%8==4) {
                seat.add(num+"E");
            }if (i%8==5) {
                seat.add(num+"F");
            }if (i%8==6) {
                seat.add(num+"G");
            }if (i%8==7) {
                seat.add(num+"H");
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
