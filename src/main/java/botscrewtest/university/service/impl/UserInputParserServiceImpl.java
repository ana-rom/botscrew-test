package botscrewtest.university.service.impl;

import botscrewtest.university.service.UserInputParserService;
import org.springframework.stereotype.Service;

@Service
public class UserInputParserServiceImpl implements UserInputParserService {
    private static final String SPLIT_REGEX = "\\W";
    private static final int SEARCH_USER_INPUT_INDEX = 1;

    public String parseUserInput(String input) {
        String[] wordsFromUserInput = input.split(SPLIT_REGEX);
        return wordsFromUserInput[wordsFromUserInput.length - SEARCH_USER_INPUT_INDEX];
    }
}
