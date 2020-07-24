package p000X;

import android.util.Log;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* renamed from: X.D9Z */
public final class D9Z {
    public static final String[] A00 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static Id3Frame A00(int i, String str, D9O d9o, boolean z, boolean z2) {
        int i2;
        d9o.A0D(4);
        if (d9o.A00() == 1684108385) {
            d9o.A0D(8);
            i2 = d9o.A01();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 < 0) {
            Log.w("MetadataUtil", AnonymousClass000.A0E("Failed to parse uint8 attribute: ", C29784D9s.A00(i)));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, Integer.toString(i2));
        } else {
            return new CommentFrame(str, Integer.toString(i2));
        }
    }

    public static TextInformationFrame A01(int i, String str, D9O d9o) {
        int A002 = d9o.A00();
        if (d9o.A00() == 1684108385 && A002 >= 22) {
            d9o.A0D(10);
            int A03 = d9o.A03();
            if (A03 > 0) {
                String A05 = AnonymousClass000.A05("", A03);
                int A032 = d9o.A03();
                if (A032 > 0) {
                    A05 = AnonymousClass000.A0G(A05, "/", A032);
                }
                return new TextInformationFrame(str, A05);
            }
        }
        Log.w("MetadataUtil", AnonymousClass000.A0E("Failed to parse index/count attribute: ", C29784D9s.A00(i)));
        return null;
    }

    public static TextInformationFrame A02(int i, String str, D9O d9o) {
        int A002 = d9o.A00();
        if (d9o.A00() == 1684108385) {
            d9o.A0D(8);
            return new TextInformationFrame(str, d9o.A09(A002 - 16));
        }
        Log.w("MetadataUtil", AnonymousClass000.A0E("Failed to parse text attribute: ", C29784D9s.A00(i)));
        return null;
    }
}
