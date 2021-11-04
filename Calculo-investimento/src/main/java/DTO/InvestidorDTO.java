package DTO;

public class InvestidorDTO {

    //Atributos

    private String email;
    private String nome;
    private String cpf;
    private int periodoDeAplicacaoMeses;
    private double valorPrevisto;

    //Métodos construtores

    public InvestidorDTO() {
    }

    public InvestidorDTO(String email, String nome, String cpf, int periodoDeAplicacaoMeses, double valorPrevisto) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
        this.valorPrevisto = valorPrevisto;
    }
}
