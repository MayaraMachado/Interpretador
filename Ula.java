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
public class Ula {
    
    private final int SOMA = 0b000011;
    private final int SUB = 0b000101;
    private final int MUL = 0b000111;
    private final int AND = 0b001001;
    private final int OR = 0b001011;

    
    
    public int interpretacao(int funcao, int eax, int ebx){
        switch (funcao){
            case SUB:
                return eax - ebx;               
            case MUL:
                return eax *ebx;                
            case AND:
                return eax & ebx;
            case OR:
                return eax | ebx;
            default:
                return eax + ebx;
             
        }
    }
    
    
    
}
