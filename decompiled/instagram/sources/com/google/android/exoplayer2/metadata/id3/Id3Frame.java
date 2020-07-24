package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    public int describeContents() {
        if (this instanceof MlltFrame) {
            return 0;
        }
        boolean z = this instanceof ChapterFrame;
        return 0;
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
