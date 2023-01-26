package botscrewtest.university.service.impl;

import botscrewtest.university.model.Lector;
import botscrewtest.university.repository.LectorRepository;
import botscrewtest.university.service.LectorService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LectorServiceImpl implements LectorService {
    private final LectorRepository lectorRepository;

    public LectorServiceImpl(LectorRepository lectorRepository) {
        this.lectorRepository = lectorRepository;
    }

    @Override
    public List<String> findAllByLectorNameContaining(String lectorNameInfix) {
        return lectorRepository.findAllByLectorNameContaining(lectorNameInfix)
                .stream().map(Lector::getLectorName).toList();
    }
}
