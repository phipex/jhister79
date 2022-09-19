package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Country;
import co.com.ies.pruebas.domain.Location;
import co.com.ies.pruebas.service.dto.CountryDTO;
import co.com.ies.pruebas.service.dto.LocationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Location} and its DTO {@link LocationDTO}.
 */
@Mapper(componentModel = "spring")
public interface LocationMapper extends EntityMapper<LocationDTO, Location> {
    @Mapping(target = "country", source = "country", qualifiedByName = "countryId")
    LocationDTO toDto(Location s);

    @Named("countryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CountryDTO toDtoCountryId(Country country);
}
