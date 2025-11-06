public class Motocicleta extends Veiculo{
    private String tipoCombustivel;

    public Motocicleta(String modelo, String placa, int ano, double precoDiaria, String tipoCombustivel){
        super(modelo, placa, ano, precoDiaria);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.isBlank()){
            System.out.println("Tipo de combustível não definido");
        }
        else{
            this.tipoCombustivel = tipoCombustivel;
            System.out.println("Combustível definido com sucesso");
        }
    }

    public void mostrarDados(){
        System.out.println("Dados do veículo:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " +getPlaca());
        System.out.println("Ano: " +getAno());
        System.out.println("Tipo de combustivel: " +getTipoCombustivel()) ;
        System.out.println("Preço da diária: R$ " + getPrecoDiaria());
    }

    public void calcularCusto(int dias){
        if(dias>5){
            double precoTotal = (getPrecoDiaria() * dias)*0.97;
            System.out.println("O valor a ser pago pela motocicleta por" + dias + " dias é: R$ " +precoTotal);

        }
        else{
            double precoTotal = (getPrecoDiaria() * dias);
            System.out.println("O valor a ser pago pela motocicleta por " + dias + " dias é: R$ " +precoTotal);
        }
    }

}
