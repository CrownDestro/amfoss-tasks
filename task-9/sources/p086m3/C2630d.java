package p086m3;

import java.nio.charset.Charset;
import p041f3.C1924k;

/* renamed from: m3.d */
public final class C2630d {

    /* renamed from: a */
    public static final C2630d f8848a = new C2630d();

    /* renamed from: b */
    public static final Charset f8849b;

    /* renamed from: c */
    public static final Charset f8850c;

    /* renamed from: d */
    public static final Charset f8851d;

    /* renamed from: e */
    public static final Charset f8852e;

    /* renamed from: f */
    public static final Charset f8853f;

    /* renamed from: g */
    public static final Charset f8854g;

    /* renamed from: h */
    private static volatile Charset f8855h;

    /* renamed from: i */
    private static volatile Charset f8856i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C1924k.m9140f(forName, "forName(\"UTF-8\")");
        f8849b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C1924k.m9140f(forName2, "forName(\"UTF-16\")");
        f8850c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C1924k.m9140f(forName3, "forName(\"UTF-16BE\")");
        f8851d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C1924k.m9140f(forName4, "forName(\"UTF-16LE\")");
        f8852e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C1924k.m9140f(forName5, "forName(\"US-ASCII\")");
        f8853f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C1924k.m9140f(forName6, "forName(\"ISO-8859-1\")");
        f8854g = forName6;
    }

    private C2630d() {
    }

    /* renamed from: a */
    public final Charset mo9319a() {
        Charset charset = f8856i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C1924k.m9140f(forName, "forName(\"UTF-32BE\")");
        f8856i = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo9320b() {
        Charset charset = f8855h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C1924k.m9140f(forName, "forName(\"UTF-32LE\")");
        f8855h = forName;
        return forName;
    }
}
