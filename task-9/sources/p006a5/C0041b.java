package p006a5;

import android.view.MotionEvent;
import org.osmdroid.views.C2875d;
import p006a5.C0039a;
import p159y4.C3593g;

/* renamed from: a5.b */
public class C0041b extends C3593g implements C0039a.C0040a {

    /* renamed from: l */
    private static final int f143l = C3593g.m15895h();

    /* renamed from: m */
    private static final int f144m = C3593g.m15895h();

    /* renamed from: n */
    private static final int f145n = C3593g.m15895h();

    /* renamed from: f */
    private final C0039a f146f;

    /* renamed from: g */
    private C2875d f147g;

    /* renamed from: h */
    private boolean f148h = true;

    /* renamed from: i */
    long f149i = 0;

    /* renamed from: j */
    final long f150j = 25;

    /* renamed from: k */
    float f151k = 0.0f;

    public C0041b(C2875d dVar) {
        this.f147g = dVar;
        this.f146f = new C0039a(this);
    }

    /* renamed from: A */
    public void mo94A(boolean z) {
        this.f146f.mo92c(z);
        super.mo94A(z);
    }

    /* renamed from: c */
    public void mo93c(float f) {
        this.f151k += f;
        if (System.currentTimeMillis() - 25 > this.f149i) {
            this.f149i = System.currentTimeMillis();
            C2875d dVar = this.f147g;
            dVar.setMapOrientation(dVar.getMapOrientation() + this.f151k);
        }
    }

    /* renamed from: k */
    public void mo95k(C2875d dVar) {
        this.f147g = null;
    }

    /* renamed from: y */
    public boolean mo96y(MotionEvent motionEvent, C2875d dVar) {
        this.f146f.mo91a(motionEvent);
        return super.mo96y(motionEvent, dVar);
    }
}
