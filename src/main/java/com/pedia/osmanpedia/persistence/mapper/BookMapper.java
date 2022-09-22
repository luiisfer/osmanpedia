package com.pedia.osmanpedia.persistence.mapper;


import com.pedia.osmanpedia.domain.BookDomain;
import com.pedia.osmanpedia.persistence.entity.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LiteratureMapper.class , PublishingMapper.class})
public interface BookMapper {

    @Mappings({
            @Mapping(source = "idBook",target = "bookId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "isbn",target = "isbnId"),
            @Mapping(source = "url",target = "urlString"),
            @Mapping(source = "contenido",target = "contentString"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "literatureCategory",target = "literatureCategoryDomain"),
            @Mapping(source = "publishingHouse",target = "publishingHouseDomain"),
            @Mapping(source = "idPublishingHouse",target = "publishingId"),
            @Mapping(source = "idLiteratureCategory",target = "categoryId")
    })

    BookDomain toBook(Book bookDomain);


    List<BookDomain> toBooks(List<Book> bookDomains);


    @InheritInverseConfiguration
    Book toBookDomain(BookDomain book);
}
