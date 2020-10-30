package registerlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.chatapp.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            val email = etEmailLog.text.toString()
            val password = etPasswordLog.text.toString()


            Log.d("LogIn","Attempt login with email/pwd: $email/***")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
           // Intent(this, LatestMessagesActivity::class.java)
                // .addOnCompleteListener()



        }
        txtBacktoreg.setOnClickListener {
            finish()
        }

    }
}