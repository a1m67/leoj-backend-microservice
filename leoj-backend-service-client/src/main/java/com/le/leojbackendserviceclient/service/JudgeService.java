package com.le.leojbackendserviceclient.service;


import com.le.leojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Component;

@Component
public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);

}
