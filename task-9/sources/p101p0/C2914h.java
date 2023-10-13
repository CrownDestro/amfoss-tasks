package p101p0;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p034e3.C1769a;
import p041f3.C1920g;
import p041f3.C1924k;
import p041f3.C1925l;
import p127t2.C3172f;

/* renamed from: p0.h */
public final class C2914h implements Comparable<C2914h> {

    /* renamed from: i */
    public static final C2915a f9654i = new C2915a((C1920g) null);

    /* renamed from: j */
    private static final C2914h f9655j = new C2914h(0, 0, 0, "");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C2914h f9656k = new C2914h(0, 1, 0, "");

    /* renamed from: l */
    private static final C2914h f9657l;

    /* renamed from: m */
    private static final C2914h f9658m;

    /* renamed from: d */
    private final int f9659d;

    /* renamed from: e */
    private final int f9660e;

    /* renamed from: f */
    private final int f9661f;

    /* renamed from: g */
    private final String f9662g;

    /* renamed from: h */
    private final C3172f f9663h;

    /* renamed from: p0.h$a */
    public static final class C2915a {
        private C2915a() {
        }

        public /* synthetic */ C2915a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2914h mo10089a() {
            return C2914h.f9656k;
        }

        /* renamed from: b */
        public final C2914h mo10090b(String str) {
            if (str == null || C2646p.m11987q(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
            C1924k.m9140f(group4, "description");
            return new C2914h(intValue, intValue2, intValue3, group4, (C1920g) null);
        }
    }

    /* renamed from: p0.h$b */
    static final class C2916b extends C1925l implements C1769a<BigInteger> {

        /* renamed from: e */
        final /* synthetic */ C2914h f9664e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2916b(C2914h hVar) {
            super(0);
            this.f9664e = hVar;
        }

        /* renamed from: a */
        public final BigInteger mo3839c() {
            return BigInteger.valueOf((long) this.f9664e.mo10083d()).shiftLeft(32).or(BigInteger.valueOf((long) this.f9664e.mo10084e())).shiftLeft(32).or(BigInteger.valueOf((long) this.f9664e.mo10086f()));
        }
    }

    static {
        C2914h hVar = new C2914h(1, 0, 0, "");
        f9657l = hVar;
        f9658m = hVar;
    }

    private C2914h(int i, int i2, int i3, String str) {
        this.f9659d = i;
        this.f9660e = i2;
        this.f9661f = i3;
        this.f9662g = str;
        this.f9663h = C3174h.m14049a(new C2916b(this));
    }

    public /* synthetic */ C2914h(int i, int i2, int i3, String str, C1920g gVar) {
        this(i, i2, i3, str);
    }

    /* renamed from: c */
    private final BigInteger m13222c() {
        Object value = this.f9663h.getValue();
        C1924k.m9140f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    /* renamed from: b */
    public int compareTo(C2914h hVar) {
        C1924k.m9141g(hVar, "other");
        return m13222c().compareTo(hVar.m13222c());
    }

    /* renamed from: d */
    public final int mo10083d() {
        return this.f9659d;
    }

    /* renamed from: e */
    public final int mo10084e() {
        return this.f9660e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2914h)) {
            return false;
        }
        C2914h hVar = (C2914h) obj;
        return this.f9659d == hVar.f9659d && this.f9660e == hVar.f9660e && this.f9661f == hVar.f9661f;
    }

    /* renamed from: f */
    public final int mo10086f() {
        return this.f9661f;
    }

    public int hashCode() {
        return ((((527 + this.f9659d) * 31) + this.f9660e) * 31) + this.f9661f;
    }

    public String toString() {
        String m = C2646p.m11987q(this.f9662g) ^ true ? C1924k.m9147m("-", this.f9662g) : "";
        return this.f9659d + '.' + this.f9660e + '.' + this.f9661f + m;
    }
}
