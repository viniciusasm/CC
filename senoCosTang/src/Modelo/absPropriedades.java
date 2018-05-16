package Modelo;

public class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String numero;
    protected Double n1;
    protected Double seno;
    protected Double cosseno;
    protected Double tangente;
    protected String resposta;

    public absPropriedades(String numero)
    {
        this.numero = numero;
    }

    public absPropriedades(double n1)
    {
        this.n1 = n1;
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }

    @Override
    public void Executar()
    {
    }
}
