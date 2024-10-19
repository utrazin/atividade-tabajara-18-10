public class Gerente extends Funcionario {   
    public Gerente(String nome) {
        super(nome);
    }

    public double calcularSalario() {
        return 20000;
    }

    public String descreverResponsabilidades() {
        return "Desenvolver programas";
    }
}
