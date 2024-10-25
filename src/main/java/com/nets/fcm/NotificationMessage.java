package com.nets.fcm;

import java.util.Map;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class NotificationMessage {
    private String recipientToken;
    private String title;
    private String body;
    private String image;
    private Map<String, String> data;
}
