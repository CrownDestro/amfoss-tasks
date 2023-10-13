package androidx.activity.result;

import androidx.activity.result.C0069d;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;
import p009b.C1244a;

class ActivityResultRegistry$1 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ String f204d;

    /* renamed from: e */
    final /* synthetic */ C0067b f205e;

    /* renamed from: f */
    final /* synthetic */ C1244a f206f;

    /* renamed from: g */
    final /* synthetic */ C0069d f207g;

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        if (C0988f.C0989a.ON_START.equals(aVar)) {
            this.f207g.f215f.put(this.f204d, new C0069d.C0071b(this.f205e, this.f206f));
            if (this.f207g.f216g.containsKey(this.f204d)) {
                Object obj = this.f207g.f216g.get(this.f204d);
                this.f207g.f216g.remove(this.f204d);
                this.f205e.mo183a(obj);
            }
            C0065a aVar2 = (C0065a) this.f207g.f217h.getParcelable(this.f204d);
            if (aVar2 != null) {
                this.f207g.f217h.remove(this.f204d);
                this.f205e.mo183a(this.f206f.mo3698a(aVar2.mo175c(), aVar2.mo174a()));
            }
        } else if (C0988f.C0989a.ON_STOP.equals(aVar)) {
            this.f207g.f215f.remove(this.f204d);
        } else if (C0988f.C0989a.ON_DESTROY.equals(aVar)) {
            this.f207g.mo189i(this.f204d);
        }
    }
}
