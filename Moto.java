package heranca;

public class Moto extends Veiculos{
    String Marca;
    String Modelo;
    int Ano;
    String Estilo;

    public void setMarca(String marca){
        Marca = marca;
    }
    public String getMarca(){
        return Marca;
    }

    public void setModelo(String modelo){
        Modelo = modelo;
    }
    public String getModelo(){
        return Modelo;
    }

    public void setAno(int ano){
        Ano = ano;
    }
    public int getAon(){
        return Ano;
    }

    public void setEstilo(String estilo){
        Estilo = estilo;
    }
    public String getEstilo(){
        return Estilo;
    }

    public void exibirDadosMoto(){
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + Ano);
        System.out.println("Estilo" + Estilo);
    }
}