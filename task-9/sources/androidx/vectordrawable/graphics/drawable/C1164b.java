package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
public abstract class C1164b {

    /* renamed from: a */
    Animatable2.AnimationCallback f4079a;

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    class C1165a extends Animatable2.AnimationCallback {
        C1165a() {
        }

        public void onAnimationEnd(Drawable drawable) {
            C1164b.this.mo4780b(drawable);
        }

        public void onAnimationStart(Drawable drawable) {
            C1164b.this.mo4781c(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Animatable2.AnimationCallback mo4779a() {
        if (this.f4079a == null) {
            this.f4079a = new C1165a();
        }
        return this.f4079a;
    }

    /* renamed from: b */
    public void mo4780b(Drawable drawable) {
    }

    /* renamed from: c */
    public void mo4781c(Drawable drawable) {
    }
}
