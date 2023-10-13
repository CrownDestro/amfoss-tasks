package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0937w;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.y */
final class C0954y implements Parcelable {
    public static final Parcelable.Creator<C0954y> CREATOR = new C0955a();

    /* renamed from: d */
    ArrayList<String> f3322d;

    /* renamed from: e */
    ArrayList<String> f3323e;

    /* renamed from: f */
    C0858b[] f3324f;

    /* renamed from: g */
    int f3325g;

    /* renamed from: h */
    String f3326h = null;

    /* renamed from: i */
    ArrayList<String> f3327i = new ArrayList<>();

    /* renamed from: j */
    ArrayList<C0861c> f3328j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<C0937w.C0948k> f3329k;

    /* renamed from: androidx.fragment.app.y$a */
    class C0955a implements Parcelable.Creator<C0954y> {
        C0955a() {
        }

        /* renamed from: a */
        public C0954y createFromParcel(Parcel parcel) {
            return new C0954y(parcel);
        }

        /* renamed from: b */
        public C0954y[] newArray(int i) {
            return new C0954y[i];
        }
    }

    public C0954y() {
    }

    public C0954y(Parcel parcel) {
        this.f3322d = parcel.createStringArrayList();
        this.f3323e = parcel.createStringArrayList();
        this.f3324f = (C0858b[]) parcel.createTypedArray(C0858b.CREATOR);
        this.f3325g = parcel.readInt();
        this.f3326h = parcel.readString();
        this.f3327i = parcel.createStringArrayList();
        this.f3328j = parcel.createTypedArrayList(C0861c.CREATOR);
        this.f3329k = parcel.createTypedArrayList(C0937w.C0948k.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3322d);
        parcel.writeStringList(this.f3323e);
        parcel.writeTypedArray(this.f3324f, i);
        parcel.writeInt(this.f3325g);
        parcel.writeString(this.f3326h);
        parcel.writeStringList(this.f3327i);
        parcel.writeTypedList(this.f3328j);
        parcel.writeTypedList(this.f3329k);
    }
}
