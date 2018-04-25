package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String num1, String num2, String op)
    {
        super(num1, num2, op);
        Validar();
    }
    
    private final void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.num1);
            this.n2 = Double.parseDouble(this.num2);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão \n";
        }
        if (this.mensagem.equals(""))
        {
            if (this.op.equals("/") && this.n2 == 0)
            {
                this.mensagem += "Divisão por zero";
            }
        }
    }
    
}
