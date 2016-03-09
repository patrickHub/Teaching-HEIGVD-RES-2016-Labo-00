/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;

/**
 *
 * @author PatrickDesle
 */
public class Orchestra {
    
   private LinkedList<IInstrument> instrument = new LinkedList<>();
   public int getNumberOfInstruments(){
       return instrument.size();
   }
   
   public void addInstrument(IInstrument inst){
       this.instrument.add(inst);
   }
   public LinkedList<String> makeMusic(){
       LinkedList<String> music = new LinkedList<>();
       for(IInstrument inst : instrument){
           music.add(inst.play());
       }
       return music;
   }
   
    
}
