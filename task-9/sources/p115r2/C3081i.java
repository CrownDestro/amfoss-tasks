package p115r2;

import android.app.Activity;
import android.util.Log;
import p033e2.C1765a;
import p040f2.C1908a;
import p040f2.C1910c;
import p115r2.C3068a;

/* renamed from: r2.i */
public final class C3081i implements C1765a, C1908a {

    /* renamed from: a */
    private C3079h f10001a;

    /* renamed from: a */
    public void mo7456a(C1765a.C1767b bVar) {
        this.f10001a = new C3079h(bVar.mo7458a());
        C3077f.m13799f(bVar.mo7459b(), this.f10001a);
    }

    /* renamed from: b */
    public void mo7625b(C1910c cVar) {
        C3079h hVar = this.f10001a;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.mo10408i(cVar.mo7639e());
        }
    }

    /* renamed from: c */
    public void mo7626c() {
        C3079h hVar = this.f10001a;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.mo10408i((Activity) null);
        }
    }

    /* renamed from: d */
    public void mo7457d(C1765a.C1767b bVar) {
        if (this.f10001a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        C3077f.m13799f(bVar.mo7459b(), (C3068a.C3070b) null);
        this.f10001a = null;
    }

    /* renamed from: e */
    public void mo7627e(C1910c cVar) {
        mo7625b(cVar);
    }

    /* renamed from: f */
    public void mo7628f() {
        mo7626c();
    }
}
