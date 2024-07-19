package com.le.leojbackendjudgeservice.judge.codesandbox.impl;


import com.le.leojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest request) {
        System.out.println("第三方代码沙箱");

        return null;
    }
}
