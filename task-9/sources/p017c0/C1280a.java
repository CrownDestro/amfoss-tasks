package p017c0;

import androidx.fragment.app.Fragment;
import p041f3.C1924k;

/* renamed from: c0.a */
public final class C1280a extends C1291h {

    /* renamed from: e */
    private final String f4592e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1280a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C1924k.m9141g(fragment, "fragment");
        C1924k.m9141g(str, "previousFragmentId");
        this.f4592e = str;
    }
}
