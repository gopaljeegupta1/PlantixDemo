package com.gopal.plantixdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gopal.plantixdemo.R
import com.gopal.plantixdemo.databinding.ListItemBinding
import com.gopal.plantixdemo.util.DataResponse

class NotesListAdapter(
    private val noteList: List<DataResponse>
) :
    RecyclerView.Adapter<NotesListAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding = ListItemBinding.bind(itemView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = noteList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = noteList[position]
        with(holder.binding) {
            noteText.text = note.name.capitalize()
        }
    }


}