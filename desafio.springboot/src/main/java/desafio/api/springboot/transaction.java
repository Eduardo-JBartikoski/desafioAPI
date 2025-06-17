package desafio.api.springboot;

import java.time.OffsetDateTime;

public class transaction {

    private double valor;
    private OffsetDateTime dataHora;

    public transaction(final double valor, final OffsetDateTime dataHora){
        this.valor = valor;
        this.dataHora = dataHora;

    }

    public double getValor() {
        return valor;
    }
    public OffsetDateTime getDataHora() {
        return dataHora;
    }

}


