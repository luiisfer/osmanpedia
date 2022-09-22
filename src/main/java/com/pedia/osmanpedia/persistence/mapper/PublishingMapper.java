package com.pedia.osmanpedia.persistence.mapper;

import com.pedia.osmanpedia.domain.PublishingHouseDomain;
import com.pedia.osmanpedia.persistence.entity.PublishingHouse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PublishingMapper {

    @Mappings({
            @Mapping(source = "idPublishingHouse",target = "publishingHouseId"),
            @Mapping(source = "nombre",target = "publishing"),
            @Mapping(source = "estado",target = "active")
    })
    PublishingHouseDomain toPublishing(PublishingHouse publishingHouse);

    @InheritInverseConfiguration
    PublishingHouse toPublishingDomain(PublishingHouseDomain publishingHouseDomain);
}
