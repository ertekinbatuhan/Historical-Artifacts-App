package com.batuhanberkertekin.citysbook.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batuhanberkertekin.citysbook.R
import com.batuhanberkertekin.citysbook.data.Countries
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val gelenIntent = intent.getSerializableExtra("key") as Countries


        aboutText.text = gelenIntent.aboutCity
        pictureView.setImageResource(gelenIntent.countryPicture)
        cityName1.text = gelenIntent.cityName
        workText.text = gelenIntent.eserName
    }
}