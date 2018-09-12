package com.soecode.lyf.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyController {
@RequestMapping("/getInfo/{param}")
@ResponseBody
public String getInformation(@PathVariable("param")String param){
    return "this is demo\t"+param;
}

}
