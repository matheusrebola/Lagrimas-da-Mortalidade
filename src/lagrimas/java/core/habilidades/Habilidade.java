/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lagrimas.java.core.habilidades;

import lagrimas.java.core.combinacoes.Combinacao;
import lagrimas.java.core.enums.EBeneficio;
import lagrimas.java.core.enums.EEfeito;
import lagrimas.java.core.poderes.Poder;

/**
 *
 * @author matheus
 */
public abstract class Habilidade {
    protected String nome;
    protected float energia;
    protected float duracao;
    protected float coolDown;
    protected EBeneficio beneficio;
    protected EEfeito efeito;
    
    public Habilidade(String nome, float energia, float duracao, float coolDown, EBeneficio beneficio, EEfeito efeito) {
        this.nome = nome;
        this.energia = energia;
        this.duracao = duracao;
        this.coolDown = coolDown;
        this.beneficio = beneficio;
        this.efeito = efeito;
    }

    public Habilidade() {
    }

    public String getNome() {
        return nome;
    }

    public float getEnergia() {
        return energia;
    }

    public float getDuracao() {
        return duracao;
    }

    public float getCoolDown() {
        return coolDown;
    }

    public EBeneficio getBeneficio() {
        return beneficio;
    }

    public EEfeito getEfeito() {
        return efeito;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public void setCoolDown(float coolDown) {
        this.coolDown = coolDown;
    }
    
    public Combinacao ativar(Poder poder){
        return null;
    }
    
    public void desativar(){
        
    }
    
    public void utilizar(){
        
    }
    
    public void atualizar(){
        
    }
}
