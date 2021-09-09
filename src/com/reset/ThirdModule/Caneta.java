package com.reset.ThirdModule;

public class Caneta {
    // Atributos da classe caneta
    String modelo; // O modelo da caneta (i.e. "Jinhao x750")
    String cor; // A cor da tinta na caneta
    float ponta; // espessura da ponta/pena da caneta (i.e 0.5)
    float carga = 100f; // Percentual de carga na caneta
    boolean tampada; // status da tampa da caneta


    public Caneta() { // Método constructor. Inicializa o objeto com as expressões contidas nele.
        this.setPonta(0.5f); // espessura da ponta/pena da caneta (i.e 0.5)
        this.tampada = true;
    }

    public void setPonta(float ponta){ // Método setter
        this.ponta = ponta;
    }

    public void setModelo(String modelo) {
        // Método para atribuir o modelo da caneta. setModelo recebe o parâmetro modelo
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        // Método para atribuir a cor da tinta da caneta. setModelo recebe como parâmetro a cor
        this.cor = cor;
    }

    public float getPonta() { // Método getter
        // Método para retornar a espessura da ponta/pena da caneta
        return ponta;
    }

    public float getCarga() {
        // Método para retornar o estado da carga
        return carga;
    }

    public void setTampada(boolean tampada) {
        // Método para tampar/destampar a caneta
        this.tampada = tampada;
    }

    public void escrever(int linha){
        // Método para escrever uma quantidade de linhas(parâmetro), o que afeta a carga da caneta.
        if (!this.tampada){
            for (int i = 0; i<linha; i++) {
                this.carga -= (float) 0.01;
            }
            this.tampada = true; // Após escrever, tampar a caneta novamente
        } else{
            System.out.println("Erro de execução. A caneta está tampada");
        }
    }
}
