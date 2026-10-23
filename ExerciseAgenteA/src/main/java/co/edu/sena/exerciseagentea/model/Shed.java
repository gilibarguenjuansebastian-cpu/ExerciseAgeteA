    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.model;

import javax.accessibility.AccessibleContext;

/**
 * objetivo:modelo galpon
 * @author gilib
 * fecha: 22/10/2026
 */
public class Shed {

    public static void setnumber(long parseLong) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void setstate(AccessibleContext accessibleContext) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int number;
    private String state;

    public Shed() {
    }

    public Shed(int number, String state) {
        this.number = number;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Shed{" + "number=" + number + ", state=" + state + '}';
    }

}
