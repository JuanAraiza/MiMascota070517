package com.smasite.mimascota.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smasite.mimascota.Adapter.MascotaAdaptor;
import com.smasite.mimascota.Pojo.Mascota;
import com.smasite.mimascota.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerviewFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public RecyclerviewFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        initializerAdaptor();
        return v;
    }


    public void initializerAdaptor(){
        MascotaAdaptor adaptor = new MascotaAdaptor(mascotas, getActivity());
        listaMascotas.setAdapter(adaptor);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.dog1,"Catty", "1"));
        mascotas.add(new Mascota(R.drawable.dog2,"Hercules", "2"));
        mascotas.add(new Mascota(R.drawable.dog3,"Hachiko", "3"));
        mascotas.add(new Mascota(R.drawable.dog4,"Terry", "4"));
        mascotas.add(new Mascota(R.drawable.dog5,"Canela", "5"));
    }

}
