/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author n226fg1
 */
public class Validacao
{
    public String mensagem;
    public String num1;
    public String num2;
    public Double n1;
    public Double n2;
    
    public void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(num1);
            this.n2 = Double.parseDouble(num2);
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de Converção";
        }
    }
}
