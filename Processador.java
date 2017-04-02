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
public class Processador {
    
    UnidadeDeControle uc;
    ProgramCounter    pc;
    Decodificador     d;
    Ula               ula;
    int[]             palavra;
    int               codOp;
    int               op1;
    int               op2;
    int               funcao;
            
    
    public Processador(){
        uc = new UnidadeDeControle();
        pc = new ProgramCounter();
        d = new Decodificador();
        ula = new Ula();
    }
    
    public int executar(){
        palavra = d.decodificador(uc.getInstrucao(pc));
        codOp = palavra[0];
        op2 = palavra[1];
        op1 = palavra[2];
        funcao = palavra[3];
        
        switch(uc.verificaInstrucao(codOp) ){
           case 1:
               pc.setContador(op1);
               return op1;
               
           default:
               return ula.interpretacao(funcao, op1, op2);
        }
    }
    
    
    
    public static void main(String[] args) {
        Processador p = new Processador();
        Memoria m = new Memoria();
        
        for(int i = 0; p.pc.getContador() < m.getMemoria().size(); i++){
            System.out.println(p.executar());
        }
        
    }
    
}
