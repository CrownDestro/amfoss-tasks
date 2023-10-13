package p108q1;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2115i;
import p062i4.C2126s;

/* renamed from: q1.k */
public abstract class C2988k implements Closeable {

    /* renamed from: d */
    int f9791d;

    /* renamed from: e */
    int[] f9792e = new int[32];

    /* renamed from: f */
    String[] f9793f = new String[32];

    /* renamed from: g */
    int[] f9794g = new int[32];

    /* renamed from: h */
    boolean f9795h;

    /* renamed from: i */
    boolean f9796i;

    /* renamed from: q1.k$a */
    public static final class C2989a {

        /* renamed from: a */
        final String[] f9797a;

        /* renamed from: b */
        final C2126s f9798b;

        private C2989a(String[] strArr, C2126s sVar) {
            this.f9797a = strArr;
            this.f9798b = sVar;
        }

        @CheckReturnValue
        /* renamed from: a */
        public static C2989a m13501a(String... strArr) {
            try {
                C2115i[] iVarArr = new C2115i[strArr.length];
                C2111f fVar = new C2111f();
                for (int i = 0; i < strArr.length; i++) {
                    C2993n.m13541i0(fVar, strArr[i]);
                    fVar.readByte();
                    iVarArr[i] = fVar.mo7912T();
                }
                return new C2989a((String[]) strArr.clone(), C2126s.m9862D(iVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: q1.k$b */
    public enum C2990b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    C2988k() {
    }

    @CheckReturnValue
    /* renamed from: H */
    public static C2988k m13476H(C2114h hVar) {
        return new C2992m(hVar);
    }

    /* renamed from: B */
    public abstract double mo10224B();

    /* renamed from: C */
    public abstract int mo10225C();

    /* renamed from: D */
    public abstract long mo10226D();

    @Nullable
    /* renamed from: F */
    public abstract <T> T mo10227F();

    /* renamed from: G */
    public abstract String mo10228G();

    @CheckReturnValue
    /* renamed from: J */
    public abstract C2990b mo10229J();

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract void mo10230O();

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo10231Q(int i) {
        int i2 = this.f9791d;
        int[] iArr = this.f9792e;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f9792e = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f9793f;
                this.f9793f = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f9794g;
                this.f9794g = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C2985h("Nesting too deep at " + mo10244k());
            }
        }
        int[] iArr3 = this.f9792e;
        int i3 = this.f9791d;
        this.f9791d = i3 + 1;
        iArr3[i3] = i;
    }

    @CheckReturnValue
    /* renamed from: T */
    public abstract int mo10232T(C2989a aVar);

    /* renamed from: a */
    public abstract void mo10233a();

    @CheckReturnValue
    /* renamed from: a0 */
    public abstract int mo10234a0(C2989a aVar);

    /* renamed from: b0 */
    public final void mo10235b0(boolean z) {
        this.f9796i = z;
    }

    /* renamed from: c */
    public abstract void mo10236c();

    /* renamed from: c0 */
    public final void mo10237c0(boolean z) {
        this.f9795h = z;
    }

    /* renamed from: d0 */
    public abstract void mo10238d0();

    /* renamed from: e0 */
    public abstract void mo10239e0();

    /* renamed from: f */
    public abstract void mo10240f();

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final C2986i mo10241f0(String str) {
        throw new C2986i(str + " at path " + mo10244k());
    }

    /* renamed from: h */
    public abstract void mo10242h();

    @CheckReturnValue
    /* renamed from: i */
    public final boolean mo10243i() {
        return this.f9796i;
    }

    @CheckReturnValue
    /* renamed from: k */
    public final String mo10244k() {
        return C2991l.m13502a(this.f9791d, this.f9792e, this.f9793f, this.f9794g);
    }

    @CheckReturnValue
    /* renamed from: n */
    public abstract boolean mo10245n();

    @CheckReturnValue
    /* renamed from: s */
    public final boolean mo10246s() {
        return this.f9795h;
    }

    /* renamed from: w */
    public abstract boolean mo10247w();
}
