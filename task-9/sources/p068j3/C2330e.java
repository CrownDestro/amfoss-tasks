package p068j3;

import p041f3.C1924k;

/* renamed from: j3.e */
class C2330e {
    /* renamed from: a */
    public static final void m10815a(boolean z, Number number) {
        C1924k.m9141g(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
