package com.le.leojbackendjudgeservice.judge.codesandbox;


import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandBox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest request);
}
