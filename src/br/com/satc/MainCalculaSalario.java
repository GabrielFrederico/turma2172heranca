/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Funcionario;

/**
 *
 * @author gabriel.155317
 */
public class MainCalculaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Professor", 20, 20, 20, "Markson", "123", "321");
        
        System.out.println(funcionario.getSalario());
    }
    
}
