/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Dependente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gabriel.155317
 */
public class MainDataNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date data = new Date();
        Date dataNascimento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimento = sdf.parse("16/07/2000");
        Cliente pai = new Cliente(data, "Gabriel", "123", "666");
        Dependente filho = new Dependente(pai, dataNascimento, "Leirbag", "321", "123");
                
        System.out.println(filho.getIdade());
    }
}