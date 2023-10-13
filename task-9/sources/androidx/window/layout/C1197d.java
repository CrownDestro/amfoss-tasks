package androidx.window.layout;

import android.view.DisplayCutout;
import p041f3.C1924k;

/* renamed from: androidx.window.layout.d */
public final class C1197d {

    /* renamed from: a */
    public static final C1197d f4206a = new C1197d();

    private C1197d() {
    }

    /* renamed from: a */
    public final int mo5000a(DisplayCutout displayCutout) {
        C1924k.m9141g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: b */
    public final int mo5001b(DisplayCutout displayCutout) {
        C1924k.m9141g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: c */
    public final int mo5002c(DisplayCutout displayCutout) {
        C1924k.m9141g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: d */
    public final int mo5003d(DisplayCutout displayCutout) {
        C1924k.m9141g(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
