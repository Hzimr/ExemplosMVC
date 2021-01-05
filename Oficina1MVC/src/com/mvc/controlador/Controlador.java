package com.mvc.controlador;

import com.mvc.modelo.ModeloConta;

public class Controlador {
    
    
    public boolean creditarValor(double valor, int numeroConta, int agencia) {
        ModeloConta conta = new ModeloConta ();
        if(numeroConta==conta.getNumeroConta() && agencia==conta.getAgencia()){
            conta.setSaldoAtual(valor + conta.getSaldoAtual()); 
            System.out.println(conta.getSaldoAtual());
            return true;
        }else{
            return false;
        }
    }
    
    public boolean debitarValor(double valor, int numeroConta, int agencia){
        ModeloConta conta = new ModeloConta ();
        if(numeroConta==conta.getNumeroConta() && agencia==conta.getAgencia()&& conta.getSaldoAtual() - valor >= 0 ){
            conta.setSaldoAtual(conta.getSaldoAtual() - valor); 
            System.out.println(conta.getSaldoAtual());
            
            return true;
        }else{
            return false;
                
        }
    }
    
    
    
}