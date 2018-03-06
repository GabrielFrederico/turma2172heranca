    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

/**
 *
 * @author markson
 */
public class Funcionario extends Pessoa {
        
        private String cargo;
        private float salario, valorHora, qtdeHora;
        //implementar um método para calcular o salario com base na hora e no valor da hora

    public Funcionario(String cargo, float salario, float valorHora, float qtdeHora, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.valorHora = valorHora;
        this.qtdeHora = qtdeHora;
    }
    
    public float calculaSalario(float valorHora, float qtdeHora) {
       return valorHora * qtdeHora;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }
        
        
        
    
}
