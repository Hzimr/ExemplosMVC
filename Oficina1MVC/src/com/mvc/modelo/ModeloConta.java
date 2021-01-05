package com.mvc.modelo;


    public class ModeloConta {
        private double saldoAtual= 0.0;
        private int numeroConta = 1;
        private String nomePessoa = "pessoa";
        private String cpf = "123";
        private int agencia = 2;
        
        public double getSaldoAtual() {
            return saldoAtual;
        }

        public void setSaldoAtual(double saldoAtual) {
            this.saldoAtual = saldoAtual;
        }

        public String getNomePessoa() {
            return nomePessoa;
        }

        public void setNomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public int getAgencia() {
            return agencia;
        }

        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }

          
    }
    
