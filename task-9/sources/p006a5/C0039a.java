package p006a5;

import android.view.MotionEvent;

/* renamed from: a5.a */
public class C0039a {

    /* renamed from: a */
    protected float f140a;

    /* renamed from: b */
    private C0040a f141b;

    /* renamed from: c */
    private boolean f142c = true;

    /* renamed from: a5.a$a */
    public interface C0040a {
        /* renamed from: c */
        void mo93c(float f);
    }

    public C0039a(C0040a aVar) {
        this.f141b = aVar;
    }

    /* renamed from: b */
    private static float m138b(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2((double) (motionEvent.getY(0) - motionEvent.getY(1)), (double) (motionEvent.getX(0) - motionEvent.getX(1))));
    }

    /* renamed from: a */
    public void mo91a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 2) {
            if (motionEvent.getActionMasked() == 5) {
                this.f140a = m138b(motionEvent);
            }
            float b = m138b(motionEvent);
            float f = this.f140a;
            float f2 = b - f;
            if (this.f142c) {
                this.f140a = f + f2;
                this.f141b.mo93c(f2);
                return;
            }
            this.f140a = b;
        }
    }

    /* renamed from: c */
    public void mo92c(boolean z) {
        this.f142c = z;
    }
}
