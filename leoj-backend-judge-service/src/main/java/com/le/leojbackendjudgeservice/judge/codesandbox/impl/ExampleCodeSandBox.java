package com.le.leojbackendjudgeservice.judge.codesandbox.impl;



import com.le.leojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.le.leojbackendmodel.model.codesandbox.JudgeInfo;
import com.le.leojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.le.leojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest request) {

        List<String> inputList = request.getInputList();
        ExecuteCodeResponse response = new ExecuteCodeResponse();
        response.setOutputList(inputList);
        response.setMessage("代码执行成功");
        response.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getValue());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        response.setJudgeInfo(judgeInfo);
        return response;
    }
}
