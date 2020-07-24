package com.facebook.cameracore.mediapipeline.services.externalasset.implementation;

import com.facebook.cameracore.mediapipeline.services.externalasset.interfaces.ExternalAssetLocalDataSource;
import com.facebook.cameracore.mediapipeline.services.externalasset.interfaces.ExternalAssetResponse;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                return url.getPath();
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        File file = new File(localFilePath);
        byte[] bArr = new byte[((int) file.length())];
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            dataInputStream.readFully(bArr);
            ExternalAssetResponse externalAssetResponse = new ExternalAssetResponse();
            externalAssetResponse.buffer = bArr;
            externalAssetResponse.length = (int) file.length();
            externalAssetResponse.completed = true;
            nativeDataPromise.setValue(externalAssetResponse);
            dataInputStream.close();
            return true;
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        } catch (Throwable ) {
            throw th;
        }
    }

    public String getStreamingURI(String str, String str2) {
        String localFilePath = getLocalFilePath(str);
        if (localFilePath != null) {
            File file = new File(localFilePath);
            if (file.isFile()) {
                return file.toURI().toString();
            }
        }
        return null;
    }
}
