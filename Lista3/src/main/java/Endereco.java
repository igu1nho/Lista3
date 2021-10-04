public class Endereco {

    public String rua;
    public String bairro;
    public int num;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Endereco(String rua, String bairro, int num)
    {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }
}
