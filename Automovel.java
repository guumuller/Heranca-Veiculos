package heranca;
import java.util.Scanner;

public class Automovel extends Veiculos{
    String Marca;
    String Modelo;
    int Ano;
    int NumPortas;

    public void setMarca(String marca){
        Marca = marca;
    }
    public String getRaca(){
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
    public int getAno(){
        return Ano;
    }

    public void setNumPortas(int numPortas){
        NumPortas = numPortas;
    }
    public int getNumPortas(){
        return NumPortas;
    }

    public void exibirDadosAutomovel(){
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + Ano);
        System.out.println("Numero de Potas: " + NumPortas);
    }

    public void salvarAutomovel(){
            Scanner input = new Scanner(System.in);
            System.out.println("Informe a marca do automovel: ");
            setMarca( input.next());
            System.out.println("Informe o modelo do automovel: ");
            setModelo( input.next());
            System.out.println("Informe o ano do automovel: ");
            setAno( input.nextInt());
            System.out.println("Informe o numero de portas do automovel: ");
            setNumPortas( input.nextInt());
            System.out.println("Informe a cor do automovel: ");
            setCor( input.next());
            System.out.println("Informe a placa do automovel: ");
            setPlaca( input.next());
            System.out.println("Informe o proprietario do automovel: ");
            setProprietario( input.next());
            System.out.println("Informe o tipo do automovel: ");
            setTipo( input.next());
    }
}