package p083m0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: m0.u */
class C2557u implements C2558v {

    /* renamed from: a */
    private final ViewGroupOverlay f8657a;

    C2557u(ViewGroup viewGroup) {
        this.f8657a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo9241a(View view) {
        this.f8657a.add(view);
    }

    /* renamed from: b */
    public void mo9242b(Drawable drawable) {
        this.f8657a.add(drawable);
    }

    /* renamed from: c */
    public void mo9243c(View view) {
        this.f8657a.remove(view);
    }

    /* renamed from: d */
    public void mo9244d(Drawable drawable) {
        this.f8657a.remove(drawable);
    }
}
