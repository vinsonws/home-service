package cn.vinsonws.home.main;

import cn.hutool.core.io.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author Vinsonws
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Value("${home.dir.sqlite}")
    private String sqlitePath;

    @PostConstruct
    public void init() {
        if (!FileUtil.exist(sqlitePath)) {
            FileUtil.mkdir(sqlitePath);
        }
    }
}
