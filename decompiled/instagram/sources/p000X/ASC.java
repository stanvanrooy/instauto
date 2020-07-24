package p000X;

import android.os.Bundle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.ASC */
public final class ASC extends ASL implements AQM, AQP, C23569ARo {
    public AQ8 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;
    public final AQE A04 = new AQE();
    public final ASD A05;
    public final MessageDigest A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();
    public final boolean A0A;
    public final List A0B = new ArrayList();
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static void A00(ASC asc) {
        if (!asc.A03 && asc.A0C) {
            String A0J = AnonymousClass000.A0J("(function (images) {\n  return getImagesSizesFromUrl(images);\n  function getImagesSizesFromUrl(images) { \n    const imageToSizes = {};\n    for (let i = 0; i < images.length; i++) {\n      const item = images[i];\n      const img = new Image();\n      img.src = item;\n      imageToSizes[item] = {width: img.naturalWidth, height: img.naturalHeight}\n    };\n    return imageToSizes;\n  }\n})(", new JSONArray(asc.A04.A00()).toString(), ");");
            AQ8 aq8 = asc.A00;
            if (aq8 != null) {
                aq8.A0l(new ASI(asc, A0J));
            }
        }
    }

    public static void A01(ASC asc) {
        B34 b34;
        C25138B2q b2q;
        Bundle AYv;
        if (!asc.A03) {
            A00(asc);
            HashMap hashMap = new HashMap();
            AQE aqe = asc.A04;
            synchronized (aqe.A02) {
                try {
                    b34 = new B34(aqe.A00);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            for (Map.Entry entry : b34.entrySet()) {
                hashMap.put(entry.getKey(), Long.valueOf((long) ((Integer) entry.getValue()).intValue()));
            }
            ASD asd = asc.A05;
            asd.A07 = asc.A0B;
            asd.A06 = asc.A07;
            AQE aqe2 = asc.A04;
            synchronized (aqe2.A02) {
                try {
                    b2q = new C25138B2q(aqe2.A02);
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            asd.A0C = b2q;
            asd.A0A = hashMap;
            asd.A0B = asc.A04.A00();
            asd.A00 = Boolean.valueOf(asc.A01);
            asd.A08 = asc.A09;
            asd.A09 = asc.A08;
            asc.A03 = true;
            ATL A002 = ATL.A00();
            Map singletonMap = Collections.singletonMap("INTEGRITY_LOGGER", new ASE(asc.A05));
            ASB asb = asc.A03;
            if (asb == null) {
                AYv = null;
            } else {
                AYv = asb.AYv();
            }
            ATL.A02(A002, new AS9(A002, singletonMap, AYv));
            return;
        }
        return;
        throw th;
    }

    public final void BDY(AQ8 aq8, String str) {
        AQ8 aq82;
        if (!this.A03) {
            this.A01 = true;
            if (aq8 instanceof AQ8) {
                if (this.A0D) {
                    aq8.A17("(function(){ return document.documentElement.innerHTML.length; })();", false, new ASF(this));
                }
                if (this.A0C && (aq82 = this.A00) != null) {
                    aq82.A0l(new ASI(this, "(function () {\n  return getImagesSizes();\n  function getImagesSizes() { \n    const allImgs = document.querySelectorAll('img');\n    const imageToSizes = {};\n    for (let i = 0; i < allImgs.length; i++) {\n\t  const item = allImgs.item(i);\n      const src = item.src;\n      imageToSizes[src] = {width: item.naturalWidth, height: item.naturalHeight}\n    };\n    return imageToSizes;\n  }\n})();"));
                }
            }
        }
    }

    public final void BDb(AQ8 aq8, long j) {
        this.A00 = aq8;
        if (!this.A03 && this.A0E) {
            aq8.A17("(function() {\n  return simHash();\n\n  // Generates a Simhash for the page to detect cloaking.\n  // https://arxiv.org/pdf/1710.01387.pdf\n  function simHash() {\n    const countsText = [];\n    const countsDOM = [];\n      // Initialize a counts array with 64 zeros.\n    for (let i = 0; i < 64; i++) {\n      countsText.push(0);\n      countsDOM.push(0);\n    }\n\n    hashText(countsText);\n    // Copy counts from text only to text and dom\n    const countsTextAndDOM = countsText.slice();\n    hashDomNode(document.documentElement, countsDOM, countsTextAndDOM);\n    return {\n      \"text_and_dom\": generateFinalHash(countsTextAndDOM),\n      \"text_only\": generateFinalHash(countsText),\n      \"dom_only\": generateFinalHash(countsDOM),\n    };\n  }\n\n  // Hash unigrams, bigrams and trigrams in text.\n  function hashText(counts) {\n    // https://github.com/fergiemcdowall/stopword/blob/master/lib/stopwords_en.js\n    // TODO: Internationalization.\n    const stopWords = new Set([\n      'about', 'after', 'all', 'also', 'am', 'an', 'and', 'another', 'any',\n      'are', 'as', 'at', 'be', 'because', 'been', 'before', 'being', 'between',\n      'both', 'but', 'by', 'came', 'can', 'come', 'could', 'did', 'do', 'each',\n      'for', 'from', 'get', 'got', 'has', 'had', 'he', 'have', 'her', 'here',\n      'him', 'himself', 'his', 'how', 'if', 'in', 'into', 'is', 'it', 'like',\n      'make', 'many', 'me', 'might', 'more', 'most', 'much', 'must', 'my',\n      'never', 'now', 'of', 'on', 'only', 'or', 'other', 'our', 'out', 'over',\n      'said', 'same', 'see', 'should', 'since', 'some', 'still', 'such', 'take',\n      'than', 'that', 'the', 'their', 'them', 'then', 'there', 'these', 'they',\n      'this', 'those', 'through', 'to', 'too', 'under', 'up', 'very', 'was',\n      'way', 'we', 'well', 'were', 'what', 'where', 'which', 'while', 'who',\n      'with', 'would', 'you', 'your', 'a', 'i']);\n\n    const words = (document.body.textContent.match(/\\b\\S+\\b/g) || [])\n      .map(word => word.toLowerCase())\n      .filter(word => word.length > 2 && !stopWords.has(word));\n\n    for (let i = 0; i < words.length; i++) {\n      hashAndUpdateCounts(words[i], counts);\n      if (i < words.length - 1)\n        hashAndUpdateCounts(`${words[i]},${words[i + 1]}`, counts);\n      if (i < words.length - 2)\n        hashAndUpdateCounts(\n          `${words[i]},${words[i + 1]},${words[i + 2]}`,\n          counts);\n    }\n  }\n\n  // Traverses the DOM tree depth-first, hashing each node + node-parent pair\n  // and updating counts.\n  function hashDomNode(domNode, counts, countsTextAndDOM, parentString) {\n    let domNodeString = stringifyDomNode(domNode);\n    for (let i = 0; i < domNode.children.length; i++) {\n      hashDomNode(domNode.children[i], counts, countsTextAndDOM, domNodeString);\n    }\n\n    if (parentString) {\n      domNodeString = `${parentString},${domNodeString}`;\n    }\n\n    hashAndUpdateCounts(domNodeString, counts);\n    hashAndUpdateCounts(domNodeString, countsTextAndDOM);\n  }\n\n  // We include the tag name, and the attribute list.\n  function stringifyDomNode(domNode) {\n    let str = `${domNode.tagName}[`;\n    for (let i = 0; i < domNode.attributes.length; i++) {\n      str += `${domNode.attributes[i].nodeName},`;\n    }\n\n    str += \"]\";\n    return str;\n  }\n\n  // Generates the final hash from counts.\n  function generateFinalHash(counts) {\n    let simHash = \"\";\n    for (let i = 0; i < counts.length; i += 4) {\n      let int16 = 0;\n      for (let j = 0; j < 4; j++) {\n        if (counts[i + j] >= 0) {\n          int16 += Math.pow(2, j);\n        }\n      }\n\n      simHash = int16.toString(16) + simHash;\n    }\n\n    return simHash;\n  }\n\n  // Implementation of FNV-1a (64 bit) hash function.\n  // https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function\n  // Cryptographic hash functions (e.g. md5, sha) are designed to be secure, not\n  // fast. For our purposes, FNV-1a is a great candidate in terms of speed and\n  // uniqueness.\n  // https://softwareengineering.stackexchange.com/questions/49550/which-hashing-algorithm-is-best-for-uniqueness-and-speed/145633#145633\n  function hashAndUpdateCounts(str, counts) {\n    // Use 4 parts of 16 bits to manipulate and generate the 64 bit hash. The\n    // maximum value of a 64 bit unsigned int falls above\n    // Number.MAX_SAFE_INTEGER (25^3 - 1) in JavaScript. Since multiplication\n    // of two 32 bit numbers can still go above that value, we resort to using\n    // 16 bit parts to make multiplication convenient.\n\n    // 64 bit FNV offset basis: 0xcbf29ce484222325\n    let hash00 = 0x2325;\n    let hash16 = 0x8422;\n    let hash32 = 0x9ce4;\n    let hash48 = 0xcbf2;\n\n    // 64 bit FNV prime: 2**40 + 2**8 + 0xb3 = 1099511628211\n    const fnvp00 = 0xb3 + Math.pow(2, 8);\n    const fnvp16 = 0;\n    const fnvp32 = Math.pow(2, 8);\n    const fnvp48 = 0;\n\n    for (let i = 0; i < str.length; i++) {\n      // XOR with each byte of data\n      hash00 ^= str.charCodeAt(i);\n\n      // Multiply by FNV prime, part by part.\n      const temp00 = hash00 * fnvp00;\n\n      const temp16 = (temp00 >>> 16) +\n                     hash16 * fnvp00 +\n                     hash00 * fnvp16;\n\n      const temp32 = (temp16 >>> 16) +\n                     hash32 * fnvp00 +\n                     hash16 * fnvp16 +\n                     hash00 * fnvp32;\n\n      const temp48 = (temp32 >>> 16) +\n                     hash48 * fnvp00 +\n                     hash32 * fnvp16 +\n                     hash16 * fnvp32 +\n                     hash00 * fnvp48;\n\n      hash00 = temp00 & 0xffff;\n      hash16 = temp16 & 0xffff;\n      hash32 = temp32 & 0xffff;\n      hash48 = temp48 & 0xffff;\n    }\n\n    // Update counts using each hash part.\n    updateCounts(hash00, 0, counts);\n    updateCounts(hash16, 16, counts);\n    updateCounts(hash32, 32, counts);\n    updateCounts(hash48, 48, counts);\n  }\n\n  function updateCounts(uint16, offset, counts) {\n    for (let i = 0; i < 16; i++) {\n      counts[offset + i] = uint16 & (0x1 << i)\n        ? counts[offset + i] + 1\n        : counts[offset + i] - 1;\n    }\n  }\n})();\n", false, new ASG(this));
            aq8.A17("(function () { \n  return getDOMTagCounts();\n  function getDOMTagCounts() { \n    const allElements = document.documentElement.getElementsByTagName(\"*\");\n    const tagToCount = {};\n    for (let i = 0; i < allElements.length; i++) {\n      const nodeName = allElements.item(i).nodeName.toUpperCase();\n      if (!(nodeName in tagToCount)) {\n        tagToCount[nodeName] = 0;\n      }\n      tagToCount[nodeName]++;\n    }\n    return tagToCount;\n  }\n})();", false, new ASH(this));
        }
    }

    public ASC(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        MessageDigest messageDigest;
        ASD asd = new ASD();
        this.A05 = asd;
        asd.A02 = str;
        this.A0A = z;
        this.A02 = !z;
        this.A01 = false;
        this.A0D = z2;
        this.A0E = z3;
        this.A0C = z4;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        this.A06 = messageDigest;
    }
}
