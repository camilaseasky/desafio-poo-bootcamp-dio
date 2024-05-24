package br.com.dio.desafio.dominio;

import lombok.Data;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Data
public class Professor {

    private String nome;
    private Set<Conteudo> alocacoesEmConteudos = new HashSet<>();
    private Set<Conteudo> conteudosMinistrados = new HashSet<>();

    public void ministrarConteudo() throws Exception {
        Optional<Conteudo> conteudoParaMinistrar = alocacoesEmConteudos.stream().findFirst();
        if(conteudoParaMinistrar.isPresent()) {
            this.getConteudosMinistrados().add(conteudoParaMinistrar.get());
            this.getAlocacoesEmConteudos().remove(conteudoParaMinistrar.get());
        } else {
            throw new Exception("Você não está alocado em nenhum conteúdo até o momento.");
        }
    }


}
