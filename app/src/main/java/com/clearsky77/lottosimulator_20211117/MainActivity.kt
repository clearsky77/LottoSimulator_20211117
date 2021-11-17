package com.clearsky77.lottosimulator_20211117

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mWinLottoNumArr = ArrayList<Int>()

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


    fun makeLottoNumbers() {
        // 기존에 번호 지우기
        mWinLottoNumArr.clear()

        // 6개 당첨 번호
        for (i in 0 until 6) { // for (i in 0..4)
            // 랜덤 숫자 추출 -> 목록에 추가
            while (true) {
                val randomNum = (Math.random() * 45 + 1).toInt()
                Log.d("랜덤", randomNum.toString())

                var isDuplOk = !mWinLottoNumArr.contains(randomNum)

                if (isDuplOk) { // 중복이 아니면
                    mWinLottoNumArr.add(randomNum)
                    break;
                }
            }
            Log.d("숫자 확인", i.toString())

        }

        for (num in mWinLottoNumArr) {
            Log.d("당첨번호", num.toString())

        }


    }


}