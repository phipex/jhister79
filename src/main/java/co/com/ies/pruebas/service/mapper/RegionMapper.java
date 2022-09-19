package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Region;
import co.com.ies.pruebas.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Region} and its DTO {@link RegionDTO}.
 */
@Mapper(componentModel = "spring")
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {}
