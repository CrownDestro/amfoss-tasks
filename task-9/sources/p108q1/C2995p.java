package p108q1;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p062i4.C2113g;

/* renamed from: q1.p */
public abstract class C2995p implements Closeable, Flushable {

    /* renamed from: d */
    int f9827d = 0;

    /* renamed from: e */
    int[] f9828e = new int[32];

    /* renamed from: f */
    String[] f9829f = new String[32];

    /* renamed from: g */
    int[] f9830g = new int[32];

    /* renamed from: h */
    String f9831h;

    /* renamed from: i */
    boolean f9832i;

    /* renamed from: j */
    boolean f9833j;

    /* renamed from: k */
    boolean f9834k;

    /* renamed from: l */
    int f9835l = -1;

    C2995p() {
    }

    @CheckReturnValue
    /* renamed from: C */
    public static C2995p m13566C(C2113g gVar) {
        return new C2993n(gVar);
    }

    /* renamed from: B */
    public abstract C2995p mo10251B();

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final int mo10266D() {
        int i = this.f9827d;
        if (i != 0) {
            return this.f9828e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo10267F() {
        int D = mo10266D();
        if (D == 5 || D == 3) {
            this.f9834k = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo10268G(int i) {
        int[] iArr = this.f9828e;
        int i2 = this.f9827d;
        this.f9827d = i2 + 1;
        iArr[i2] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo10269H(int i) {
        this.f9828e[this.f9827d - 1] = i;
    }

    /* renamed from: J */
    public final void mo10270J(boolean z) {
        this.f9832i = z;
    }

    /* renamed from: O */
    public final void mo10271O(boolean z) {
        this.f9833j = z;
    }

    /* renamed from: Q */
    public abstract C2995p mo10252Q(double d);

    /* renamed from: T */
    public abstract C2995p mo10253T(long j);

    /* renamed from: a */
    public abstract C2995p mo10254a();

    /* renamed from: a0 */
    public abstract C2995p mo10255a0(@Nullable Number number);

    /* renamed from: b0 */
    public abstract C2995p mo10256b0(@Nullable String str);

    /* renamed from: c */
    public abstract C2995p mo10257c();

    /* renamed from: c0 */
    public abstract C2995p mo10258c0(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10272f() {
        int i = this.f9827d;
        int[] iArr = this.f9828e;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f9828e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f9829f;
            this.f9829f = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f9830g;
            this.f9830g = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C2994o)) {
                return true;
            }
            C2994o oVar = (C2994o) this;
            Object[] objArr = oVar.f9825m;
            oVar.f9825m = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new C2985h("Nesting too deep at " + mo10273k() + ": circular reference?");
    }

    /* renamed from: h */
    public abstract C2995p mo10261h();

    /* renamed from: i */
    public abstract C2995p mo10262i();

    @CheckReturnValue
    /* renamed from: k */
    public final String mo10273k() {
        return C2991l.m13502a(this.f9827d, this.f9828e, this.f9829f, this.f9830g);
    }

    @CheckReturnValue
    /* renamed from: n */
    public final boolean mo10274n() {
        return this.f9833j;
    }

    @CheckReturnValue
    /* renamed from: s */
    public final boolean mo10275s() {
        return this.f9832i;
    }

    /* renamed from: w */
    public abstract C2995p mo10263w(String str);
}
