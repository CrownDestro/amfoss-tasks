package p017c0;

import androidx.fragment.app.Fragment;
import p041f3.C1924k;

/* renamed from: c0.h */
public abstract class C1291h extends RuntimeException {

    /* renamed from: d */
    private final Fragment f4614d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1291h(Fragment fragment, String str) {
        super(str);
        C1924k.m9141g(fragment, "fragment");
        this.f4614d = fragment;
    }

    /* renamed from: a */
    public final Fragment mo5114a() {
        return this.f4614d;
    }
}
