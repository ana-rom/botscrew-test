package botscrewtest.university.service;

import java.util.List;

public interface LectorService {
    List<String> findAllByLectorNameContaining(String lectorNameInfix);
}
