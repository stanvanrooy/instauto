package com.facebook.common.dextricks;

import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000X.AnonymousClass000;

public class Dex2oatLogcatParser extends LogcatReader {
    public static final Pattern DEX2OAT_STATS_PARSER = Pattern.compile("^(\\d{4}-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}\\s+\\d+\\s+\\d+\\s\\w\\s\\w+\\s*:\\s*(\\d+\\.\\d+)% of (.+) for (\\d+) cases");
    public static final String TAG = "Dex2oatLogcatParser";
    public final int GROUP_IDX_NUM_CASES = 4;
    public final int GROUP_IDX_PERCENT = 2;
    public final int GROUP_IDX_STAT_TYPE = 3;
    public final Set mDex2OatStatInfos = new HashSet();

    public class Dex2OatStatInfo {
        public final int failure;
        public final double percent;
        public final String statType;
        public final int success;
        public final int totalCases;

        public String toString() {
            StringBuilder sb = new StringBuilder("[ Dex2OatStatInfo");
            sb.append(" Stat Type: \"");
            sb.append(this.statType);
            sb.append("\"");
            sb.append(" Success failure: ");
            int i = this.success;
            sb.append(i);
            sb.append(" / (");
            sb.append(this.totalCases);
            sb.append(" [or ");
            sb.append(i);
            sb.append(" + ");
            sb.append(this.failure);
            sb.append("])");
            sb.append(" => ");
            sb.append(this.percent);
            sb.append("% ]");
            return sb.toString();
        }

        public Dex2OatStatInfo(String str, double d, int i) {
            this.statType = str;
            this.percent = d;
            this.totalCases = i;
            int successFromPercentAndTotalCases = Dex2oatLogcatParser.successFromPercentAndTotalCases(d, i);
            this.success = successFromPercentAndTotalCases;
            this.failure = i - successFromPercentAndTotalCases;
        }
    }

    public static int successFromPercentAndTotalCases(double d, int i) {
        return (int) Math.ceil((d / 100.0d) * ((double) i));
    }

    public Set getDex2OatStatInfos() {
        return this.mDex2OatStatInfos;
    }

    public void processLine(String str) {
        Matcher matcher = DEX2OAT_STATS_PARSER.matcher(str);
        if (matcher != null && matcher.matches()) {
            try {
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                String.format("Found percent %s %% stat type: %s and case count: %s ", new Object[]{group, group2, group3});
                this.mDex2OatStatInfos.add(new Dex2OatStatInfo(group2, Double.parseDouble(group), Integer.parseInt(group3)));
            } catch (NumberFormatException e) {
                Log.w(TAG, AnonymousClass000.A0E("Could not process line: ", str), e);
            }
        }
    }

    public void reset() {
        this.mDex2OatStatInfos.clear();
    }

    public Dex2oatLogcatParser(String str, File file) {
        super(str, file);
    }
}
