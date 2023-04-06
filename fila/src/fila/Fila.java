/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {

    int tamanho;
    No inicio;
    No fim;

    public Fila() {
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    boolean estaVazia() {
        return tamanho == 0;
    }

    void enfileirar(Object info) {
        No no = new No(info);
        if (estaVazia()) {
            this.inicio = no;
        } else {
            this.fim.ponteiro = no;//final antigo aponta para o final novo
        }
        this.fim = no;
        tamanho++;
    }

    Object desinfilerar() {

        if (estaVazia()) {
            return null;
        } else {
            tamanho--;
            Object info = this.inicio.info;
            this.inicio = this.inicio.ponteiro;
            return info;
        }
    }

    Object primeiroFila() {
        if (estaVazia()) {
            return null;
        } else {
            return this.inicio.info;
        }
    }
    
    String exibirFila(){
        String tarefas="";
        No no = inicio;
        for (int i = 0; i < this.tamanho; i++) {
            tarefas += no.info;
            no = no.ponteiro;
        }
        return tarefas;
    }

}


