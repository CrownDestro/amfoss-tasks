package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.f0 */
public class C0994f0 {

    /* renamed from: a */
    private final Map<String, C0972b0> f3426a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo3783a() {
        for (C0972b0 a : this.f3426a.values()) {
            a.mo3761a();
        }
        this.f3426a.clear();
    }

    /* renamed from: b */
    public final C0972b0 mo3784b(String str) {
        C1924k.m9141g(str, "key");
        return this.f3426a.get(str);
    }

    /* renamed from: c */
    public final Set<String> mo3785c() {
        return new HashSet(this.f3426a.keySet());
    }

    /* renamed from: d */
    public final void mo3786d(String str, C0972b0 b0Var) {
        C1924k.m9141g(str, "key");
        C1924k.m9141g(b0Var, "viewModel");
        C0972b0 put = this.f3426a.put(str, b0Var);
        if (put != null) {
            put.mo3713d();
        }
    }
}
