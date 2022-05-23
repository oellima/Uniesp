package ProjetoContaBancaria.Cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldoDisponivel;

    public Cliente(String nome, String cpf, double saldoDisponivel) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoDisponivel() {
        return this.saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}

