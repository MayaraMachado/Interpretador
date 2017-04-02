/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Maaih
 */
public class ProgramCounter {
    
    private int contador;
    
    public ProgramCounter(){
        contador = 0;
    }
    
    public int getInstrucao(){
        return contador++;
    }
   
    public int getContador(){
        return contador;
    }
   
    
    public void setContador(int endereco){
        contador = endereco;
    }
    
    
    
}
