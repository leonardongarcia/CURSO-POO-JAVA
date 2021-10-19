package aula05;
import java.util.Scanner;
public class ContaBanco {

    Scanner input = new Scanner(System.in);
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0.0f);
    }


    public void abrirConta(String t){

        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo().equals("cc")) {
            this.setSaldo(50.0f);
        } else if (this.getTipo().equals("cp")) {
            this.setSaldo(150.0f);
        } else
            System.out.println("Tipo de conta inválido!");
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Você não pode fechar a conta com saldo positivo!");
            System.out.println("Por favor! Saque o valor de R$" + this.getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.println("Você não pode fechar a conta com saldo negativo!");
            System.out.println("Por favor! Deposite o valor para cobrir o saldo negativo de R$" + this.getSaldo());
        } else System.out.println("Conta fechada com sucesso!");
               this.setStatus(false);

    }

    public void depositar(float v) {

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else
            System.out.println("Impossível depositar em uma conta fechada!");

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque efetuado na conta de " + this.getDono());

            } else {
                System.out.println("Impossível sacar! Saldo insuficiente");
            }

        } else
            System.out.println("Conta inativa, impossível sacar!");
    }

    public void pagarMensal() {
        float  v = 0;
        if (this.getTipo().equals("cc")) {
            v = 12.0f;
        } else if (this.getTipo().equals("cp")) {
            v = 20.0f;
        }
        if (this.getStatus() && this.getSaldo() > 0){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else if (this.getStatus() && this.getSaldo() <= 0){
            System.out.println("Saldo insuficiente para pagamento da mensalidade!");
        } else
            System.out.println("Impossível pagar conta fechada!");
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int c) {
        this.numConta = c;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }

    public void statusConta() {
        System.out.println("-------STATUS GERAL DA CONTA-------");
        System.out.println("O número da sua conta é: " + this.getNumConta());
        System.out.println("O tipo da sua conta é: " + this.getTipo());
        System.out.println("O dono da conta é: " + this.getDono());
        System.out.println("O saldo da conta é: " + this.getSaldo());
        System.out.println("A conta está aberta? " + this.getStatus());
    }
}


