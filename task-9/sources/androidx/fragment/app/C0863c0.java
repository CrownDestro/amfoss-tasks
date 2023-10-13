package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0988f;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c0 */
final class C0863c0 implements Parcelable {
    public static final Parcelable.Creator<C0863c0> CREATOR = new C0864a();

    /* renamed from: d */
    final String f3046d;

    /* renamed from: e */
    final String f3047e;

    /* renamed from: f */
    final boolean f3048f;

    /* renamed from: g */
    final int f3049g;

    /* renamed from: h */
    final int f3050h;

    /* renamed from: i */
    final String f3051i;

    /* renamed from: j */
    final boolean f3052j;

    /* renamed from: k */
    final boolean f3053k;

    /* renamed from: l */
    final boolean f3054l;

    /* renamed from: m */
    final Bundle f3055m;

    /* renamed from: n */
    final boolean f3056n;

    /* renamed from: o */
    final int f3057o;

    /* renamed from: p */
    Bundle f3058p;

    /* renamed from: androidx.fragment.app.c0$a */
    class C0864a implements Parcelable.Creator<C0863c0> {
        C0864a() {
        }

        /* renamed from: a */
        public C0863c0 createFromParcel(Parcel parcel) {
            return new C0863c0(parcel);
        }

        /* renamed from: b */
        public C0863c0[] newArray(int i) {
            return new C0863c0[i];
        }
    }

    C0863c0(Parcel parcel) {
        this.f3046d = parcel.readString();
        this.f3047e = parcel.readString();
        boolean z = true;
        this.f3048f = parcel.readInt() != 0;
        this.f3049g = parcel.readInt();
        this.f3050h = parcel.readInt();
        this.f3051i = parcel.readString();
        this.f3052j = parcel.readInt() != 0;
        this.f3053k = parcel.readInt() != 0;
        this.f3054l = parcel.readInt() != 0;
        this.f3055m = parcel.readBundle();
        this.f3056n = parcel.readInt() == 0 ? false : z;
        this.f3058p = parcel.readBundle();
        this.f3057o = parcel.readInt();
    }

    C0863c0(Fragment fragment) {
        this.f3046d = fragment.getClass().getName();
        this.f3047e = fragment.f2972i;
        this.f3048f = fragment.f2981r;
        this.f3049g = fragment.f2937A;
        this.f3050h = fragment.f2938B;
        this.f3051i = fragment.f2939C;
        this.f3052j = fragment.f2942F;
        this.f3053k = fragment.f2979p;
        this.f3054l = fragment.f2941E;
        this.f3055m = fragment.f2973j;
        this.f3056n = fragment.f2940D;
        this.f3057o = fragment.f2957U.ordinal();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo3380a(C0925n nVar, ClassLoader classLoader) {
        Fragment a = nVar.mo3593a(classLoader, this.f3046d);
        Bundle bundle = this.f3055m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3297q1(this.f3055m);
        a.f2972i = this.f3047e;
        a.f2981r = this.f3048f;
        a.f2983t = true;
        a.f2937A = this.f3049g;
        a.f2938B = this.f3050h;
        a.f2939C = this.f3051i;
        a.f2942F = this.f3052j;
        a.f2979p = this.f3053k;
        a.f2941E = this.f3054l;
        a.f2940D = this.f3056n;
        a.f2957U = C0988f.C0993b.values()[this.f3057o];
        Bundle bundle2 = this.f3058p;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a.f2968e = bundle2;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3046d);
        sb.append(" (");
        sb.append(this.f3047e);
        sb.append(")}:");
        if (this.f3048f) {
            sb.append(" fromLayout");
        }
        if (this.f3050h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3050h));
        }
        String str = this.f3051i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3051i);
        }
        if (this.f3052j) {
            sb.append(" retainInstance");
        }
        if (this.f3053k) {
            sb.append(" removing");
        }
        if (this.f3054l) {
            sb.append(" detached");
        }
        if (this.f3056n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3046d);
        parcel.writeString(this.f3047e);
        parcel.writeInt(this.f3048f ? 1 : 0);
        parcel.writeInt(this.f3049g);
        parcel.writeInt(this.f3050h);
        parcel.writeString(this.f3051i);
        parcel.writeInt(this.f3052j ? 1 : 0);
        parcel.writeInt(this.f3053k ? 1 : 0);
        parcel.writeInt(this.f3054l ? 1 : 0);
        parcel.writeBundle(this.f3055m);
        parcel.writeInt(this.f3056n ? 1 : 0);
        parcel.writeBundle(this.f3058p);
        parcel.writeInt(this.f3057o);
    }
}
