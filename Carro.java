public class Carro extends Veiculo{
    private int numeroDePortas;
    private String tipoCombustivel;

    public Carro(String modelo, String placa, int ano, String tipoCombustivel, double precoDiaria, int numeroDePortas){
        super(modelo, placa, ano, precoDiaria);
        this.numeroDePortas = numeroDePortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }


    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        if(numeroDePortas<2){
            System.out.println("Esse carro não existe");
        }
        else{
            this.numeroDePortas = numeroDePortas;
            System.out.println(" esse carro possui " +getNumeroDePortas() + " portas");
        }
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.isBlank()){
            System.out.println("Tipo de combustível não definido");
        }
        else{
            this.tipoCombustivel = tipoCombustivel;
            System.out.println("Combustível definido com sucesso.");
        }
    }

    public void mostrarDados(){
        System.out.println("Dados do veículo:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " +getPlaca());
        System.out.println("Ano: " +getAno());
        System.out.println("Número de portas: " +getNumeroDePortas());
        System.out.println("Tipo de combustivel: " +getTipoCombustivel()) ;
        System.out.println("Preço da diária: R$ " + getPrecoDiaria());
    }

    public void calcularCusto(int dias){
        if(dias>10){
           double precoTotal = (getPrecoDiaria() * dias )*0.95;
            System.out.println("O valor a ser pago pelo carro por " +dias + " dias é: R$ " +precoTotal);

        }
        else{
            double precoTotal = (getPrecoDiaria() * dias);
            System.out.println("O valor a ser pago pelo carro por " +dias + " dias é: R$ " +precoTotal);
        }
    }
}
