package botscrewtest.university.model;

public enum Degree {
    ASSISTANT("assistant"),
    ASSOCIATE_PROFESSOR("associate professor"),
    PROFESSOR("professor");

    private String value;

    Degree(String value) {
        this.value = value;
    }
}
