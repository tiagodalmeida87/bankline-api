package com.dio.santanderdev.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santanderdev.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {


}
