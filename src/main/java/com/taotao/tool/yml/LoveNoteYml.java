package com.taotao.tool.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("love-note")
public class LoveNoteYml {

    private String appId;
    private String appSecret;

    private String tokenSalt;
}
