/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import java.util.List;

/**
 *
 * @author abkhaldi
 */
public interface IEventRelatedService<T> extends IService<T>{
    List<T> findByEvent(int id);
}
