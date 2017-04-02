/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.ArrayList;

/**
 *
 * @author Maaih
 */
public class Memoria {
    
    private static ArrayList memoria;
    
    public Memoria(){
        memoria = new ArrayList();
        addPalavrasTeste();
    }
    
    public static ArrayList getMemoria(){
        return memoria;
    }
    
    public static void setMemoria(int i, int palavra){
        memoria.set(i, (int)palavra);
    }
    
    public static int getPalavra(int i){
        return (int) memoria.get(i);
    }
    
    public static void addPalavra(int palavra){
        memoria.add((int)palavra);
    }
    
    private void addPalavrasTeste(){
        addPalavra(0b000000_0000000011_0000000010_000011); // 2+3 = 5
        addPalavra(0b000000_0000000011_0000000110_000011); // 6+3 = 9
        addPalavra(0b000010_0000000000_0000000100_000000); // jmp instruçao 4 
        addPalavra(0b000000_0000000011_0000000110_000101); // ignora  
        addPalavra(0b000000_0000000011_0000000110_000101); // 6-3 = 3
        addPalavra(0b000000_0000000001_0000000110_000101); //  6-1 = 5
    }
}
