package pers.jyz.bootlaunch2.utils;

import lombok.Data;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@Data
public class AjaxResponse {
    private int errCode;
    private String errMsg;
    private int statusCode;
    private Object data = null;

    @Contract(pure = true)
    private AjaxResponse() {}

    @NotNull
    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setErrCode(0);
        ajaxResponse.setErrMsg("ok");
        ajaxResponse.setStatusCode(200);
        ajaxResponse.setData(data);

        return ajaxResponse;
    }

    @NotNull
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setErrCode(0);
        ajaxResponse.setErrMsg("ok");
        ajaxResponse.setStatusCode(200);

        return ajaxResponse;
    }
}
