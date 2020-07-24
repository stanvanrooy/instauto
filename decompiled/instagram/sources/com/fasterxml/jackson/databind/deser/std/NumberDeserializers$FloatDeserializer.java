package com.fasterxml.jackson.databind.deser.std;

import com.facebook.react.uimanager.BaseViewManager;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$FloatDeserializer A00 = new NumberDeserializers$FloatDeserializer(Float.class, Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    public static final NumberDeserializers$FloatDeserializer A01 = new NumberDeserializers$FloatDeserializer(Float.TYPE, (Float) null);

    public NumberDeserializers$FloatDeserializer(Class cls, Float f) {
        super(cls, f);
    }
}
