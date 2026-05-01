package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import dev.java10x.CadastroNinja.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String nome;
    private String descricao;
    private Rank rank;

    @OneToMany(mappedBy = "missoes") // uma missao pode conter varios ninjas
    private List<NinjaModel> ninjas;

    public MissoesModel ()
    {

    }

    public MissoesModel(  String nome, String descricao, Rank rank)
    {

        this.nome = nome;
        this.descricao = descricao;
        this.rank = rank;

    }

    public Long getId() {
        return id;
    }

    public void  setId(long id)
    {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Rank getRank()
    {
        return rank;
    }

    public void  setRank(Rank rank)
    {
        this.rank = rank;
    }
}
