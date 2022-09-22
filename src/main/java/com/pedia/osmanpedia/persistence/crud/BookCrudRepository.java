package com.pedia.osmanpedia.persistence.crud;

import com.pedia.osmanpedia.persistence.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookCrudRepository extends CrudRepository<Book,Integer> {

    List<Book> findByIdBook(int idBook);

    @Query( value = "SELECT * FROM book WHERE id_book = ?", nativeQuery = true)
    List<Book> getIdBook(int idBook);


    List<Book> findByIsbnOrderByNombreAsc(int isbn);

    Optional<List<Book>> findByEstado(boolean estado);
}
