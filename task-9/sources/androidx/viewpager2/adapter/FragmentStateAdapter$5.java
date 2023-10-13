package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;

class FragmentStateAdapter$5 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ Handler f4182d;

    /* renamed from: e */
    final /* synthetic */ Runnable f4183e;

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        if (aVar == C0988f.C0989a.ON_DESTROY) {
            this.f4182d.removeCallbacks(this.f4183e);
            mVar.mo102a().mo3777d(this);
        }
    }
}
