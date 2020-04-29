/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Klients {
    private String vards;
    private int ID;
    private double balance;

    public Klients(String vards, int ID, double balance) {
        this.vards = vards;
        this.ID = ID;
        this.balance = balance;
    }

    public Klients() {
        
    }
    
    public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
