public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota Corolla", "ABC-1234", 2022, "Gasolina", 250.0, 4);

        System.out.println("mostrar dados do carro");
        carro1.mostrarDados();

        carro1.calcularCusto(7);
        carro1.calcularCusto(11);
        
        Motocicleta moto1 = new Motocicleta("Honda CG 160", "XYZ-9876", 2023, 100.0, "Gasolina");

        System.out.println(" mostrar dados da motocicleta");
        moto1.mostrarDados();

        moto1.calcularCusto(3);
        moto1.calcularCusto(7);
    }
}
