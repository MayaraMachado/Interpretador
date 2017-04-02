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
public class Decodificador {

    private final int MASCARA_R_FUNCAO = 0b000000_0000000000_0000000000_111111; 
    private final int MASCARA_R_OPERANDO1 = 0b000000_0000000000_1111111111_000000; 
    private final int MASCARA_R_OPERANDO2 = 0b000000_1111111111_0000000000_000000; 
    private final int MASCARA_CODOP = 0b111111_0000000000_0000000000_000000; 
    private final int MASCARA_CODOP_SHIFT = 0b000000_0000000000_0000000000_111111; 
    private final int MASCARA_ENDERECO = 0b000000_1111111111_1111111111_111111; 
    
    
    public int[] decodificador(int palavra){
        int codigoOP = (((palavra & MASCARA_CODOP) >> 26) & MASCARA_CODOP_SHIFT)  ;
        int operando1 = ((palavra & MASCARA_R_OPERANDO1) >> 6);
        int operando2 = (( palavra & MASCARA_R_OPERANDO2) >> 16);
        int funcao = ( palavra & MASCARA_R_FUNCAO);
        
        int[] acao = {codigoOP, operando2, operando1, funcao};
        return acao;
    }

    
}
