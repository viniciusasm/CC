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
public class Calculos extends absPropriedades
{
        
    public void Calcular()
    {
        if(getOp().equals("+"))
            setRes(getN1() + getN2());
        if(getOp().equals("-"))
            setRes(getN1() - getN2());
        if(getOp().equals("/"))
            setRes(getN1() / getN2());
        if(getOp().equals("*"))
            setRes(getN1() * getN2());
        setResultado(getRes().toString());
    }    
}
