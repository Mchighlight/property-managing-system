/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author abhishekashwathnarayanvenkat
 */
public class Propority {
    private String Nickname;
    private String Address;
    private String AptNo;
    private String City;
    private String State;
    private String zipCode;
    private int Monthlyrent;
    private int Sellingprice;
    private int SquareFeet;
    
    
    
    private int proporityNum;
    private static int count =0;

    @Override
    public String toString() {
        return Nickname; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Propority() {
    count++;
    proporityNum = count;
    }

    public int getSquareFeet() {
        return SquareFeet;
    }

    public void setSquareFeet(int SquareFeet) {
        this.SquareFeet = SquareFeet;
    }

    
    
    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAptNo() {
        return AptNo;
    }

    public void setAptNo(String AptNo) {
        this.AptNo = AptNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getMonthlyrent() {
        return Monthlyrent;
    }

    public void setMonthlyrent(int Monthlyrent) {
        this.Monthlyrent = Monthlyrent;
    }

    public int getSellingprice() {
        return Sellingprice;
    }

    public void setSellingprice(int Sellingprice) {
        this.Sellingprice = Sellingprice;
    }

    public int getProporityNum() {
        return proporityNum;
    }

    public void setProporityNum(int proporityNum) {
        this.proporityNum = proporityNum;
    }

 

 
    
    
    
}
