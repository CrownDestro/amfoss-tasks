package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C0612h;

/* renamed from: androidx.fragment.app.m */
public class C0923m {

    /* renamed from: a */
    private final C0927o<?> f3243a;

    private C0923m(C0927o<?> oVar) {
        this.f3243a = oVar;
    }

    /* renamed from: b */
    public static C0923m m4163b(C0927o<?> oVar) {
        return new C0923m((C0927o) C0612h.m2671h(oVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo3579a(Fragment fragment) {
        C0927o<?> oVar = this.f3243a;
        oVar.f3249h.mo3672m(oVar, oVar, fragment);
    }

    /* renamed from: c */
    public void mo3580c() {
        this.f3243a.f3249h.mo3690y();
    }

    /* renamed from: d */
    public boolean mo3581d(MenuItem menuItem) {
        return this.f3243a.f3249h.mo3617B(menuItem);
    }

    /* renamed from: e */
    public void mo3582e() {
        this.f3243a.f3249h.mo3618C();
    }

    /* renamed from: f */
    public void mo3583f() {
        this.f3243a.f3249h.mo3622E();
    }

    /* renamed from: g */
    public void mo3584g() {
        this.f3243a.f3249h.mo3636N();
    }

    /* renamed from: h */
    public void mo3585h() {
        this.f3243a.f3249h.mo3642R();
    }

    /* renamed from: i */
    public void mo3586i() {
        this.f3243a.f3249h.mo3643S();
    }

    /* renamed from: j */
    public void mo3587j() {
        this.f3243a.f3249h.mo3644U();
    }

    /* renamed from: k */
    public boolean mo3588k() {
        return this.f3243a.f3249h.mo3655b0(true);
    }

    /* renamed from: l */
    public C0937w mo3589l() {
        return this.f3243a.f3249h;
    }

    /* renamed from: m */
    public void mo3590m() {
        this.f3243a.f3249h.mo3647V0();
    }

    /* renamed from: n */
    public View mo3591n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3243a.f3249h.mo3685v0().onCreateView(view, str, context, attributeSet);
    }
}
