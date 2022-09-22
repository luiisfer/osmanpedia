package com.pedia.osmanpedia.persistence;

import com.pedia.osmanpedia.domain.BookDomain;
import com.pedia.osmanpedia.domain.repository.BookRepositoryDomain;
import com.pedia.osmanpedia.persistence.crud.BookCrudRepository;
import com.pedia.osmanpedia.persistence.entity.Book;
import com.pedia.osmanpedia.persistence.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository  implements BookRepositoryDomain {

    @Autowired
    private BookCrudRepository bookCrudRepository;

    @Autowired
    private BookMapper mapper;

    public List<BookDomain> getAll(){
        List<Book> books = (List<Book>) bookCrudRepository.findAll();
        return mapper.toBooks(books);
    }

    @Override
    public Optional<List<BookDomain>> getByIsbnDomain(int isbn) {
        return Optional.empty();
    }

    @Override
    public Optional<List<BookDomain>> getEstadoDomain(boolean estado) {
        Optional<List<Book>> existentes= bookCrudRepository.findByEstado(estado);
        return existentes.map(prods -> mapper.toBooks(prods));
    }

    @Override
    public BookDomain save(BookDomain bookDomain) {
        return mapper.toBook(bookCrudRepository.save(mapper.toBookDomain(bookDomain)));
    }

    public List<Book> getByIsbn(int isbn){
        return (List<Book>) bookCrudRepository.findByIsbnOrderByNombreAsc( isbn);
    }

    public Optional<List<Book>> getEstado(boolean estado){
        return bookCrudRepository.findByEstado(estado);
    }

    public Optional<BookDomain> getBook(int idBook){
        return bookCrudRepository.findById(idBook).map(theBook -> mapper.toBook(theBook));
    }


    @Override
    public void delete (int idBook){
        bookCrudRepository.deleteById(idBook);
    }
}
