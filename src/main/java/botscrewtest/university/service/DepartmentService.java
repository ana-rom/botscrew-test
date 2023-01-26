package botscrewtest.university.service;

import botscrewtest.university.model.Department;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {
    Optional<Department> getByDepartmentName(String departmentName);

    String findHeadOfDepartmentByDepartmentName(String departmentName);

    long countEmployeesByDepartmentName(String departmentName);

    BigDecimal getAverageSalaryByDepartmentName(String departmentName);

    Map<String, Long> countEmployeesAndGroupByDegreeByDepartmentName(String departmentName);
}
