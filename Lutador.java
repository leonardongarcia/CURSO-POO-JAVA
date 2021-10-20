package com.company;

public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas,empates;
    private float altura, peso;

    // Métodos especiais

    public Lutador(String nome, // Método construtor
                   String nacionalidade,
                   int idade,
                   float altura,
                   float peso,
                   int vitorias,
                   int derrotas,
                   int empates) {  // Método Constructor

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Métodos acessores e modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (peso < 52.2f) {
            this.categoria = "Inválido";
        }else if (peso <= 70.3f) {
            this.categoria = "Leve";
        }else if (peso <= 83.9f) {
            this.categoria = "Médio";
        }else if (peso <= 120.2f) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválio";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }



    public void apresentar(){
        System.out.println("-------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("com " + getIdade() + " anos");
        System.out.println("e " + getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou " + getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
    }

    public void status() {
        System.out.println("----------STATUS----------");
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }



}
