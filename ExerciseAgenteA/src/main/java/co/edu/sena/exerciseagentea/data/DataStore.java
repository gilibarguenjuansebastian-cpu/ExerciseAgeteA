/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.data;

import co.edu.sena.exerciseagentea.model.DailyDeath;
import co.edu.sena.exerciseagentea.model.Line;
import co.edu.sena.exerciseagentea.model.Shed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * objetivo: almacen de datos o listas de tados
 * fecha:28/10/2026
 * @author gilib
 */
public class DataStore {
    private static final List<Shed> sheds = new ArrayList<>();
    private static final List<Line> lines = new ArrayList<>();
    private static final List<DailyDeath> dailyDeaths = new ArrayList<>();
    static{
       //carga inicial de datos
        sheds.add(new Shed(1,"Disponible"));
        sheds.add(new Shed(2,"Ocupado"));
        
        lines.add(new Line (1,"gallina babcock"));
        lines.add(new Line(2,"gallina jersey blanca gigante"));
        
        dailyDeaths.add(new DailyDeath(1,2,LocalDate.now(),LocalTime.now(),"Maria","7-2026","se enfermo"));
    }

    public static List<Shed> getSheds() {
        return sheds;
    }
    public static List<Line> getLines() {
        return lines;
    }
    public static List<DailyDeath> getDailyDeaths(){
        return dailyDeaths;
    }
}
