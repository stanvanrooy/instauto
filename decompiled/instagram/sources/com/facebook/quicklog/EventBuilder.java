package com.facebook.quicklog;

public interface EventBuilder {
    EventBuilder annotate(String str, double d);

    EventBuilder annotate(String str, long j);

    EventBuilder annotate(String str, String str2);

    void report();

    EventBuilder setLevel(int i);
}
