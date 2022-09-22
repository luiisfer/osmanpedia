package com.pedia.osmanpedia.domain.repository;



import com.pedia.osmanpedia.domain.BookDomain;

import java.util.List;
import java.util.Optional;

public interface BookRepositoryDomain {

    List<BookDomain> getAll();

    Optional<BookDomain> getBook(int idBook);

    Optional<List<BookDomain>> getByIsbnDomain(int isbn);

    Optional<List<BookDomain>> getEstadoDomain(boolean estado);

    BookDomain save(BookDomain bookDomain);

    void delete(int idBook);
}
