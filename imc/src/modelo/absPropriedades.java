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
public abstract class absPropriedades
{
    public String peso;
    public String altura;
    public String mensagem;
    public String imc;
    public String classificacao;
    public String consequencia;
    public Double DPeso;
    public Double DAltura;
    
    public absPropriedades(String peso, String altura)
    {
        this.peso = peso;
        this.altura = altura;
    }

    public absPropriedades(Double DPeso, Double DAltura)
    {
        this.DPeso = DPeso;
        this.DAltura = DAltura;
    }
}
