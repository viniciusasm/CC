package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String numero)
    {
        super(numero);
        Executar();
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.numero);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
        if (this.mensagem.equals(""))
        {
                this.mensagem = this.n1 > 360 ? 
                    "Ângulo deve ser menor que 360 graus" : "";
//            if (this.n1 > 360)
//            {
//                this.mensagem = "Ângulo deve ser menor que 360 graus";
//            }
        }
        
    }
    
    
}
