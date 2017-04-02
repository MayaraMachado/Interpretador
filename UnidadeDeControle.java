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
public class UnidadeDeControle {
    
    
    public UnidadeDeControle(){
    }
    
    public int getInstrucao(ProgramCounter pc){
        int a = 0;
        try {
            a = javaapplication14.Memoria.getPalavra(pc.getInstrucao());
        } catch(IndexOutOfBoundsException m) {
            System.out.println("erro "+ m);
        }
        return a;
    }   
    
    public int verificaInstrucao(int codop){
        switch(codop){
            case 0b000010:
                return 1;
            default:
                return 0;
        }
    }
}
