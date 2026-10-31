/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *objetivo: modelo muertes diario 
 * @author gilib
 * fecha: 29/10/2026
 */
public class DailyDeath {
    private long id;
    private long deaths;
    private LocalDate date;
    private LocalTime time;
    private String user;
    private String code;
    private String observations;
   

    public DailyDeath() {
    }

    public DailyDeath(long id, long deaths, LocalDate date, LocalTime time, String user, String code, String observations) {
        this.id = id;
        this.deaths = deaths;
        this.date = date;
        this.time = time;
        this.user = user;
        this.code = code;
        this.observations = observations;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "DailyDeath{" + "id=" + id + ", deaths=" + deaths + ", date=" + date + ", time=" + time + ", user=" + user + ", code=" + code + ", observations=" + observations + '}';
    }
    

  

    
}
