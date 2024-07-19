package com.le.leojbackendserviceclient.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.le.leojbackendmodel.model.dto.question.QuestionQueryRequest;
import com.le.leojbackendmodel.model.entity.Question;
import com.le.leojbackendmodel.model.entity.QuestionSubmit;
import com.le.leojbackendmodel.model.vo.QuestionVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;

/**
 * @author 孟乐航
 * @description 针对表【question(题目)】的数据库操作Service
 * @createDate 2024-05-24 02:56:16
 */
@FeignClient(name = "leoj-backend-question-service", path = "/api/question/inner")

public interface QuestionFeignClient extends IService<Question> {

    //
    @GetMapping("/get/id")
    Question getQuestionById(@RequestParam("questionId") long questionId);

    @GetMapping("/question_submit/get/id")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId);

    @PostMapping("/question_submit/update")
    boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);


}
