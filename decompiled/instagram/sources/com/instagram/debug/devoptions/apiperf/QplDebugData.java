package com.instagram.debug.devoptions.apiperf;

import android.util.JsonWriter;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0ID;
import p000X.AnonymousClass0IU;
import p000X.AnonymousClass0KW;
import p000X.AnonymousClass0QD;

public class QplDebugData {
    public int mDuration;
    public String mEndThreadName;
    public ArrayList mExtras;
    public short mLastActionId;
    public final int mMarkerId;
    public final String mMarkerName;
    public final long mMonotonicStartTimestamp;
    public final List mPoints;
    public String mStartThreadName;
    public final int mUniqueIdentifier;

    public void addPoint(QplPointDebugData qplPointDebugData) {
        this.mPoints.add(qplPointDebugData);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QplDebugData) || ((QplDebugData) obj).mUniqueIdentifier != this.mUniqueIdentifier) {
            return false;
        }
        return true;
    }

    public String getStatus() {
        return AnonymousClass0IU.A00(this.mLastActionId);
    }

    public int hashCode() {
        return Integer.valueOf(this.mUniqueIdentifier).hashCode();
    }

    public String toFormattedString() {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("\t");
        try {
            jsonWriter.beginObject();
            jsonWriter.name("action").value(getStatus());
            jsonWriter.name("annotations").beginObject();
            ArrayList arrayList = this.mExtras;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jsonWriter.name((String) it.next()).value((String) it.next());
                }
            }
            jsonWriter.endObject();
            jsonWriter.name("points").beginArray();
            for (QplPointDebugData qplPointDebugData : this.mPoints) {
                jsonWriter.beginObject();
                jsonWriter.name("name").value(qplPointDebugData.mName);
                if (!qplPointDebugData.mData.isEmpty()) {
                    jsonWriter.name("data").value(qplPointDebugData.mData);
                }
                jsonWriter.name("timestamp").value(qplPointDebugData.mTimestamp - this.mMonotonicStartTimestamp);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.name(RealtimeProtocol.DIRECT_V2_THREAD).beginObject();
            jsonWriter.name("end").value(this.mEndThreadName);
            jsonWriter.name("start").value(this.mStartThreadName);
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException e) {
            AnonymousClass0QD.A05("QplDebugData", "failed to format QPL event details", e);
        }
        return stringWriter.toString();
    }

    public QplDebugData(AnonymousClass0ID r4) {
        ArrayList arrayList;
        this.mMonotonicStartTimestamp = TimeUnit.NANOSECONDS.toMillis(r4.A0F);
        int i = r4.A04;
        this.mMarkerId = i;
        this.mUniqueIdentifier = r4.A0A;
        this.mMarkerName = AnonymousClass0KW.A00(i);
        this.mDuration = r4.A01();
        this.mLastActionId = r4.A0L;
        if (r4.A03() != null) {
            arrayList = new ArrayList(r4.A03());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mStartThreadName = Thread.currentThread().getName();
        this.mPoints = new ArrayList();
    }

    public void updateData(AnonymousClass0ID r3) {
        ArrayList arrayList;
        this.mDuration = r3.A01();
        this.mLastActionId = r3.A0L;
        if (r3.A03() != null) {
            arrayList = new ArrayList(r3.A03());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mEndThreadName = Thread.currentThread().getName();
    }
}
