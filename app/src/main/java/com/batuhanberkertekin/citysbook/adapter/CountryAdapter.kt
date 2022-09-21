package com.batuhanberkertekin.citysbook.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batuhanberkertekin.citysbook.view.DetailsActivity
import com.batuhanberkertekin.citysbook.R
import com.batuhanberkertekin.citysbook.data.Countries
import kotlinx.android.synthetic.main.recyler_view.view.*

data class CountryAdapter(private val context : Context , private val countryList : List<Countries>) :
    RecyclerView.Adapter<CountryAdapter.Country>() {


           class Country(view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Country {
        val design = LayoutInflater.from(context).inflate(R.layout.recyler_view,parent,false)

        return Country(design)

    }

    override fun onBindViewHolder(holder: Country, position: Int) {
        val country = countryList[position]
        holder.itemView.countryName.text = country.countryName
        holder.itemView.cityView.setImageResource(country.countryPicture)
        holder.itemView.cityName.text = country.cityName

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)

            intent.putExtra("key",countryList.get(position))

            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return  countryList.size
    }


}
