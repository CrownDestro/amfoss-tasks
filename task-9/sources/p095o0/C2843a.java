package p095o0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: o0.a */
public class C2843a {
    /* renamed from: a */
    public static <T extends View> T m12908a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
