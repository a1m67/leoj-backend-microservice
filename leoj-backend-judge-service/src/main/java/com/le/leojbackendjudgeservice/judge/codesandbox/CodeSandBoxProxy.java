package com.le.leojbackendjudgeservice.judge.codesandbox;

import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CodeSandBoxProxy implements CodeSandBox{
    private CodeSandBox codeSandBox;

    public CodeSandBoxProxy(CodeSandBox codeSandBox) {
        this.codeSandBox = codeSandBox;
    }
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest request) {
        log.info("代码沙箱请求信息" + request.toString());
        ExecuteCodeResponse response = codeSandBox.executeCode(request);
        log.info("代码沙箱响应信息" + response.toString());
        return response;
    }
}
