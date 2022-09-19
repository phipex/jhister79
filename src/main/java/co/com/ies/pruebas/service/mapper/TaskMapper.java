package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Task;
import co.com.ies.pruebas.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
