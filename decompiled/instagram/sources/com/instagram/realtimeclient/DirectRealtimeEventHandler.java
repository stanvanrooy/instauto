package com.instagram.realtimeclient;

public abstract class DirectRealtimeEventHandler extends RealtimeEventHandler {
    public abstract void onRealtimeEvent(String str, RealtimeEvent realtimeEvent);
}
