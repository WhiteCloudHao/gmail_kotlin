package com.example.gmail

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MailAdapter(val mails: ArrayList<MailModel>): BaseAdapter() {
    private val selectedItems = HashSet<Int>()
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
        var  backgroundColorTintLong = 0xFF1CD38A

        val itemView: View
        itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.activity_mail, parent, false)
        val button = itemView.findViewById<Button>(R.id.button)
        val textView2 = itemView.findViewById<TextView>(R.id.textView2)
        val textView3 = itemView.findViewById<TextView>(R.id.textView3)
        val textView4 = itemView.findViewById<TextView>(R.id.textView4)
        val starButton = itemView.findViewById<ImageButton>(R.id.starButton)
        button.text = mails[position].title[0].toString()
        textView2.text = mails[position].title
        textView3.text = mails[position].description
        textView4.text = mails[position].time
        button.setOnClickListener {
            if (selectedItems.contains(position)) {
                button.text = mails[position].title[0].toString()
                textView2.text = mails[position].title
                textView3.text = mails[position].description
                textView4.text = mails[position].time
                val  backgroundColorTint = backgroundColorTintLong.toInt()
                button.backgroundTintList = ColorStateList.valueOf(backgroundColorTint)
                var  backgroundColorTintLongLayout = 0xFFFFFFFF
                val  backgroundColorTintLayout = backgroundColorTintLongLayout.toInt()
                itemView.backgroundTintList= ColorStateList.valueOf(backgroundColorTintLayout)
                button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
                selectedItems.remove(position)
                starButton.visibility = View.VISIBLE
            } else {
                selectedItems.add(position)
                button.text = "New Text" // Đặt nội dung mới cho button
                textView2.text = "" // Đặt nội dung mới cho TextView2
                textView3.text = "Touch a sender image to select that conversation"
                textView4.text = ""
                val newTint = ColorStateList.valueOf(Color.GRAY)
                button.backgroundTintList = newTint
                button.text = ""
                starButton.visibility = View.GONE
                val iconResource = R.drawable.baseline_file_download_done_24
                button.setCompoundDrawablesWithIntrinsicBounds(0, 0, iconResource, 0)
                val newTintLayout = ColorStateList.valueOf(Color.RED)
                itemView.backgroundTintList = newTintLayout
            }
        }
            return itemView
    }

}