package p113r0;

import android.app.Activity;
import android.content.Context;
import p033e2.C1765a;
import p040f2.C1908a;
import p040f2.C1910c;
import p091n2.C2679b;
import p091n2.C2689i;
import p091n2.C2698m;

/* renamed from: r0.m */
public final class C3056m implements C1765a, C1908a {

    /* renamed from: a */
    private final C3057n f9970a = new C3057n();

    /* renamed from: b */
    private C2689i f9971b;

    /* renamed from: c */
    private C2698m f9972c;

    /* renamed from: d */
    private C1910c f9973d;

    /* renamed from: e */
    private C3055l f9974e;

    /* renamed from: g */
    private void m13722g() {
        C1910c cVar = this.f9973d;
        if (cVar != null) {
            cVar.mo7643i(this.f9970a);
            this.f9973d.mo7642h(this.f9970a);
        }
    }

    /* renamed from: h */
    private void m13723h() {
        C2698m mVar = this.f9972c;
        if (mVar != null) {
            mVar.mo9437g(this.f9970a);
            this.f9972c.mo9436f(this.f9970a);
            return;
        }
        C1910c cVar = this.f9973d;
        if (cVar != null) {
            cVar.mo7641g(this.f9970a);
            this.f9973d.mo7640f(this.f9970a);
        }
    }

    /* renamed from: i */
    private void m13724i(Context context, C2679b bVar) {
        this.f9971b = new C2689i(bVar, "flutter.baseflow.com/permissions/methods");
        C3055l lVar = new C3055l(context, new C3043a(), this.f9970a, new C3062p());
        this.f9974e = lVar;
        this.f9971b.mo9434e(lVar);
    }

    /* renamed from: j */
    private void m13725j(Activity activity) {
        C3055l lVar = this.f9974e;
        if (lVar != null) {
            lVar.mo10376i(activity);
        }
    }

    /* renamed from: k */
    private void m13726k() {
        this.f9971b.mo9434e((C2689i.C2693c) null);
        this.f9971b = null;
        this.f9974e = null;
    }

    /* renamed from: l */
    private void m13727l() {
        C3055l lVar = this.f9974e;
        if (lVar != null) {
            lVar.mo10376i((Activity) null);
        }
    }

    /* renamed from: a */
    public void mo7456a(C1765a.C1767b bVar) {
        m13724i(bVar.mo7458a(), bVar.mo7459b());
    }

    /* renamed from: b */
    public void mo7625b(C1910c cVar) {
        m13725j(cVar.mo7639e());
        this.f9973d = cVar;
        m13723h();
    }

    /* renamed from: c */
    public void mo7626c() {
        m13727l();
        m13722g();
    }

    /* renamed from: d */
    public void mo7457d(C1765a.C1767b bVar) {
        m13726k();
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
