package botscrewtest.university.strategy;

import botscrewtest.university.model.InputKeyword;
import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.UserInputParserService;
import botscrewtest.university.util.InputAnswerMapCreator;
import java.util.EnumMap;
import org.springframework.stereotype.Component;

@Component
public class AnswerStrategyImpl implements AnswerStrategy {
    private final InputAnswerMapCreator inputAnswerMapCreator;
    private final UserInputParserService userInputParserService;

    public AnswerStrategyImpl(InputAnswerMapCreator inputAnswerMapCreator,
                              UserInputParserService userInputParserService) {
        this.inputAnswerMapCreator = inputAnswerMapCreator;
        this.userInputParserService = userInputParserService;
    }

    @Override
    public String findAnswerByUserInput(String userInput) {
        String parsedInput = userInputParserService.parseUserInput(userInput);
        EnumMap<InputKeyword, AnswerHandler> inputAnswerMap =
                inputAnswerMapCreator.createInputAnswerMap();
        return inputAnswerMap.get(InputKeyword.getInput(userInput)).getAnswer(parsedInput);
    }
}
