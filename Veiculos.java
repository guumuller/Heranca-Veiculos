package heranca;

public class Veiculos{
    String Cor;
    String Placa;
    String Proprietario;
    String Tipo;

    public void setCor(String cor){
        Cor = cor;
    }
    public String getCor(){
        return Cor;
    }

    public void setPlaca(String placa){
        Placa = placa;
    }
    public String getIdade(){
        return Placa;
    }

    public void setProprietario(String proprietario){
        Proprietario = proprietario;
    }
    public String getGenero(){
        return Proprietario;
    }

    public void setTipo(String tipo){
        Tipo = tipo;
    }
    public String getPeso(){
        return Tipo;
    }

    public void exibirDados(){
        System.out.println("Cor: " + Cor);
        System.out.println("Placa: " + Placa);
        System.out.println("Proprietario: " + Proprietario);
        System.out.println("Tipo: " + Tipo);
    }

    
}

