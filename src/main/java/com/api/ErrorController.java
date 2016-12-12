package com.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("error")
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {

    private static final String ERROR_PATH = "/error";
    private static final String ERROR_VIEW = "error";

    @RequestMapping(value = ERROR_PATH)
    public String error() {
        return ERROR_VIEW;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}