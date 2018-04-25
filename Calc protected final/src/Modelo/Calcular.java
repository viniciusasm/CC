package Modelo;

public class Calcular extends absPropriedades
{

    public Calcular(String op, Double n1, Double n2)
    {
        super(op, n1, n2);
        Executar();
    }
 

    public final void Executar()
    {
        if(this.op.equals("+")) this.Somar(this.n1, this.n2);
        if(this.op.equals("-")) this.Subtrair(this.n1, this.n2);
        if(this.op.equals("*")) this.Multiplicar(this.n1, this.n2);
        if(this.op.equals("/")) this.Dividir(this.n1, this.n2);
    }

    @Override
    public final void Dividir(Double n1, Double n2)
    {
        this.resposta = String.valueOf(this.n1 / this.n2); 
    }

    @Override
    public final void Multiplicar(Double n1, Double n2)
    {
        this.resposta = String.valueOf(this.n1 * this.n2); 
    }

    @Override
    public final void Subtrair(Double n1, Double n2)
    {
        this.resposta = String.valueOf(this.n1 - this.n2);
    }

    @Override
    public final void Somar(Double n1, Double n2)
    {
        this.resposta = String.valueOf(this.n1 + this.n2);
    }
    
    
}
