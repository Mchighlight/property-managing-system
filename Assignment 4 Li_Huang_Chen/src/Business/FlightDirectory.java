/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Hung chihong
 */

public class FlightDirectory {
    private List<Flight> flightDir;
    private Flight flights;
    private AirlinerDirectory airDir;
    public FlightDirectory(){
        flightDir = new ArrayList<Flight>();
        mockFlightSchedules();
    }
    public void mockFlightSchedules(){
         String[][] arr = { {"Emirates"                ,"EM001", "BOS","DXB","06:00","19:00","100.0","Morning"  ,"13"},
                           {"Emirates"                ,"EM002", "BOS","DFW","15:00","19:00","100.0","Day","4"},
                           {"Emirates"                ,"EM003", "DFW","BOS","01:00","05:00","100.0","Evening" ,"4"},
                           {"Singapore Airlines"      ,"SA001", "BOS","LAS","07:00","13:00","100.0","Morning"  ,"6"},
                           {"Singapore Airlines"      ,"SA002", "BOS","JFK","11:00","13:00","100.0","Day","2"},
                           {"Singapore Airlines"      ,"SA003", "JFK","BOS","08:00","10:00","100.0","Morning"  ,"2"},
                           {"Cathay Pacific Airways"  ,"CPA001","BOS","HKG","20:00","15:00","100.0","Evening"  ,"19"},
                           {"Cathay Pacific Airways"  ,"CPA002","HKG","SHA","15:00","17:00","100.0","Day","2"},
                           {"Cathay Pacific Airways"  ,"CPA003","HKG","BOS","16:00","11:00","100.0","Day" ,"19"},
                           {"Delta AirLines"          ,"DA001" ,"BOS","LAS","06:00","10:00","100.0","Morning"  ,"6"},
                           {"Delta AirLines"          ,"DA002" ,"BOS","DFW","01:00","05:00","100.0","Evening","4"},
                           {"Delta AirLines"          ,"DA003" ,"BOS","JFK","22:00","00:00","100.0","Evening","2"},
                           {"JetBlue"                 ,"JB001" ,"BOS","LAS","06:00","12:00","100.0","Morning","6"},
                           {"JetBlue"                 ,"JB002" ,"BOS","DFW","14:00","18:00","100.0","Day","4"},
                           {"JetBlue"                 ,"JB003" ,"BOS","EWR","22:00","00:00","100.0","Evening","2"},
                           {"United Airlines"         ,"UA001" ,"BOS","EWR","00:00","02:00","100.0","Evening","2"},
                           {"United Airlines"         ,"UA002" ,"BOS","JFK","15:00","17:00","100.0","Day","2"},
                           {"United Airlines"         ,"UA003" ,"BOS","LAS","08:00","14:00","100.0","Morning","6"},
                           {"Spirit Airlines"         ,"SA001" ,"BOS","JFK","14:00","16:00","100.0","Day","2"},
                           {"Spirit Airlines"         ,"SA002" ,"BOS","DFW","06:00","10:00","100.0","Morning","4"},
                           {"Spirit Airlines"         ,"SA003" ,"BOS","JFK","21:00","23:00","100.0","Evening","2"},
                           {"American Airlines"       ,"AA001"  ,"BOS","LAS","09:00","15:00","100.0","Morning","6"},
                           {"American Airlines"       ,"AA002"  ,"BOS","JFK","00:00","02:00","100.0","Evening","2"},
                           {"American Airlines"       ,"AA003"  ,"BOS","SHA","14:00","09:00","100.0","Day","19"},
        };



        for(int i=0;i<arr.length;i++) {
            Flight temp = new Flight();

            temp.setOwner(arr[i][0]);
            temp.setFlightNumber(arr[i][1]);
            temp.setSource(arr[i][2]);
            temp.setDestination(arr[i][3]);
            temp.setDepTime(arr[i][4]);
            temp.setArrTime(arr[i][5]);
            temp.setPrice(Double.parseDouble(arr[i][6]));
            temp.setOtod(arr[i][7]);
            temp.setDuration((int)Double.parseDouble(arr[i][8]));
            // setting objects
            Seats seats = new Seats();
            temp.setSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "27-10-2020";

            try {

                Date date = formatter.parse(dateInString);
                //System.out.println(formatter.format(date));
                SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
                dateFormat.format(date);
                System.out.println(date);
                temp.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
                return;
            }
            flightDir.add(temp);
        }

    }


    public List<Flight> getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(List<Flight> flightDir) {
        this.flightDir = flightDir;
    }

    public void addFlight(Flight newFlight){
        flightDir.add(newFlight);
    }


    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }
    public void removeFlight(Flight f){
        flightDir.remove(f);
    }
    
    
      public Flight Searchflight (String FlightNumber){
        for (Flight flight:flightDir){
            if (flight.getFlightNumber().equals(FlightNumber)){
            return flight;
            }
        }
    return null;
    }
      
      
    public ArrayList<Flight> searchMaster(String destination, String source, String otod, String date) {
        ArrayList<Flight> flightDirFiltered = new ArrayList<>();
        for (Flight f:flightDir)
        {

            String strDate = "";
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                strDate = dateFormat.format(f.getDate());

            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f.getDestination().equals(destination) && f.getSource().equals(source) && f.getOtod().equals(otod) && strDate.equals(date))
            {
                flightDirFiltered.add(f);
            }
        }

        return flightDirFiltered;
    }
}
