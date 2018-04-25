package Modelo;

public class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String num1;
    protected String num2;
    protected String op;
    protected Double n1;
    protected Double n2;
    protected Double resultado;
    protected String resposta;

    public absPropriedades(String num1, String num2, String op)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public absPropriedades(String op, Double n1, Double n2)
    {
        this.op = op;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    
    
    @Override
    public void Somar(Double n1, Double n2)
    {
    }

    @Override
    public void Subtrair(Double n1, Double n2)
    {
    }

    @Override
    public void Multiplicar(Double n1, Double n2)
    {
    }

    @Override
    public void Dividir(Double n1, Double n2)
    {
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }
    
    
}
