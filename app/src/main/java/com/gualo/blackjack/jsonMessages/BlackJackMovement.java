package com.gualo.blackjack.jsonMessages;

import edu.uclm.esi.common.jsonMessages.JSONMessage;
import edu.uclm.esi.common.jsonMessages.JSONable;

/**
 * Created by Gualo on 11/4/15.
 */
public class BlackJackMovement extends JSONMessage {
    @JSONable
    private String tipo;
    @JSONable
    private String user;
    @JSONable
    private String cartas;

    public BlackJackMovement(String user,String cartas, String tipo) {
        super(true);
        this.user=user;
        this.cartas=cartas;
        this.tipo = tipo;
    }
    public BlackJackMovement(String tipo) {
        super(true);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCartas() {
        return cartas;
    }

    public void setCartas(String cartas) {
        this.cartas = cartas;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
