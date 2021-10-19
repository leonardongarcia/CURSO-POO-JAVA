package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();

        c1.setDono("Jubileu");
        c2.setDono("Creuza");

        c1.setNumConta(1111);
        c2.setNumConta(2222);

        c1.abrirConta("cp");
        c2.abrirConta("cc");

        c1.depositar(100);
        c2.depositar(200);

        c1.sacar(250);
        c2.sacar(250);

        c1.depositar(20);
        c2.depositar(12);

        c1.pagarMensal();
        c2.pagarMensal();

        c1.fecharConta();
        c2.fecharConta();

        c1.statusConta();
        c2.statusConta();
    }
}
