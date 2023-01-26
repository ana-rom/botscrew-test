package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.DepartmentService;

public class AverageSalaryOfDepartmentAnswer implements AnswerHandler {
    private final DepartmentService departmentService;

    public AverageSalaryOfDepartmentAnswer(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public String getAnswer(String userInput) {
        return "The average salary of " + userInput + " department is "
                + departmentService.getAverageSalaryByDepartmentName(userInput);
    }
}
