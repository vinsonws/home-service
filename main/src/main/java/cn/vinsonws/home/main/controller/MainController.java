package cn.vinsonws.home.main.controller;

import cn.vinsonws.home.common.bean.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinsonws
 */
@RestController
@Slf4j
@RequestMapping(value = "/main")
public class MainController {
    @GetMapping("/background/url")
    public ResultBean<String> getBackgroundImgUrl() {
        return ResultBean.success("https://cn.bing.com/th?id=OHR.SGIMontenegro_EN-US4280095085_UHD.jpg");
    }
}
