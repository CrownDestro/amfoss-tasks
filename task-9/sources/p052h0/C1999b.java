package p052h0;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: h0.b */
public class C1999b {
    /* renamed from: a */
    public static SharedPreferences m9252a(Context context) {
        return context.getSharedPreferences(m9254c(context), m9253b());
    }

    /* renamed from: b */
    private static int m9253b() {
        return 0;
    }

    /* renamed from: c */
    private static String m9254c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
