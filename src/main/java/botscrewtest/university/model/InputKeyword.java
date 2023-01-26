package botscrewtest.university.model;

public enum InputKeyword {
    AVERAGE_SALARY("average salary"),
    COUNT_OF_EMPLOYEES("count of employee"),
    GLOBAL_SEARCH("search by"),
    HEAD_OF_DEPARTMENT("head of"),
    STATISTICS("statistics"),
    NO_INFORMATION(" ");

    private final String input;

    InputKeyword(String input) {
        this.input = input;
    }

    public static InputKeyword getInput(String userInput) {
        for (InputKeyword keyword : InputKeyword.values()) {
            if (userInput.contains(keyword.input)) {
                return keyword;
            }
        }
        return InputKeyword.NO_INFORMATION;
    }
}
