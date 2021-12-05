package com.example.dcjacketsdesingreto2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 *
 *
 * @author Cristian Vásquez
 */
public class fragment_servicios extends Fragment {

    Drawable drawable1, drawable2, drawable3;
    ImageView imagen5, imagen6, imagen7;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_servicios, container, false);
        //-----------------------------------------------------------------------------


        //-------------------------------- CARGUE DE IMAGENES ------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.im5, v.getContext().getTheme());

        imagen5 = (ImageView)v.findViewById(R.id.imagen5);
        imagen5.setImageDrawable(drawable1);

        //--------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.im6, v.getContext().getTheme());

        imagen6= (ImageView) v.findViewById(R.id.imagen6);
        imagen6.setImageDrawable(drawable2);

        //--------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.im7, v.getContext().getTheme());

        imagen7= (ImageView) v.findViewById(R.id.imagen7);
        imagen7.setImageDrawable(drawable3);


        //-----------------------------------------------------------------------------
        return v;
    }
}