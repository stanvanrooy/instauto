package com.facebook.ffmpeg;

public class FFMpegBadDataException extends Exception {
    public FFMpegBadDataException() {
    }

    public FFMpegBadDataException(String str) {
        super(str);
    }

    public FFMpegBadDataException(String str, Throwable th) {
        super(str, th);
    }

    public FFMpegBadDataException(Throwable th) {
        super(th);
    }
}
