package p083m0;

import android.view.View;
import android.view.WindowId;

/* renamed from: m0.h0 */
class C2533h0 implements C2535i0 {

    /* renamed from: a */
    private final WindowId f8586a;

    C2533h0(View view) {
        this.f8586a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2533h0) && ((C2533h0) obj).f8586a.equals(this.f8586a);
    }

    public int hashCode() {
        return this.f8586a.hashCode();
    }
}
