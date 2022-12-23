package dacno.sourabh.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Result_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)

        val tvName :TextView =findViewById(R.id.tv_participantName)
        val tvScore :TextView =findViewById(R.id.tv_score)
        val btnFinish:TextView =findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions =intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer =intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text="Your Score is $correctAnswer out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }





    }
}