public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Igor", 1234567890, 1);
        Endereco e = new Endereco("Av João de Camargo", "Centro", 510);

        p.addEndereco(e);
        p.mostraInfo();

    }
}
