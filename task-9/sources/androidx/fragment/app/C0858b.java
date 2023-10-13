package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0891f0;
import androidx.lifecycle.C0988f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0858b implements Parcelable {
    public static final Parcelable.Creator<C0858b> CREATOR = new C0859a();

    /* renamed from: d */
    final int[] f3030d;

    /* renamed from: e */
    final ArrayList<String> f3031e;

    /* renamed from: f */
    final int[] f3032f;

    /* renamed from: g */
    final int[] f3033g;

    /* renamed from: h */
    final int f3034h;

    /* renamed from: i */
    final String f3035i;

    /* renamed from: j */
    final int f3036j;

    /* renamed from: k */
    final int f3037k;

    /* renamed from: l */
    final CharSequence f3038l;

    /* renamed from: m */
    final int f3039m;

    /* renamed from: n */
    final CharSequence f3040n;

    /* renamed from: o */
    final ArrayList<String> f3041o;

    /* renamed from: p */
    final ArrayList<String> f3042p;

    /* renamed from: q */
    final boolean f3043q;

    /* renamed from: androidx.fragment.app.b$a */
    class C0859a implements Parcelable.Creator<C0858b> {
        C0859a() {
        }

        /* renamed from: a */
        public C0858b createFromParcel(Parcel parcel) {
            return new C0858b(parcel);
        }

        /* renamed from: b */
        public C0858b[] newArray(int i) {
            return new C0858b[i];
        }
    }

    C0858b(Parcel parcel) {
        this.f3030d = parcel.createIntArray();
        this.f3031e = parcel.createStringArrayList();
        this.f3032f = parcel.createIntArray();
        this.f3033g = parcel.createIntArray();
        this.f3034h = parcel.readInt();
        this.f3035i = parcel.readString();
        this.f3036j = parcel.readInt();
        this.f3037k = parcel.readInt();
        this.f3038l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3039m = parcel.readInt();
        this.f3040n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3041o = parcel.createStringArrayList();
        this.f3042p = parcel.createStringArrayList();
        this.f3043q = parcel.readInt() != 0;
    }

    C0858b(C0856a aVar) {
        int size = aVar.f3142c.size();
        this.f3030d = new int[(size * 6)];
        if (aVar.f3148i) {
            this.f3031e = new ArrayList<>(size);
            this.f3032f = new int[size];
            this.f3033g = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0891f0.C0892a aVar2 = aVar.f3142c.get(i);
                int i3 = i2 + 1;
                this.f3030d[i2] = aVar2.f3159a;
                ArrayList<String> arrayList = this.f3031e;
                Fragment fragment = aVar2.f3160b;
                arrayList.add(fragment != null ? fragment.f2972i : null);
                int[] iArr = this.f3030d;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3161c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3162d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3163e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3164f;
                iArr[i7] = aVar2.f3165g;
                this.f3032f[i] = aVar2.f3166h.ordinal();
                this.f3033g[i] = aVar2.f3167i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f3034h = aVar.f3147h;
            this.f3035i = aVar.f3150k;
            this.f3036j = aVar.f3028v;
            this.f3037k = aVar.f3151l;
            this.f3038l = aVar.f3152m;
            this.f3039m = aVar.f3153n;
            this.f3040n = aVar.f3154o;
            this.f3041o = aVar.f3155p;
            this.f3042p = aVar.f3156q;
            this.f3043q = aVar.f3157r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    private void m3900a(C0856a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f3030d.length) {
                C0891f0.C0892a aVar2 = new C0891f0.C0892a();
                int i3 = i + 1;
                aVar2.f3159a = this.f3030d[i];
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3030d[i3]);
                }
                aVar2.f3166h = C0988f.C0993b.values()[this.f3032f[i2]];
                aVar2.f3167i = C0988f.C0993b.values()[this.f3033g[i2]];
                int[] iArr = this.f3030d;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.f3161c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                aVar2.f3162d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                aVar2.f3163e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                aVar2.f3164f = i10;
                int i11 = iArr[i9];
                aVar2.f3165g = i11;
                aVar.f3143d = i6;
                aVar.f3144e = i8;
                aVar.f3145f = i10;
                aVar.f3146g = i11;
                aVar.mo3480d(aVar2);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f3147h = this.f3034h;
                aVar.f3150k = this.f3035i;
                aVar.f3148i = true;
                aVar.f3151l = this.f3037k;
                aVar.f3152m = this.f3038l;
                aVar.f3153n = this.f3039m;
                aVar.f3154o = this.f3040n;
                aVar.f3155p = this.f3041o;
                aVar.f3156q = this.f3042p;
                aVar.f3157r = this.f3043q;
                return;
            }
        }
    }

    /* renamed from: c */
    public C0856a mo3366c(C0937w wVar) {
        C0856a aVar = new C0856a(wVar);
        m3900a(aVar);
        aVar.f3028v = this.f3036j;
        for (int i = 0; i < this.f3031e.size(); i++) {
            String str = this.f3031e.get(i);
            if (str != null) {
                aVar.f3142c.get(i).f3160b = wVar.mo3659f0(str);
            }
        }
        aVar.mo3354o(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3030d);
        parcel.writeStringList(this.f3031e);
        parcel.writeIntArray(this.f3032f);
        parcel.writeIntArray(this.f3033g);
        parcel.writeInt(this.f3034h);
        parcel.writeString(this.f3035i);
        parcel.writeInt(this.f3036j);
        parcel.writeInt(this.f3037k);
        TextUtils.writeToParcel(this.f3038l, parcel, 0);
        parcel.writeInt(this.f3039m);
        TextUtils.writeToParcel(this.f3040n, parcel, 0);
        parcel.writeStringList(this.f3041o);
        parcel.writeStringList(this.f3042p);
        parcel.writeInt(this.f3043q ? 1 : 0);
    }
}
