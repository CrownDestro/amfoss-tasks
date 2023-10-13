package p009b;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import p041f3.C1920g;

/* renamed from: b.b */
public final class C1245b extends C1244a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C1246a f4279a = new C1246a((C1920g) null);

    /* renamed from: b.b$a */
    public static final class C1246a {
        private C1246a() {
        }

        public /* synthetic */ C1246a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public Map<String, Boolean> mo3698a(int i, Intent intent) {
        if (i != -1) {
            return C3248c0.m14286d();
        }
        if (intent == null) {
            return C3248c0.m14286d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C3248c0.m14286d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C3248c0.m14289g(C3271t.m14402Q(C3257h.m14321l(stringArrayExtra), arrayList));
    }
}
