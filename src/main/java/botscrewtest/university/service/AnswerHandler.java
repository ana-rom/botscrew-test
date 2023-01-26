package botscrewtest.university.service;

import org.springframework.stereotype.Component;

@Component
public interface AnswerHandler {
    String getAnswer(String userInput);
}
