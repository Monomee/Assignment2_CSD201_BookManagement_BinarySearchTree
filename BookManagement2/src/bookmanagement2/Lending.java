/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement2;

/**
 *
 * @author PC
 */
public class Lending {
     private String bCode;
    private String rCode;
    private int state;

    public Lending() {
    }

    public Lending(String bCode, String rCode, int state) {
        this.bCode = bCode;
        this.rCode = rCode;
        this.state = state;
    }

    public String getbCode() {
        return bCode;
    }

    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public int getState() {
        return state;
    }

    public void setState(int state)  throws IllegalArgumentException{
        if (state < 0 || state > 2){
            throw new IllegalArgumentException("Invalid state (must be from 0 to 2)");
        }else{
            this.state = state;
        }
    }

    @Override
    public String toString() {
        String output = String.format("%-15s|%-15s|%-15d", bCode, rCode, state);
        return output;
    }
}
