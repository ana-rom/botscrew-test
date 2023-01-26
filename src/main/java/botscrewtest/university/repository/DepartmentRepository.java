package botscrewtest.university.repository;

import botscrewtest.university.model.Department;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getByDepartmentName(String departmentName);

    @Query(value = "SELECT COUNT(dl.lector_id) FROM departments d "
            + "JOIN departments_lectors dl ON d.id = dl.department_id "
            + "WHERE d.department_name = :name",
            nativeQuery = true)
    long countEmployeesByDepartmentName(@Param("name") String departmentName);

    @Query(value = "SELECT ROUND(AVG(l.salary), 2) FROM lectors l "
            + "JOIN departments_lectors dl ON l.id = dl.lector_id "
            + "JOIN departments d ON dl.department_id = d.id "
            + "WHERE d.department_name = :name",
            nativeQuery = true)
    BigDecimal getAverageSalaryByDepartmentName(@Param("name") String departmentName);

    @Query(value = "SELECT l.degree, COUNT(l.degree) FROM lectors l "
            + "JOIN departments_lectors dl ON l.id = dl.lector_id "
            + "JOIN departments d ON dl.department_id = d.id "
            + "WHERE d.department_name = :name "
            + "GROUP BY l.degree",
            nativeQuery = true)
    List<Object[]> countEmployeesAndGroupByDegreeByDepartmentName(@Param("name")
                                                                     String departmentName);
}
