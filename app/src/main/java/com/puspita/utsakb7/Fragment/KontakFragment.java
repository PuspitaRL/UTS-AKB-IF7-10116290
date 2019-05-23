package com.puspita.utsakb7.Fragment;
/**
 * Nama : Puspita Rahayu Lestari
 * NIM : 1011620
 * Kelas : AKB 7
 * Waktu Pengerjaan : 23 Mei 2019
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.puspita.utsakb7.R;

public class KontakFragment extends Fragment {

    ImageView fb;
    public KontakFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        ImageView fb = (ImageView) view.findViewById(R.id.facebook);
        ImageView ig = (ImageView) view.findViewById(R.id.instagram);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://web.facebook.com/puspitarahayu");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });



        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://www.instagram.com/p.rahayu.l/");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });

    }


}
