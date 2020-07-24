package com.facebook.proxygen;

import java.util.Map;
import p000X.AnonymousClass000;

public class TraceEvent extends NativeHandleImpl {
    public final long mEnd;
    public final int mID;
    public final String mName;
    public final int mParentID;
    public final long mStart;

    public native void close();

    public native Map getMetaData();

    public long getEnd() {
        return this.mEnd;
    }

    public int getId() {
        return this.mID;
    }

    public String getName() {
        return this.mName;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public long getStart() {
        return this.mStart;
    }

    public String toPrettyJson() {
        StringBuilder sb;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\n  \"name\":\"" + this.mName + "\",\n" + "  \"id\":" + this.mID + ",\n" + "  \"parentID\":" + this.mParentID + ",\n" + "  \"start\":" + this.mStart + ",\n" + "  \"end\":" + this.mEnd + ",\n" + "  \"metaData\":{\n");
        boolean z = true;
        for (Map.Entry entry : getMetaData().entrySet()) {
            if (!z) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(AnonymousClass000.A0J("    \"", (String) entry.getKey(), "\":\""));
            if (((String) entry.getValue()).length() > 100) {
                sb = new StringBuilder();
                sb.append(((String) entry.getValue()).substring(0, 97));
                str = "...\"";
            } else {
                sb = new StringBuilder();
                sb.append((String) entry.getValue());
                str = "\"";
            }
            sb.append(str);
            stringBuffer.append(sb.toString());
            z = false;
        }
        stringBuffer.append("\n  }\n}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TraceEvent(name='" + this.mName + "', " + "id='" + this.mID + "', " + "parentID='" + this.mParentID + "', " + "start='" + this.mStart + "', " + "end='" + this.mEnd + "', " + "metaData='{");
        for (Map.Entry entry : getMetaData().entrySet()) {
            stringBuffer.append(AnonymousClass000.A0N((String) entry.getKey(), ": ", (String) entry.getValue(), ", "));
        }
        stringBuffer.append("}')");
        return stringBuffer.toString();
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public TraceEvent(String str) {
        this.mName = str;
        this.mID = 0;
        this.mParentID = 0;
        this.mStart = 0;
        this.mEnd = 0;
    }

    public TraceEvent(String str, int i, int i2, long j, long j2) {
        this.mName = str;
        this.mID = i;
        this.mParentID = i2;
        this.mStart = j;
        this.mEnd = j2;
    }
}
