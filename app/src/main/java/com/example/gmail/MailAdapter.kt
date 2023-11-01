package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class MailAdapter(val mails: ArrayList<MailModel>): BaseAdapter() {
    override fun getCount(): Int {
        return mails.size
    }

    override fun getItem(position: Int): Any {
        return mails[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getViewTypeCount(): Int {
        return 2
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView: View
        itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.activity_mail, parent, false)
        itemView.findViewById<Button>(R.id.button).text = mails[position].title[0].toString()
        itemView.findViewById<TextView>(R.id.textView2).text = mails[position].title
        itemView.findViewById<TextView>(R.id.textView3).text = mails[position].description
        itemView.findViewById<TextView>(R.id.textView4).text = mails[position].time
        return itemView
    }
}