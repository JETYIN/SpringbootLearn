package com.example.dylan.dylan.common;

import com.example.dylan.web.ErrorInfo;
import com.example.dylan.web.MyException;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/3/26.此类创建用作全局的异常页面处理类
 */
@ControllerAdvice//定义统一异常处理类，不用到每个Controller中进行定义
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";//定义统一异常页面

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);//指定出现异常跳转页面
        return mav;
    }

    //自定义异常处理，返回json数据,在页面请求错误时，将是返回json数据
    @ExceptionHandler(value = MyException.class)
    public ErrorInfo<String> errorMessage(HttpServletRequest request, MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setUrl(request.getRequestURI().toString());
        errorInfo.setMessage(e.getMessage());
        errorInfo.setData("data");
        return errorInfo;

    }

}
