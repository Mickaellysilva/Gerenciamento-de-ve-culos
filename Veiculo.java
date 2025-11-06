public class Veiculo {
    String modelo;
    protected String placa;
    protected int ano;
    protected double precoDiaria;

    public Veiculo(String modelo, String placa, int ano, double precoDiaria){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoDiaria(){
        return precoDiaria;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank() ){
            System.out.println("Modelo do veículo não cadastrado");
        }
        else{
            this.modelo = modelo;
            System.out.println("Modelo do veículo cadastrado com sucesso");
        }
    }

    public void setPlaca(String placa){
        if(placa == null || modelo.isBlank() ){
            System.out.println("Placa do veículo não cadastrada");
        }
        else{
            this.placa = placa;
            System.out.println("Placa do veículo cadastrado com sucesso");
        }
    }

    public void setAno(int ano){
        if(ano!=0){
            this.ano = ano;
            System.out.println("Ano do veículo cadastrado com sucesso");
        }
        else{
            System.out.println("O ano do veículo não está cadastrado");
        }
    }


    public void setPrecoDiaria(double precoDiaria){
        if(precoDiaria>0){
            this.precoDiaria = precoDiaria;
            System.out.println("O preço da diaria é: R$ " +getPrecoDiaria());
        }
        else{
            System.out.println("O preco da diária ainda não foi definido");
        }
    }

    public void mostrarDados(){
        System.out.println("Dados do veículo:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " +getPlaca());
        System.out.println("Ano: " +getAno());
        System.out.println("Preço da diária: R$ " + getPrecoDiaria());
    }

    public void calcularCusto(int dias){
        double precoTotal = dias * getPrecoDiaria();
        System.out.println(" O valor do veículo " +getModelo() + " por " + dias +" dias  é " + precoTotal );
    }
}
