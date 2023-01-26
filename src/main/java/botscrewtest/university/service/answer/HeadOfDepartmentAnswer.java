package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.DepartmentService;

public class HeadOfDepartmentAnswer implements AnswerHandler {
    private final DepartmentService departmentService;

    public HeadOfDepartmentAnswer(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public String getAnswer(String userInput) {
        return "Head of " + userInput + " department is "
                + departmentService.findHeadOfDepartmentByDepartmentName(userInput);
    }
}
