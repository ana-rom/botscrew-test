package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.DepartmentService;

public class DepartmentStatisticsAnswer implements AnswerHandler {
    private final DepartmentService departmentService;

    public DepartmentStatisticsAnswer(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public String getAnswer(String userInput) {
        return departmentService.countEmployeesAndGroupByDegreeByDepartmentName(userInput)
                .toString()
                .replace("{", "")
                .replace("}", "")
                .replace("=", " - ");
    }
}
