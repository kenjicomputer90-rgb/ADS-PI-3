package com.loja_roupas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		this.telefone=telefone;
	}

	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome=nome;
	}

    // getters e setters
}