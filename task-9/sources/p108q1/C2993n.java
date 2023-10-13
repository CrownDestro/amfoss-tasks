package p108q1;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import p062i4.C2113g;

/* renamed from: q1.n */
final class C2993n extends C2995p {

    /* renamed from: p */
    private static final String[] f9821p = new String[128];

    /* renamed from: m */
    private final C2113g f9822m;

    /* renamed from: n */
    private String f9823n = ":";

    /* renamed from: o */
    private String f9824o;

    static {
        for (int i = 0; i <= 31; i++) {
            f9821p[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f9821p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C2993n(C2113g gVar) {
        Objects.requireNonNull(gVar, "sink == null");
        this.f9822m = gVar;
        mo10268G(6);
    }

    /* renamed from: d0 */
    private void m13536d0() {
        int D = mo10266D();
        if (D == 5) {
            this.f9822m.mo7913U(44);
        } else if (D != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m13539g0();
        mo10269H(4);
    }

    /* renamed from: e0 */
    private void m13537e0() {
        int D = mo10266D();
        if (D == 1) {
            mo10269H(2);
        } else if (D == 2) {
            this.f9822m.mo7913U(44);
        } else if (D != 4) {
            if (D != 6) {
                if (D != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f9832i) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo10269H(7);
            return;
        } else {
            this.f9822m.mo7908P(this.f9823n);
            mo10269H(5);
            return;
        }
        m13539g0();
    }

    /* renamed from: f0 */
    private C2995p m13538f0(int i, int i2, String str) {
        int D = mo10266D();
        if (D != i2 && D != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f9824o == null) {
            int i3 = this.f9827d;
            int i4 = this.f9835l;
            if (i3 == (i4 ^ -1)) {
                this.f9835l = i4 ^ -1;
                return this;
            }
            int i5 = i3 - 1;
            this.f9827d = i5;
            this.f9829f[i5] = null;
            int[] iArr = this.f9830g;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (D == i2) {
                m13539g0();
            }
            this.f9822m.mo7908P(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f9824o);
        }
    }

    /* renamed from: g0 */
    private void m13539g0() {
        if (this.f9831h != null) {
            this.f9822m.mo7913U(10);
            int i = this.f9827d;
            for (int i2 = 1; i2 < i; i2++) {
                this.f9822m.mo7908P(this.f9831h);
            }
        }
    }

    /* renamed from: h0 */
    private C2995p m13540h0(int i, int i2, String str) {
        int i3 = this.f9827d;
        int i4 = this.f9835l;
        if (i3 == i4) {
            int[] iArr = this.f9828e;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f9835l = i4 ^ -1;
                return this;
            }
        }
        m13537e0();
        mo10272f();
        mo10268G(i);
        this.f9830g[this.f9827d - 1] = 0;
        this.f9822m.mo7908P(str);
        return this;
    }

    /* renamed from: i0 */
    static void m13541i0(C2113g gVar, String str) {
        String str2;
        String[] strArr = f9821p;
        gVar.mo7913U(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                gVar.mo7936j(str, i, i2);
            }
            gVar.mo7908P(str2);
            i = i2 + 1;
        }
        if (i < length) {
            gVar.mo7936j(str, i, length);
        }
        gVar.mo7913U(34);
    }

    /* renamed from: j0 */
    private void m13542j0() {
        if (this.f9824o != null) {
            m13536d0();
            m13541i0(this.f9822m, this.f9824o);
            this.f9824o = null;
        }
    }

    /* renamed from: B */
    public C2995p mo10251B() {
        if (!this.f9834k) {
            if (this.f9824o != null) {
                if (this.f9833j) {
                    m13542j0();
                } else {
                    this.f9824o = null;
                    return this;
                }
            }
            m13537e0();
            this.f9822m.mo7908P("null");
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: Q */
    public C2995p mo10252Q(double d) {
        if (!this.f9832i && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f9834k) {
            return mo10263w(Double.toString(d));
        } else {
            m13542j0();
            m13537e0();
            this.f9822m.mo7908P(Double.toString(d));
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: T */
    public C2995p mo10253T(long j) {
        if (this.f9834k) {
            return mo10263w(Long.toString(j));
        }
        m13542j0();
        m13537e0();
        this.f9822m.mo7908P(Long.toString(j));
        int[] iArr = this.f9830g;
        int i = this.f9827d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C2995p mo10254a() {
        if (!this.f9834k) {
            m13542j0();
            return m13540h0(1, 2, "[");
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: a0 */
    public C2995p mo10255a0(@Nullable Number number) {
        if (number == null) {
            return mo10251B();
        }
        String obj = number.toString();
        if (!this.f9832i && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f9834k) {
            return mo10263w(obj);
        } else {
            m13542j0();
            m13537e0();
            this.f9822m.mo7908P(obj);
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: b0 */
    public C2995p mo10256b0(String str) {
        if (str == null) {
            return mo10251B();
        }
        if (this.f9834k) {
            return mo10263w(str);
        }
        m13542j0();
        m13537e0();
        m13541i0(this.f9822m, str);
        int[] iArr = this.f9830g;
        int i = this.f9827d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: c */
    public C2995p mo10257c() {
        if (!this.f9834k) {
            m13542j0();
            return m13540h0(3, 5, "{");
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: c0 */
    public C2995p mo10258c0(boolean z) {
        if (!this.f9834k) {
            m13542j0();
            m13537e0();
            this.f9822m.mo7908P(z ? "true" : "false");
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + mo10273k());
    }

    public void close() {
        this.f9822m.close();
        int i = this.f9827d;
        if (i > 1 || (i == 1 && this.f9828e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9827d = 0;
    }

    public void flush() {
        if (this.f9827d != 0) {
            this.f9822m.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public C2995p mo10261h() {
        return m13538f0(1, 2, "]");
    }

    /* renamed from: i */
    public C2995p mo10262i() {
        this.f9834k = false;
        return m13538f0(3, 5, "}");
    }

    /* renamed from: w */
    public C2995p mo10263w(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9827d != 0) {
            int D = mo10266D();
            if ((D == 3 || D == 5) && this.f9824o == null) {
                this.f9824o = str;
                this.f9829f[this.f9827d - 1] = str;
                this.f9834k = false;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
