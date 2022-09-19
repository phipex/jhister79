package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Country;
import co.com.ies.pruebas.domain.Region;
import co.com.ies.pruebas.service.dto.CountryDTO;
import co.com.ies.pruebas.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Country} and its DTO {@link CountryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CountryMapper extends EntityMapper<CountryDTO, Country> {
    @Mapping(target = "region", source = "region", qualifiedByName = "regionId")
    CountryDTO toDto(Country s);

    @Named("regionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RegionDTO toDtoRegionId(Region region);
}
