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
public class Validacao extends absPropriedades
{
    
    public void Validar()
    {
        setMensagem("");
        
        try
        {
            setN1(Double.parseDouble(getNum1())); 
            
        }
        catch (NumberFormatException e)
        {
            setMensagem("Erro de Converção no campo 1 \n");
        }
        
        try
        {
           
            setN2(Double.parseDouble(getNum2()));
        }
        catch (NumberFormatException e)
        {
            setMensagem(this.getMensagem() + "Erro de Converção no campo 2");
            
        }
        
        if (this.getNum2().equals("0") && this.getOp().equals("/"))
        {
            this.setMensagem(this.getMensagem() + "Divisão por 0");
        }
        
    }
}
