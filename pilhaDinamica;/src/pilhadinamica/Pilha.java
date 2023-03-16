/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhadinamica;

public class Pilha {
    int tamanho;
    No topo;
    
    public Pilha(){
        tamanho =0;
        topo = null;
    }
    
    boolean estaVazia(){
        return tamanho ==0;
    }
    
    public void empilhar(Object info){
        No no = new No(info);
        if(!estaVazia()){
        no.ponteiro = topo;//topo novo aponta para o antigo
        }
        topo = no;
        tamanho++;
    }
    public Object Desimpilhar(){
        if(estaVazia()){
        return "pilha vazia";
        }
        Object info = topo.info;
        topo = topo.ponteiro;
        tamanho--;
        return info;
    }
    
    Object topo(){
    if(estaVazia())
        return "pilha vazia";
    else
        return topo.info;
    }
    

}

