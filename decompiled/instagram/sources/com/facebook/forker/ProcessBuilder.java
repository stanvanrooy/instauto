package com.facebook.forker;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;

public final class ProcessBuilder implements Cloneable {
    public static final String TAG = "fb-ProcessBuilder";
    public ArrayList mArgv;
    public byte[] mEnvironCache;
    public ArrayList mEnvironKeys;
    public ArrayList mEnvironValues;
    public String mExecutable;
    public BitSet mKeepFds;
    public int[] mStreamDispositions;
    public File mTmpDir;

    public ProcessBuilder setenv(String str, String str2) {
        if (str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
            throw new IllegalArgumentException("environment variables cannot contain NUL");
        } else if (str.indexOf(61) == -1) {
            unsetenv(str);
            this.mEnvironKeys.add(str);
            this.mEnvironValues.add(str2);
            this.mEnvironCache = null;
            return this;
        } else {
            throw new IllegalArgumentException("environment variable names cannot contain '='");
        }
    }

    public static File genDefaultTmpDir(Context context) {
        return context.getDir("fb-forker-tmp", 0);
    }

    private byte[] makeEnvironBlock() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList != null && this.mEnvironCache == null) {
            this.mEnvironCache = buildEnvironBlock(arrayList, this.mEnvironValues);
        }
        return this.mEnvironCache;
    }

    public ProcessBuilder addArgument(String str) {
        this.mArgv.add(str);
        return this;
    }

    public ProcessBuilder clearenv() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList == null) {
            this.mEnvironKeys = new ArrayList();
            this.mEnvironValues = new ArrayList();
            return this;
        }
        arrayList.clear();
        this.mEnvironValues.clear();
        this.mEnvironCache = null;
        return this;
    }

    public Process create() {
        String str = this.mExecutable;
        ArrayList arrayList = this.mArgv;
        return new Process(str, (String[]) arrayList.toArray(new String[arrayList.size()]), makeEnvironBlock(), getArrayOfSetBits(this.mKeepFds), this.mStreamDispositions, this.mTmpDir);
    }

    public void freezeEnviron() {
        if (this.mEnvironKeys == null) {
            Map<String, String> map = System.getenv();
            int size = map.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(next.getKey());
                arrayList2.add(next.getValue());
            }
            this.mEnvironKeys = arrayList;
            this.mEnvironValues = arrayList2;
        }
    }

    public ProcessBuilder setFdCloseOnExec(int i, boolean z) {
        if (z) {
            this.mKeepFds.clear(i);
            return this;
        }
        this.mKeepFds.set(i);
        return this;
    }

    public ProcessBuilder setStream(int i, int i2) {
        this.mStreamDispositions[i] = i2;
        return this;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.format("<ProcessBuilder executable=[%s] argv=[", new Object[]{this.mExecutable});
        for (int i = 0; i < this.mArgv.size(); i++) {
            if (i > 0) {
                printWriter.print(" ");
            }
            printWriter.print((String) this.mArgv.get(i));
        }
        printWriter.format("] keepFds=[%s] streamDispositions=[%s]", new Object[]{Arrays.toString(getArrayOfSetBits(this.mKeepFds)), Arrays.toString(this.mStreamDispositions)});
        printWriter.print(">");
        return stringWriter.toString();
    }

    public static byte[] buildEnvironBlock(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((String) arrayList.get(i2)).length() + 1 + ((String) arrayList2.get(i2)).length() + 1;
        }
        try {
            UnsafeByteArrayOutputStream unsafeByteArrayOutputStream = new UnsafeByteArrayOutputStream(i);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(unsafeByteArrayOutputStream));
            for (int i3 = 0; i3 < size; i3++) {
                bufferedWriter.write((String) arrayList.get(i3));
                bufferedWriter.write(61);
                bufferedWriter.write((String) arrayList2.get(i3));
                bufferedWriter.write(0);
            }
            bufferedWriter.flush();
            return unsafeByteArrayOutputStream.getRawBuffer();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static int[] getArrayOfSetBits(BitSet bitSet) {
        int[] iArr = new int[bitSet.cardinality()];
        int i = 0;
        int nextSetBit = bitSet.nextSetBit(0);
        while (nextSetBit != -1) {
            iArr[i] = nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            i++;
        }
        return iArr;
    }

    public ProcessBuilder unsetenv(String str) {
        freezeEnviron();
        ArrayList arrayList = this.mEnvironKeys;
        ArrayList arrayList2 = this.mEnvironValues;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (str.equals(arrayList.get(i))) {
                this.mEnvironCache = null;
                arrayList.remove(i);
                arrayList2.remove(i);
                break;
            } else {
                i++;
            }
        }
        return this;
    }

    public ProcessBuilder setDefaultTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder setExecutable(String str) {
        this.mExecutable = str;
        return this;
    }

    public ProcessBuilder setTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder() {
        int indexOf;
        this.mArgv = new ArrayList();
        this.mKeepFds = new BitSet();
        this.mStreamDispositions = new int[]{-3, -3, -3};
        this.mKeepFds.set(0);
        this.mKeepFds.set(1);
        this.mKeepFds.set(2);
        String str = System.getenv("ANDROID_PROPERTY_WORKSPACE");
        if (str != null && (indexOf = str.indexOf(44)) != -1) {
            try {
                this.mKeepFds.set(Integer.parseInt(str.substring(0, indexOf)));
            } catch (NumberFormatException unused) {
            }
        }
    }

    public ProcessBuilder(String str, String... strArr) {
        this();
        this.mExecutable = str;
        this.mArgv.add(str);
        for (String add : strArr) {
            this.mArgv.add(add);
        }
    }

    public ProcessBuilder addArguments(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.mArgv.add((String) it.next());
        }
        return this;
    }

    public ProcessBuilder addArguments(String... strArr) {
        for (String add : strArr) {
            this.mArgv.add(add);
        }
        return this;
    }

    public ProcessBuilder clone() {
        makeEnvironBlock();
        try {
            ProcessBuilder processBuilder = (ProcessBuilder) super.clone();
            processBuilder.mArgv = (ArrayList) this.mArgv.clone();
            processBuilder.mKeepFds = (BitSet) this.mKeepFds.clone();
            processBuilder.mStreamDispositions = (int[]) this.mStreamDispositions.clone();
            ArrayList arrayList = this.mEnvironKeys;
            if (arrayList != null) {
                processBuilder.mEnvironKeys = (ArrayList) arrayList.clone();
                processBuilder.mEnvironValues = (ArrayList) this.mEnvironValues.clone();
            }
            byte[] bArr = this.mEnvironCache;
            if (bArr != null) {
                processBuilder.mEnvironCache = (byte[]) bArr.clone();
            }
            processBuilder.mTmpDir = this.mTmpDir;
            return processBuilder;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
