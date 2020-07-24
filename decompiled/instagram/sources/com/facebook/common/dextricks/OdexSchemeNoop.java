package com.facebook.common.dextricks;

import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;

public final class OdexSchemeNoop extends OdexScheme {

    public final class NoopCompiler extends OdexScheme.Compiler {
        public void compile(InputDex inputDex) {
        }
    }

    public OdexSchemeNoop() {
        super(16, new String[0]);
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
    }

    public String getSchemeName() {
        return "OdexSchemeNoop";
    }

    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new NoopCompiler();
    }
}
