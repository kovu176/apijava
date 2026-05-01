package dev.java10x.CadastroNinja.Ninjas;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private   String nome;
    private   String email;
    private int idade;

    @ManyToOne // um ninja so pode ter uma missao  por vez
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missao;

    //teste de comentario
    public NinjaModel()
    {

    }
    public NinjaModel( String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
