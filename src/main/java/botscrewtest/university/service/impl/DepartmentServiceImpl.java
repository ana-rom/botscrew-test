package botscrewtest.university.service.impl;

import botscrewtest.university.exception.DataProcessingException;
import botscrewtest.university.model.Department;
import botscrewtest.university.repository.DepartmentRepository;
import botscrewtest.university.service.DepartmentService;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private static final int DEGREE_INDEX = 0;
    private static final int COUNT_INDEX = 1;
    private static final String PLURAL_SUFFIX = "s";
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Optional<Department> getByDepartmentName(String departmentName) {
        return Optional.ofNullable(departmentRepository.getByDepartmentName(departmentName));
    }

    @Override
    public String findHeadOfDepartmentByDepartmentName(String departmentName) {
        if (getByDepartmentName(departmentName).isPresent()) {
            return getByDepartmentName(departmentName).get().getHeadOfDepartmentName();
        }
        throw new DataProcessingException("There is no " + departmentName + " department. "
                + "Check your input");
    }

    @Override
    public long countEmployeesByDepartmentName(String departmentName) {
        return departmentRepository.countEmployeesByDepartmentName(departmentName);
    }

    @Override
    public BigDecimal getAverageSalaryByDepartmentName(String departmentName) {
        return departmentRepository.getAverageSalaryByDepartmentName(departmentName);
    }

    @Override
    public Map<String, Long> countEmployeesAndGroupByDegreeByDepartmentName(String departmentName) {
        return departmentRepository.countEmployeesAndGroupByDegreeByDepartmentName(departmentName)
                .stream()
                .collect(Collectors.toMap(obj -> String.valueOf(obj[DEGREE_INDEX]).toLowerCase()
                                + PLURAL_SUFFIX, obj -> (Long) obj[COUNT_INDEX]));
    }
}
