package botscrewtest.university.service.impl;

import botscrewtest.university.service.DataReaderService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.stereotype.Service;

@Service
public class DataReaderServiceImpl implements DataReaderService {
    @Override
    public String readData(String filePath) {
        File file = new File(filePath);
        String inputData;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            inputData = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Can't read the file", e);
        }
        return inputData;
    }
}
