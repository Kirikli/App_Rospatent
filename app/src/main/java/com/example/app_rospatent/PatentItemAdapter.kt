package com.example.app_rospatent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class PatentItemAdapter(private val mList: List<PatentItem>) : RecyclerView.Adapter<PatentItemAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_spisok, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val PatentItem = mList[position]

        // sets the text to the textview from our itemHolder class
        holder.tvTitle.text = PatentItem.title
        holder.tvAuthor.text = PatentItem.author
        holder.tvNumberApplication.text = PatentItem.numberOfApplication
        holder.tvIPC.text = PatentItem.ipc

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        val tvNumberApplication: TextView = itemView.findViewById(R.id.tvNumberApplication)
        val tvIPC: TextView = itemView.findViewById(R.id.tvIPC)
    }

}