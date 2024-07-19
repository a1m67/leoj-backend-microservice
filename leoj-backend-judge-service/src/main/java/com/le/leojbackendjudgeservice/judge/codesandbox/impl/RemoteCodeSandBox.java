package com.le.leojbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

import com.le.leojbackendcommon.common.ErrorCode;
import com.le.leojbackendcommon.exception.BusinessException;
import com.le.leojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.le.leojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱
 */
public class RemoteCodeSandBox implements CodeSandBox {
    // 定义鉴权请求头保证安全性
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest request) {
        System.out.println("远程代码沙箱");
        String url = "http://192.168.137.134:8090/executeCode";
        String json = JSONUtil.toJsonStr(request);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER,AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR ,"executeCode remoteSandbox error" + responseStr);
        }


        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
