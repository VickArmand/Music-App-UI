package com.example.musicapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.databinding.SongsBinding

class Songlistadapter(val context: Context, var items:List<Items>): RecyclerView.Adapter<Songlistadapter.MyViewHolder> () {
    class MyViewHolder(private val myItem: SongsBinding) : RecyclerView.ViewHolder(myItem.root) {
fun setData(item:Items){
    myItem.apply {
        imageView.setImageResource(item.image)
        textView.text=item.name
        textView2.text=item.desc
    }
}
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Songlistadapter.MyViewHolder {
     val binding: SongsBinding= SongsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return  MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Songlistadapter.MyViewHolder, position: Int) {
        val item=items[position]
        holder.setData(item)
    }

    override fun getItemCount(): Int {
      return items.size
    }
}