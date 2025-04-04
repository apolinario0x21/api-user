package com.example.api_user.repository;

import com.example.api_user.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Aqui podemos adicionar métodos personalizados, se necessário
    // Por exemplo, encontrar produtos por nome, categoria, etc.

}
