package com.facebook.stash.core;

import java.io.File;

public interface FileStash extends Stash {
    File getFile(String str);

    File getFilePath(String str);

    File insertFile(String str);
}
