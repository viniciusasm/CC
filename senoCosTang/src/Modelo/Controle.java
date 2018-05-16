package Modelo;

public class Controle extends absPropriedades
{
    
    public Controle(String numero)
    {
        super(numero);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        absPropriedades validacao = new Validacao(this.numero);
        if (validacao.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(validacao.n1);
            this.resposta = calcular.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
}
