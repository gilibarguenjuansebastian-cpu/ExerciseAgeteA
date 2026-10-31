/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.DailyDeath;
import java.util.List;

/**
 *objetivo: controlador muertes diario 
 * @author gilib
 * fecha: 29/10/2026
 */
public interface IDailyDeathsController {
    public void insert(DailyDeath dailyDeath) throws Exception;
    public void update(DailyDeath dailyDeath) throws Exception;
    public void delete(long id) throws Exception;
    public DailyDeath find(long id) throws Exception;
    public List<DailyDeath> findAll() throws Exception;

}
