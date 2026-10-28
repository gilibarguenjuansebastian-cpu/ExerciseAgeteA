/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Line;
import java.util.List;

/**
 *
 * @author gilib
 */
public interface ILineController {
    public void insert(Line line) throws Exception;
    public void update(Line line) throws Exception;
    public void delete(long id) throws Exception;
    public Line find(long id) throws Exception;
    public List<Line> findAll() throws Exception;

}
