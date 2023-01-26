package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.DepartmentService;

public class CountOfEmployeesInDepartmentAnswer implements AnswerHandler {
    private final DepartmentService departmentService;

    public CountOfEmployeesInDepartmentAnswer(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public String getAnswer(String userInput) {
        return "The total amount of employees in " + userInput + " department is "
                + departmentService.countEmployeesByDepartmentName(userInput);
    }
}
