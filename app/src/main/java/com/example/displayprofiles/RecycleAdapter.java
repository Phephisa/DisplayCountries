package com.example.displayprofiles;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.*;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.CountryViewHolder> {
    private List<Country> countryList;

    public RecycleAdapter(List<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent, false);

        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
    Country country = countryList.get(position);
    holder.countryName.setText(country.getCountryName());
    holder.countryImage.setImageResource(country.getCountryImage());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
    public static class CountryViewHolder extends RecyclerView.ViewHolder{
        //creating the displaying variables
        public TextView countryName;
        public CircleImageView countryImage;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            //linking variables to main pictures
            countryName = itemView.findViewById(R.id.profile_name);
            countryImage = itemView.findViewById(R.id.profile_image);
        }
    }
}
