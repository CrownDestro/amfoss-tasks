package p108q1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: q1.o */
final class C2994o extends C2995p {

    /* renamed from: m */
    Object[] f9825m = new Object[32];
    @Nullable

    /* renamed from: n */
    private String f9826n;

    C2994o() {
        mo10268G(6);
    }

    /* renamed from: d0 */
    private C2994o m13554d0(@Nullable Object obj) {
        String str;
        Object put;
        int D = mo10266D();
        int i = this.f9827d;
        if (i == 1) {
            if (D == 6) {
                this.f9828e[i - 1] = 7;
                this.f9825m[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (D != 3 || (str = this.f9826n) == null) {
            if (D == 1) {
                ((List) this.f9825m[i - 1]).add(obj);
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f9833j) && (put = ((Map) this.f9825m[i - 1]).put(str, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.f9826n + "' has multiple values at path " + mo10273k() + ": " + put + " and " + obj);
        } else {
            this.f9826n = null;
        }
        return this;
    }

    /* renamed from: B */
    public C2995p mo10251B() {
        if (!this.f9834k) {
            m13554d0((Object) null);
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: Q */
    public C2995p mo10252Q(double d) {
        if (!this.f9832i && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f9834k) {
            return mo10263w(Double.toString(d));
        } else {
            m13554d0(Double.valueOf(d));
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
        m13554d0(Long.valueOf(j));
        int[] iArr = this.f9830g;
        int i = this.f9827d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C2995p mo10254a() {
        if (!this.f9834k) {
            int i = this.f9827d;
            int i2 = this.f9835l;
            if (i == i2 && this.f9828e[i - 1] == 1) {
                this.f9835l = i2 ^ -1;
                return this;
            }
            mo10272f();
            ArrayList arrayList = new ArrayList();
            m13554d0(arrayList);
            Object[] objArr = this.f9825m;
            int i3 = this.f9827d;
            objArr[i3] = arrayList;
            this.f9830g[i3] = 0;
            mo10268G(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: a0 */
    public C2995p mo10255a0(@Nullable Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo10253T(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo10252Q(number.doubleValue());
        }
        if (number == null) {
            return mo10251B();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f9834k) {
            return mo10263w(bigDecimal.toString());
        }
        m13554d0(bigDecimal);
        int[] iArr = this.f9830g;
        int i = this.f9827d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: b0 */
    public C2995p mo10256b0(@Nullable String str) {
        if (this.f9834k) {
            return mo10263w(str);
        }
        m13554d0(str);
        int[] iArr = this.f9830g;
        int i = this.f9827d - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: c */
    public C2995p mo10257c() {
        if (!this.f9834k) {
            int i = this.f9827d;
            int i2 = this.f9835l;
            if (i == i2 && this.f9828e[i - 1] == 3) {
                this.f9835l = i2 ^ -1;
                return this;
            }
            mo10272f();
            C2996q qVar = new C2996q();
            m13554d0(qVar);
            this.f9825m[this.f9827d] = qVar;
            mo10268G(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + mo10273k());
    }

    /* renamed from: c0 */
    public C2995p mo10258c0(boolean z) {
        if (!this.f9834k) {
            m13554d0(Boolean.valueOf(z));
            int[] iArr = this.f9830g;
            int i = this.f9827d - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + mo10273k());
    }

    public void close() {
        int i = this.f9827d;
        if (i > 1 || (i == 1 && this.f9828e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9827d = 0;
    }

    public void flush() {
        if (this.f9827d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: h */
    public C2995p mo10261h() {
        if (mo10266D() == 1) {
            int i = this.f9827d;
            int i2 = this.f9835l;
            if (i == (i2 ^ -1)) {
                this.f9835l = i2 ^ -1;
                return this;
            }
            int i3 = i - 1;
            this.f9827d = i3;
            this.f9825m[i3] = null;
            int[] iArr = this.f9830g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: i */
    public C2995p mo10262i() {
        if (mo10266D() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f9826n == null) {
            int i = this.f9827d;
            int i2 = this.f9835l;
            if (i == (i2 ^ -1)) {
                this.f9835l = i2 ^ -1;
                return this;
            }
            this.f9834k = false;
            int i3 = i - 1;
            this.f9827d = i3;
            this.f9825m[i3] = null;
            this.f9829f[i3] = null;
            int[] iArr = this.f9830g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f9826n);
        }
    }

    /* renamed from: w */
    public C2995p mo10263w(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9827d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo10266D() == 3 && this.f9826n == null) {
            this.f9826n = str;
            this.f9829f[this.f9827d - 1] = str;
            this.f9834k = false;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }
}
