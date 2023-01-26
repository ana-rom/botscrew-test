package botscrewtest.university.util;

import botscrewtest.university.model.InputKeyword;
import botscrewtest.university.service.AnswerHandler;
import botscrewtest.university.service.DepartmentService;
import botscrewtest.university.service.LectorService;
import botscrewtest.university.service.answer.AverageSalaryOfDepartmentAnswer;
import botscrewtest.university.service.answer.CountOfEmployeesInDepartmentAnswer;
import botscrewtest.university.service.answer.DepartmentStatisticsAnswer;
import botscrewtest.university.service.answer.GlobalSearchOfEmployeesAnswer;
import botscrewtest.university.service.answer.HeadOfDepartmentAnswer;
import botscrewtest.university.service.answer.NoInformationAnswer;
import java.util.EnumMap;
import org.springframework.stereotype.Component;

@Component
public class InputAnswerMapCreator {
    private final DepartmentService departmentService;
    private final LectorService lectorService;

    public InputAnswerMapCreator(DepartmentService departmentService, LectorService lectorService) {
        this.departmentService = departmentService;
        this.lectorService = lectorService;
    }

    public EnumMap<InputKeyword, AnswerHandler> createInputAnswerMap() {
        EnumMap<InputKeyword, AnswerHandler> inputKeywordAnswerHandlerEnumMap =
                new EnumMap<>(InputKeyword.class);
        inputKeywordAnswerHandlerEnumMap.put(InputKeyword.AVERAGE_SALARY,
                new AverageSalaryOfDepartmentAnswer(departmentService));
        inputKeywordAnswerHandlerEnumMap.put(InputKeyword.COUNT_OF_EMPLOYEES,
                new CountOfEmployeesInDepartmentAnswer(departmentService));
        inputKeywordAnswerHandlerEnumMap.put((InputKeyword.GLOBAL_SEARCH),
                new GlobalSearchOfEmployeesAnswer(lectorService));
        inputKeywordAnswerHandlerEnumMap.put(InputKeyword.HEAD_OF_DEPARTMENT,
                new HeadOfDepartmentAnswer(departmentService));
        inputKeywordAnswerHandlerEnumMap.put(InputKeyword.STATISTICS,
                new DepartmentStatisticsAnswer(departmentService));
        inputKeywordAnswerHandlerEnumMap.put(InputKeyword.NO_INFORMATION,
                new NoInformationAnswer());
        return inputKeywordAnswerHandlerEnumMap;
    }
}
