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
public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String peso, String altura)
    {
        super(peso, altura);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.DPeso = Double.parseDouble(this.peso);
            this.DAltura = Double.parseDouble(this.altura);            
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de converção!";
        }
    }
    
}
