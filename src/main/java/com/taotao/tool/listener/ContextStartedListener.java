package com.taotao.tool.listener;

import com.taotao.tool.service.WorkWxService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartedListener implements ApplicationListener<ContextStartedEvent> {

    @Autowired
    private WorkWxService workWxService;

    @Override
    public void onApplicationEvent(@NotNull ContextStartedEvent event) {
        workWxService.sendMessage("application_start_message", null);
    }
}
