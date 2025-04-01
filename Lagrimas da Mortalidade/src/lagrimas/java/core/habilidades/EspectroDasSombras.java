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
//Permite criar clones sombrios para enganar inimigos ou atacar múltiplos alvos.

public class EspectroDasSombras extends Habilidade {
    protected boolean onCoolDown;

    public EspectroDasSombras() {
        this.nome = "Espectro das Sombras";
        this.energia = 5.5f;
        this.duracao = 2.2f;
        this.coolDown = 3.3F;
        this.beneficio = EBeneficio.DANO;
        this.efeito = EEfeito.CLONES;
        this.onCoolDown = false;
    }

    @Override
    public void utilizar() {
        setOnCoolDown(true);
        
    }

    @Override
    public void atualizar() {
        setOnCoolDown(false);
    }  

    @Override
    public void desativar() {
        super.desativar(); 
    }

    @Override
    public Combinacao ativar(Poder poder) {
        return super.ativar(poder);
    }

    @Override
    public void setCoolDown(float coolDown) {
        super.setCoolDown(coolDown);
    }

    @Override
    public void setDuracao(float duracao) {
        super.setDuracao(duracao);
    }

    @Override
    public void setEnergia(float energia) {
        super.setEnergia(energia); 
    }

    public void setOnCoolDown(boolean onCoolDown) {
        this.onCoolDown = onCoolDown;
    }
    
}
