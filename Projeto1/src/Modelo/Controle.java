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
public class Controle
{
    public String mensagem;
    public String num1;
    public String num2;
    public String op;
    public String resultado;
    public void Calcular()
    {
     this.mensagem = "";
     Validacao validacao = new Validacao();
     validacao.num1 = this.num1;
     validacao.num2 = this.num2;
     validacao.Validar();
     if (validacao.mensagem.equals(""))
     {
         Calculos calculos = new Calculos();
         calculos.n1 = validacao.n1;
         calculos.n2 = validacao.n2;
         calculos.op = this.op;
         calculos.Calcular();
         this.resultado = calculos.resultado;
     }
     else
     {
         this.mensagem = validacao.mensagem;
     }
    }
}
