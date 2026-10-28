    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.model;

/**
 * objetivo:modelo galpon
 * @author gilib
 * fecha: 22/10/2026
 */
public class Shed {

    private int number;
    private String status;

    public Shed() {
    }

    public Shed(int number, String state) {
        this.number = number;
        this.status = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setState(String state) {
        this.status = state;
    }

    @Override
    public String toString() {
        return number + " - " + status;
    }

}
