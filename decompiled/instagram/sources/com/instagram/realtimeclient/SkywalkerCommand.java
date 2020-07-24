package com.instagram.realtimeclient;

import java.util.HashMap;
import java.util.List;

public class SkywalkerCommand {
    public HashMap mPublishTopicToPayload;
    public List mSubscribeTopics;
    public List mUnsubscribeTopics;

    public SkywalkerCommand() {
    }

    public SkywalkerCommand(List list, List list2, HashMap hashMap) {
        this.mSubscribeTopics = list;
        this.mUnsubscribeTopics = list2;
        this.mPublishTopicToPayload = hashMap;
    }
}
