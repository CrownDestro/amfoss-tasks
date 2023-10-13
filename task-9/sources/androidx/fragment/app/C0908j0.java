package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0986e;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C0996g0;
import androidx.lifecycle.C1006n;
import androidx.lifecycle.C1028y;
import p038f0.C1899a;
import p038f0.C1904d;
import p065j0.C2312c;
import p065j0.C2316d;
import p065j0.C2318e;

/* renamed from: androidx.fragment.app.j0 */
class C0908j0 implements C0986e, C2318e, C0996g0 {

    /* renamed from: d */
    private final Fragment f3201d;

    /* renamed from: e */
    private final C0994f0 f3202e;

    /* renamed from: f */
    private C1006n f3203f = null;

    /* renamed from: g */
    private C2316d f3204g = null;

    C0908j0(Fragment fragment, C0994f0 f0Var) {
        this.f3201d = fragment;
        this.f3202e = f0Var;
    }

    /* renamed from: a */
    public C0988f mo102a() {
        mo3540d();
        return this.f3203f;
    }

    /* renamed from: b */
    public C1899a mo104b() {
        Application application;
        Context applicationContext = this.f3201d.mo3279k1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C1904d dVar = new C1904d();
        if (application != null) {
            dVar.mo7622b(C0974c0.C0975a.f3410e, application);
        }
        dVar.mo7622b(C1028y.f3464a, this);
        dVar.mo7622b(C1028y.f3465b, this);
        if (this.f3201d.mo3285n() != null) {
            dVar.mo7622b(C1028y.f3466c, this.f3201d.mo3285n());
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3539c(C0988f.C0989a aVar) {
        this.f3203f.mo3787i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3540d() {
        if (this.f3203f == null) {
            this.f3203f = new C1006n(this);
            C2316d a = C2316d.m10779a(this);
            this.f3204g = a;
            a.mo8634c();
            C1028y.m4535a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo3541e() {
        return this.f3203f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3542f(Bundle bundle) {
        this.f3204g.mo8635d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3543g(Bundle bundle) {
        this.f3204g.mo8636e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3544h(C0988f.C0993b bVar) {
        this.f3203f.mo3789o(bVar);
    }

    /* renamed from: l */
    public C2312c mo111l() {
        mo3540d();
        return this.f3204g.mo8633b();
    }

    /* renamed from: o */
    public C0994f0 mo113o() {
        mo3540d();
        return this.f3202e;
    }
}
