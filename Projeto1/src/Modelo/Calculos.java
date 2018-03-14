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
public class Calculos
{
    public Double n1;
    public Double n2;
    public Double res;
    public String op;
    public String resultado;
    
    public void Calcular()
    {
        if(this.op.equals("+"))
            this.res = this.n1 + this.n2;
        if(this.op.equals("-"))
            this.res = this.n1 - this.n2;
        if(this.op.equals("/"))
            this.res = this.n1 / this.n2;
        if(this.op.equals("*"))
            this.res = this.n1 * this.n2;
        this.resultado = this.res.toString();
    }    
}
