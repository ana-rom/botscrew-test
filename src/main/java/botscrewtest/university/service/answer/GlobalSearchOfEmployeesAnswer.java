package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.LectorService;

public class GlobalSearchOfEmployeesAnswer implements AnswerHandler {
    private final LectorService lectorService;

    public GlobalSearchOfEmployeesAnswer(LectorService lectorService) {
        this.lectorService = lectorService;
    }

    @Override
    public String getAnswer(String userInput) {
        return lectorService.findAllByLectorNameContaining(userInput)
                .toString()
                .replace("[", "")
                .replace("]", "");
    }
}
