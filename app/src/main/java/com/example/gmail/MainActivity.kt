package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mails = arrayListOf<MailModel>()
        mails.add(MailModel("thinh phan", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        mails.add(MailModel("Heroku", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "00: 30 PM"));
        mails.add(MailModel("Take ghi", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        mails.add(MailModel("thinhphan", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        mails.add(MailModel("thinhphan", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        mails.add(MailModel("thinhphan", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        mails.add(MailModel("thinhphan", "Toi la thinh phan day chao ban nhe. Ban co ban gi khong, khong thì ta noi chuyen nhe", "12: 30 PM"));
        findViewById<ListView>(R.id.list_view).adapter = MailAdapter(mails)
    }
}