package com.pedia.osmanpedia.domain.service;


import com.pedia.osmanpedia.domain.BookDomain;
import com.pedia.osmanpedia.domain.repository.BookRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepositoryDomain bookRepositoryDomain;

    public List<BookDomain> getAll(){
        return bookRepositoryDomain.getAll();
    }

    public Optional<BookDomain> getBook(int idBook){
        return bookRepositoryDomain.getBook(idBook);
    }

    public Optional<List<BookDomain>>  getBookbyEstado(boolean estado){
        return bookRepositoryDomain.getEstadoDomain(estado);
    }

    public Optional<List<BookDomain>> getByIsbnDomain(int isbn){
        return bookRepositoryDomain.getByIsbnDomain(isbn);
    }

    public BookDomain save(BookDomain bookDomain){
        return bookRepositoryDomain.save(bookDomain);
    }

    public boolean delete(int idBook){
        return getBook(idBook).map(theBook -> {
            bookRepositoryDomain.delete(idBook);
            return true;
        }).orElse(false);
    }
}
