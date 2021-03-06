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
public class fragment_productos extends Fragment {


    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_productos, container, false);
        //-----------------------------------------------------------------------------

        //-------------------------------- CARGUE DE IMAGENES ------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.im1, v.getContext().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //--------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.im2, v.getContext().getTheme());

        imagen2= (ImageView) v.findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

        //--------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.im3, v.getContext().getTheme());

        imagen3= (ImageView) v.findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);
        //----------------------------------------------------------------------------

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.im4, v.getContext().getTheme());

        imagen4= (ImageView) v.findViewById(R.id.imagen4);
        imagen4.setImageDrawable(drawable4);
        //----------------------------------------------------------------------------

        return v;
    }
}