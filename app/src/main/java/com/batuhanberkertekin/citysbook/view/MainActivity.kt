package com.batuhanberkertekin.citysbook.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.batuhanberkertekin.citysbook.R
import com.batuhanberkertekin.citysbook.adapter.CountryAdapter
import com.batuhanberkertekin.citysbook.data.Countries
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var  countryList : ArrayList<Countries>
   private lateinit var  countryAdapter : CountryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryList = ArrayList()
        val TurkeyIzmir = Countries("Türkiye",R.drawable.efes,"İzmir","Efes Anadolu'nun batı kıyısında, bugünkü Selçuk ilçesinin 3 km uzağında bulunan, daha sonra önemli bir Roma kenti olan antik bir Yunan kentiydi. Klasik Yunan döneminde İyonya'nın oniki şehrinden biriydi. Kuruluşu Cilalı Taş Devri MÖ 6000 yıllarına dayanır.")
        val TurkeyNevsehir = Countries("Türkiye",R.drawable.kapadokya,"Nevşehir","Kapadokya bölgesi, doğa ve tarihin dünyada en güzel bütünleştiği yerdir. Coğrafik olaylar Peribacaları'nı oluştururken, tarihi süreçte, insanlar da, bu peribacalarının içlerine ev, kilise oymuş, bunları fresklerle süsleyerek, binlerce yıllık yaşlı medeniyetlerin izlerini günümüze taşımıştır.")
        val Amerika = Countries("Amerika",R.drawable.ozgurluk,"New York","Bakırdan yapılan Özgürlük Heykeli, Fransa tarafından kuruluşunun 100. yılı nedeniyle ABD'ye hediye edilmiştir. 1884-1886 yılları arasında inşa edilmiştir. ABD'nin New York şehrindeki Özgürlük Adası'nda yer alır. Heykel, sağ elinde bir meşale, sol elinde ise bir hitabe tutar.")
        val Italya = Countries("İtalya",R.drawable.pisa,"Pisa","Pisa Kulesi, İtalya'nın kuzeyindeki Pisa şehrinde Piazza dei Miracoli'de (İtalyanca Mucizeler Meydanı) yer alan ve 1063-1090 yıllarında yapılan şehir katedralinin çan kulesi, ana yapıdan ayrı olarak 1173'te yapılmıştır. Kule üst üste bindirilmiş yuvarlak 6 sütun dizisinden meydana gelmiştir. 56 metre yüksekliktedir.")
        val Fransa = Countries("Fransa",R.drawable.eyfel,"Paris","Eyfel Kulesi 26 Ocak 1887-31 Mart 1889 tarihleri arasında inşa edilmiş Paris'in ve hatta Fransa'nın en önemli sembolü. 1665 basamaklı, 324,8 metre yüksekliğinde, 10.150 ton ağırlığında demirden yapılmış devasa bir mimari. New York'taki Chrysler Building'e dek dönemin en yüksek yapısıydı")
        val Turkey = Countries("Türkiye",R.drawable.kiz_kulesi,"İstanbul","Kule 1509 depreminde yıkılmış, yeniden inşa edilmiş ve 1721'de yanmıştır. Sadrazam Damat İbrahim Paşa tarafından imar emri verilmiş ve yeni bina deniz feneri olarak kullanılmış; çevre surlar 1731 ve 1734 yıllarında onarılmıştır. Sonunda 1763'te kule daha dayanıklı taştan yeniden inşa edildi.")
        countryList.add(Fransa)
        countryList.add(Turkey)
        countryList.add(Italya)
        countryList.add(Amerika)
        countryList.add(TurkeyIzmir)
        countryList.add(TurkeyNevsehir)


        countryAdapter = CountryAdapter(this,countryList)
        recylerView.adapter = countryAdapter

        recylerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

    }




}