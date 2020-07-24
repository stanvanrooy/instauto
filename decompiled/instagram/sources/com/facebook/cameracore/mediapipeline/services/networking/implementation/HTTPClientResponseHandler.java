package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public class HTTPClientResponseHandler implements ResponseHandler {
    public final Object handleResponse(HttpResponse httpResponse) {
        HTTPResponse hTTPResponse = new HTTPResponse();
        hTTPResponse.statusCode = httpResponse.getStatusLine().getStatusCode();
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = content.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                content.close();
                hTTPResponse.content = byteArrayOutputStream.toByteArray();
                return hTTPResponse;
            }
        }
    }
}
