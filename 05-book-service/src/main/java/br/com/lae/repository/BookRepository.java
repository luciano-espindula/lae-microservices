package br.com.lae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lae.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
