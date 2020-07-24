package com.facebook.rsys.log.gen;

public abstract class LogPersistenceProxy {
    public abstract void deleteLog(String str);

    public abstract void writeLog(CallSummaryInfo callSummaryInfo, String str);
}
