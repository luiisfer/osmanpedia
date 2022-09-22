package com.pedia.osmanpedia.persistence.mapper;


import com.pedia.osmanpedia.domain.LiteratureCategoryDomain;
import com.pedia.osmanpedia.persistence.entity.LiteratureCategory;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LiteratureMapper {

    @Mappings({
            @Mapping(source = "idLiteratureCategory",target = "categoryId"),
            @Mapping(source = "nombre",target = "category"),
            @Mapping(source = "estado",target = "active")
    })


    LiteratureCategoryDomain toLiterature(LiteratureCategory literatureCategoryDomain);

    @InheritInverseConfiguration
    LiteratureCategory toLiteratureDomain(LiteratureCategoryDomain literatureCategory);



}
