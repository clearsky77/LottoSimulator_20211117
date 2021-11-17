package com.clearsky77.lottosimulator_20211117

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValue()
    }

    private fun setupEvents() {
        btnBuyLotto.setOnClickListener {
            // 로또 번호 6개 생성
            makeLottoNumbers()
            // 보너스 번호 생성
        }
    }

    private fun setValue() {

    }



    fun makeLottoNumbers(){
        for (i in 0 until 6){ // for (i in 0..4)
            Log.d("숫자 확인",i.toString())
        }
    }


}