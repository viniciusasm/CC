/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DecimalFormat;

/**
 *
 * @author Rever
 */
public class Calcular extends absPropriedades
{
    
    public Calcular(double n1)
    {
        super(n1);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.seno = Math.sin(Math.toRadians(this.n1));
        this.cosseno = Math.cos(Math.toRadians(this.n1));
        this.tangente = Math.tan(Math.toRadians(this.n1));
        DecimalFormat df = new DecimalFormat("0.##");
        this.resposta = "<html>Seno = " + df.format(this.seno) + "<br>"
                + "Cosseno = " + df.format(this.cosseno) + "<br>"
                + "Tangente = " + df.format(this.tangente) + "</html>";
    }
    
}
