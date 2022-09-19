package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Department;
import co.com.ies.pruebas.domain.Location;
import co.com.ies.pruebas.service.dto.DepartmentDTO;
import co.com.ies.pruebas.service.dto.LocationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Department} and its DTO {@link DepartmentDTO}.
 */
@Mapper(componentModel = "spring")
public interface DepartmentMapper extends EntityMapper<DepartmentDTO, Department> {
    @Mapping(target = "location", source = "location", qualifiedByName = "locationId")
    DepartmentDTO toDto(Department s);

    @Named("locationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    LocationDTO toDtoLocationId(Location location);
}
