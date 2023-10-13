package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import p041f3.C1924k;

/* renamed from: androidx.window.layout.b */
public final class C1195b {

    /* renamed from: a */
    public static final C1195b f4204a = new C1195b();

    private C1195b() {
    }

    /* renamed from: a */
    public final Rect mo4998a(Activity activity) {
        C1924k.m9141g(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C1924k.m9140f(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
