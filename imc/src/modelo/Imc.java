/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author n226fg1
 */
public class Imc  extends absPropriedades implements intMetodos
{

    public Imc(Double DPeso, Double DAltura)
    {
        super(DPeso, DAltura);
        Executar();
    }

    @Override
    public void Executar()
    {
        Double resultado = this.DPeso / (this.DAltura * this.DAltura); 
        DecimalFormat df = new DecimalFormat("0.##");
        this.imc = df.format(resultado);
        
        if (resultado < 16)
        {
            this.classificacao = "magreza grave";
            this.consequencia = "Insuficiência cardíaca, anemia grave, enfraquecimento do sistema imunológico";
        }
        if (resultado >= 16 && resultado <17)
        {
            this.imc = resultado.toString();
            this.classificacao = "magreza moderada";
            this.consequencia = "Infertilidade, queda de cabelo, falta da menstruação";
        }
        if (resultado >= 17 && resultado <18.5)
        {
            this.classificacao = "magreza leve";
            this.consequencia = "Estresse, ansiedade,fadiga";
        }
        if (resultado >= 18.5 && resultado < 25)
        {
            this.classificacao = "saudável";
            this.consequencia = "Menor risco para doenças";
        }
        if (resultado >= 25 && resultado <30)
        {
            this.classificacao = "sobpeso";
            this.consequencia = "Fadiga,varizes,má circulação";
        }
        if (resultado >= 30 && resultado < 35)
        {
            this.classificacao = "Obesidade Grau I";
            this.consequencia = "Diabetes,infarto,angina,aterosclerose";
        }
        if (resultado >= 35 && resultado < 40)
        {
            this.classificacao = "Obesidade Grau II";
            this.consequencia = "Apneia do sono,falta de ar";
        }
        if (resultado >= 40 )
        {
            this.classificacao = "Obesidade Grau II";
            this.consequencia = "Refluxo,infarto,AVC,dificuldade de locomoção,escaras";
        }
    }
    
}
