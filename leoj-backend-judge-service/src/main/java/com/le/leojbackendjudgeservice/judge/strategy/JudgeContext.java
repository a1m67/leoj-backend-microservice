package com.le.leojbackendjudgeservice.judge.strategy;


import com.le.leojbackendmodel.model.codesandbox.JudgeInfo;
import com.le.leojbackendmodel.model.dto.question.JudgeCase;
import com.le.leojbackendmodel.model.entity.Question;
import com.le.leojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
