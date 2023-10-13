package p083m0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: m0.x */
class C2560x implements C2561y {

    /* renamed from: a */
    private final ViewOverlay f8659a;

    C2560x(View view) {
        this.f8659a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo9242b(Drawable drawable) {
        this.f8659a.add(drawable);
    }

    /* renamed from: d */
    public void mo9244d(Drawable drawable) {
        this.f8659a.remove(drawable);
    }
}
