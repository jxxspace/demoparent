package com.example.demo_web.controller;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sample.domain.City;
import com.sample.service.CityService;
import io.swagger.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@ComponentScan(basePackages= {"com.sample.service"})
@MapperScan("com.sample.dao")
@Api(value = "TestBootController" ,description = "测试")
public class TestBootController {
    private static final Logger log = LoggerFactory.getLogger(TestBootController.class);
    @Autowired
    private CityService cityService;


    @GetMapping(value = "/api/city")
    @ApiOperation(value = "根据城市名称获取城市信息", notes = "根据城市名称获取城市信息" ,consumes = "application/json" ,produces = "application/json",httpMethod = "GET")
    @ApiResponses({@ApiResponse(code = 500,message = "内部数据处理错误",response = Exception.class),
            @ApiResponse(code = 0,message = "操作成功",response = Map.class),
            @ApiResponse(code = 500,message = "操作失败",response = Map.class)})
    public City findOneCity(@ApiParam(name = "cityName", value = "姓名") @RequestParam(required = true) String cityName, HttpServletResponse response) {
        City c = cityService.findCityByName(cityName);
        log.info(JSON.toJSONString(c));
        return c;
    }

    @ResponseBody
    @RequestMapping(value = "/jsonTest3", method = RequestMethod.POST)
    public List<String> jsonTest3(HttpServletRequest request,
                                  HttpServletResponse response) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("你好");
        return list;

    }
}
