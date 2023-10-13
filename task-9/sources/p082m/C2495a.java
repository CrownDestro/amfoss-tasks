package p082m;

import android.view.View;

/* renamed from: m.a */
public class C2495a {
    /* renamed from: a */
    public static String m11495a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
