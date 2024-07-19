package com.le.leojbackendjudgeservice.judge;



import com.le.leojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.le.leojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.le.leojbackendjudgeservice.judge.strategy.JudgeContext;
import com.le.leojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.le.leojbackendmodel.model.codesandbox.JudgeInfo;
import com.le.leojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
