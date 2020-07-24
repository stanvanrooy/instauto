package com.facebook.hermes.instrumentation;

public interface HermesMemoryDumper {
    String getId();

    String getInternalStorage();

    void setMetaData(String str);

    boolean shouldSaveSnapshot();
}
