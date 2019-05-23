package com.puspita.utsakb7.Fragment;
/**
 * Nama : Puspita Rahayu Lestari
 * NIM : 1011620
 * Kelas : AKB 7
 * Waktu Pengerjaan : 23 Mei 2019
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.puspita.utsakb7.R;

public class ProfileFragment extends Fragment {


    public ProfileFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
