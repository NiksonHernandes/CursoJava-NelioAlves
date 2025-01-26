package entities;

import java.util.Date;
import java.util.Objects;

public class Registro {
    private String nome;
    private Date moment;

    public Registro(String nome, Date moment) {
        this.nome = nome;
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registro registro)) return false;
        return Objects.equals(nome, registro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
}
