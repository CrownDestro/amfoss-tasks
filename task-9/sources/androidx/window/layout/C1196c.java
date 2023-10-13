package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import p041f3.C1924k;

/* renamed from: androidx.window.layout.c */
public final class C1196c {

    /* renamed from: a */
    public static final C1196c f4205a = new C1196c();

    private C1196c() {
    }

    /* renamed from: a */
    public final void mo4999a(Display display, Point point) {
        C1924k.m9141g(display, "display");
        C1924k.m9141g(point, "point");
        display.getRealSize(point);
    }
}
