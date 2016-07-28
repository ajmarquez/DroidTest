package com.ninjarobot.abelardo.startfleet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Abelardo on 27/7/16.
 */
public class FleetFragment extends Fragment {

    private Starship mStarship;
    private EditText mNameField;
    private EditText mModelField;
    private EditText mMakerField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStarship = new Starship();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_fleet, container, false);

        //Name Field
        mNameField = (EditText)v.findViewById(R.id.starship_name);
        mNameField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mStarship.setName(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //ModelField
        mModelField = (EditText)v.findViewById(R.id.starship_model);
        mModelField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            mStarship.setModel(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //ManufacturerField
        mMakerField = (EditText)v.findViewById(R.id.starship_manufacturer);
        mMakerField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            mStarship.setManufacturer(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    };


        return view;
    }
}

