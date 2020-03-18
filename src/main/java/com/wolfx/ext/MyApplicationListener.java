package com.wolfx.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-18 15:28
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("ApplicationListener...监听到事件：" + event);
    }
}
