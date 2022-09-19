package co.com.ies.pruebas.service.mapper;

import co.com.ies.pruebas.domain.Department;
import co.com.ies.pruebas.domain.Employee;
import co.com.ies.pruebas.domain.Job;
import co.com.ies.pruebas.domain.JobHistory;
import co.com.ies.pruebas.service.dto.DepartmentDTO;
import co.com.ies.pruebas.service.dto.EmployeeDTO;
import co.com.ies.pruebas.service.dto.JobDTO;
import co.com.ies.pruebas.service.dto.JobHistoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link JobHistory} and its DTO {@link JobHistoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface JobHistoryMapper extends EntityMapper<JobHistoryDTO, JobHistory> {
    @Mapping(target = "job", source = "job", qualifiedByName = "jobId")
    @Mapping(target = "department", source = "department", qualifiedByName = "departmentId")
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    JobHistoryDTO toDto(JobHistory s);

    @Named("jobId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    JobDTO toDtoJobId(Job job);

    @Named("departmentId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DepartmentDTO toDtoDepartmentId(Department department);

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);
}
