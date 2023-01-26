package botscrewtest.university.service.answer;

import botscrewtest.university.service.AnswerHandler;

public class NoInformationAnswer implements AnswerHandler {
    @Override
    public String getAnswer(String userInput) {
        return "No information for input " + userInput;
    }
}
