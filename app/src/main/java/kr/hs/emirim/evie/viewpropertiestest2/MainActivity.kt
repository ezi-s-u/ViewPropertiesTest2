package kr.hs.emirim.evie.viewpropertiestest2

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 이 문장을 실행해야 activity_main의 객체들이 생성된다.
        var t1 : TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById<TextView>(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)

        t1.setText("안녕 미림")
        t1.setTextSize(30f) // float형으로 적어야한다.
        t1.setTextColor(Color.MAGENTA)

        t2.setText("안녕 지수")
        t2.setTextSize(40f)
        t2.setTextColor(Color.CYAN)
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC)

        t3.setText("미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고미림정보과학고")
        t3.setSingleLine() // activity의 SingleLine과 달리 그냥 생략됨
    }
}