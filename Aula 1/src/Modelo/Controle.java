package Modelo;

import javax.swing.JOptionPane;

public class Controle extends javax.swing.JDialog
{   
    public String calcular(String num1, String num2, String operacao)    
    {   
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        String resposta = "";
        try
        {
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2); 
            if (operacao.equals("+"))
                resultado = n1 + n2;
            if (operacao.equals("-"))
                resultado = n1 - n2;
            if (operacao.equals("*"))
                resultado = n1 * n2;
            resposta = resultado.toString();
            if (operacao.equals("/"))
            {
                if (n2 == 0)
                    resposta = "Divisão por 0";
                    else
                    {
                    resultado = n1 / n2;
                    resposta = resultado.toString();
                    }
                    
            }
            
        }
        catch(NumberFormatException e)
        {
           resposta = "erro de conversão";
        }
        
        return resposta;
    }
}
