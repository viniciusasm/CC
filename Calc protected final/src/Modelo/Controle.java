package Modelo;

public class Controle extends absPropriedades
{
    public Controle(String num1, String num2, String op)
    {
        super(num1, num2, op);
        Executar();
    }
    
    private final void Executar()
    {
        this.mensagem = "";
        absPropriedades validacao = new Validacao(num1, num2, op);
        if (validacao.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(op, validacao.n1, validacao.n2);
            this.resposta = calcular.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
