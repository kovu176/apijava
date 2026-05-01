package dev.java10x.CadastroNinja.Ninjas;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //cria e atualiza o construtor

@AllArgsConstructor //cria e atualiza o construtor
@Data //cria os getters e setters (encapsulamento)
public class NinjaModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private   String nome;

    @Column(unique = true) // isso determina que essa coluna não se repita ( 2 pessoas ter o mesmo usuario ou email)
    private   String email;
    private int idade;

    @ManyToOne // um ninja so pode ter uma missao  por vez
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missao;




}
