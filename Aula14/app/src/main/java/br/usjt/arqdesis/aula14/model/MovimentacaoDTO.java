package br.usjt.arqdesis.aula14.model;

import java.util.GregorianCalendar;

/**
 * Created by marcoaurelio on 10/18/16.
 */

public class MovimentacaoDTO {

    double valor;
    String descricao;

    public MovimentacaoDTO(String description, double value) {
        setValor(value);
        setDescricao(description);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
