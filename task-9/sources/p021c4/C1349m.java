package p021c4;

import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: c4.m */
public final class C1349m {

    /* renamed from: c */
    public static final C1350a f4874c = new C1350a((C1920g) null);

    /* renamed from: a */
    private int f4875a;

    /* renamed from: b */
    private final int[] f4876b = new int[10];

    /* renamed from: c4.m$a */
    public static final class C1350a {
        private C1350a() {
        }

        public /* synthetic */ C1350a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo5291a(int i) {
        return this.f4876b[i];
    }

    /* renamed from: b */
    public final int mo5292b() {
        if ((this.f4875a & 2) != 0) {
            return this.f4876b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo5293c() {
        if ((this.f4875a & 128) != 0) {
            return this.f4876b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int mo5294d() {
        if ((this.f4875a & 16) != 0) {
            return this.f4876b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int mo5295e(int i) {
        return (this.f4875a & 32) != 0 ? this.f4876b[5] : i;
    }

    /* renamed from: f */
    public final boolean mo5296f(int i) {
        return ((1 << i) & this.f4875a) != 0;
    }

    /* renamed from: g */
    public final void mo5297g(C1349m mVar) {
        C1924k.m9142h(mVar, "other");
        for (int i = 0; i < 10; i++) {
            if (mVar.mo5296f(i)) {
                mo5298h(i, mVar.mo5291a(i));
            }
        }
    }

    /* renamed from: h */
    public final C1349m mo5298h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4876b;
            if (i < iArr.length) {
                this.f4875a = (1 << i) | this.f4875a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int mo5299i() {
        return Integer.bitCount(this.f4875a);
    }
}
