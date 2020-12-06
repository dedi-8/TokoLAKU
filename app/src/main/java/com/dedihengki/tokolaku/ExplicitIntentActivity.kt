package com.dedihengki.tokolaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_explicit_intent.*
import kotlinx.android.synthetic.main.activity_simple.*

class ExplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        txt_harga.text = "Rp. 5000.000"
        txt_display.text = "Display 14.0 16:9 HD (1366x768)"
        txt_merk.text = "Asus"
        txt_sistem.text= "Windows"
        txt_processor.text= "Amd A4 7th 9125 2.3Ghz"
        txt_ram.text="4GB"
        txt_penyimpanan.text="1 TB HDD"
       txt_layar.text="14 inc"
        txt_resolusi.text="1366x768"
        txt_berat.text="1.6"
        txt_garansi.text="Garansi Resmi"
        txt_graphic.text="AMD"
        txt_periode.text="Garansi Resmi Asus 2 Tahun"
        txt_stok.text="5"
        txt_deskripsi.text= "DualCore A4 9125-2.3Ghz upto 2.6Ghz,RAM 4GB,HDD 1TB,Display: 14.0\" (16:9) LED backlit HD (1366x768) 60Hz Glare Panel with 45% NTSC,Wifi,Bluetooth,Camera,AMD Radeon R3 Graphics,DVD RW,Windows 10 Original,Free Bag Original ASUS"

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener{
            val backIntent = Intent(this@ExplicitIntentActivity, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}