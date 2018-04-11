/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author n226fg1
 */
public class Controle extends absPropriedades implements intMetodos
{

    public Controle(String peso, String altura)
    {
        super(peso, altura);
        Executar();
    }

    @Override
    public void Executar()
    {
       this.mensagem = "";
       Validacao validacao = new Validacao(this.peso, this.altura);
       if (this.mensagem.equals(""))
       {
           Imc imc = new Imc(validacao.DPeso,validacao.DAltura);
           this.imc = imc.imc;
           this.classificacao = imc.classificacao;
           this.consequencia = imc.consequencia;
       }
       
       else
       {
           this.imc = validacao.mensagem;
       }   
    }
    
}
