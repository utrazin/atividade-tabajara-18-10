public class SistemaRH {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente("Enzo");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mathias");

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário: R$" + String.format("%.2f", gerente.calcularSalario()));
        System.out.println("Responsabilidades: " + gerente.descreverResponsabilidades());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("Salário: R$" + String.format("%.2f", desenvolvedor.calcularSalario()));
        System.out.println("Responsabilidades: " + desenvolvedor.descreverResponsabilidades());

        System.out.println();
    }
}