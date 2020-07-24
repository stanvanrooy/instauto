package com.instagram.realtimeclient;

public class RealtimeUnsubscribeCommand {
    public static final String COMMAND = "unsubscribe";
    public String command;
    public String topic;

    public RealtimeUnsubscribeCommand() {
    }

    public RealtimeUnsubscribeCommand(String str) {
        this.command = COMMAND;
        this.topic = str;
    }
}
