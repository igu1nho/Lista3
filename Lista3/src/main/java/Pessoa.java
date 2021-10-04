public class Pessoa{

    public String nome;
    public int cpf;
    public int qtdEnd;
    public Endereco end;


    public Pessoa(String nome, int cpf, int qtdEnd)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;
    }

    public void addEndereco(Endereco end)
    {
        this.end = end;
    }

    public void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Quantidade de endereços cadastrados: " + this.qtdEnd);
        if(this.end == null)
        {
            System.out.println("Essa pessoa não possui um endereço");
        }
        else {
            System.out.println("Endereço: ");
            System.out.println("Rua: " + this.end.getRua());
            System.out.println("Bairro: " + this.end.getBairro());
            System.out.println("Número: " + this.end.getNum());
        }

    }
}
