package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;

class FragmentManager$6 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ String f3022d;

    /* renamed from: e */
    final /* synthetic */ C0860b0 f3023e;

    /* renamed from: f */
    final /* synthetic */ C0988f f3024f;

    /* renamed from: g */
    final /* synthetic */ C0937w f3025g;

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        Bundle bundle;
        if (aVar == C0988f.C0989a.ON_START && (bundle = (Bundle) this.f3025g.f3290k.get(this.f3022d)) != null) {
            this.f3023e.mo3373a(this.f3022d, bundle);
            this.f3025g.mo3681t(this.f3022d);
        }
        if (aVar == C0988f.C0989a.ON_DESTROY) {
            this.f3024f.mo3777d(this);
            this.f3025g.f3291l.remove(this.f3022d);
        }
    }
}
