package com.le.leojbackendjudgeservice.judge;


import com.le.leojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);

}
