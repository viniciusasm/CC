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
public abstract class absPropriedades
{
    private String mensagem;
    private String num1;
    private String num2;
    private Double n1;
    private Double n2;
    private String resultado;
    private Double res;
    private String op;
    
    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String getNum1()
    {
        return num1;
    }

    public void setNum1(String num1)
    {
        this.num1 = num1;
    }

    public String getNum2()
    {
        return num2;
    }

    public void setNum2(String num2)
    {
        this.num2 = num2;
    }

    public Double getN1()
    {
        return n1;
    }

    public void setN1(Double n1)
    {
        this.n1 = n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public void setN2(Double n2)
    {
        this.n2 = n2;
    }

    public String getOp()
    {
        return op;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public String getResultado()
    {
        return resultado;
    }

    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }

    public Double getRes()
    {
        return res;
    }

    public void setRes(Double res)
    {
        this.res = res;
    }

    
}
