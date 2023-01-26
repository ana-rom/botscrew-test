package botscrewtest.university;

import botscrewtest.university.service.DataReaderService;
import botscrewtest.university.strategy.AnswerStrategy;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
    private static final String GREETINGS_FILE_PATH = "src/main/resources/greetingsFile.csv";
    private final AnswerStrategy answerStrategy;
    private final DataReaderService dataReaderService;

    public UniversityApplication(AnswerStrategy answerStrategy,
                          DataReaderService dataReaderService) {
        this.answerStrategy = answerStrategy;
        this.dataReaderService = dataReaderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(dataReaderService.readData(GREETINGS_FILE_PATH));
        while (true) {
            System.out.println("Input: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(answerStrategy.findAnswerByUserInput(input));
        }
    }
}
