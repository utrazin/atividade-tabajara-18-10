public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }
    
    public double calcularSalario() {
        return 10000;
    }

    public String descreverResponsabilidades() {
        return "Gerir a equipe";
    }
}
