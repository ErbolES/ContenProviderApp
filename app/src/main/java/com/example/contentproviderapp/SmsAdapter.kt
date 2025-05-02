package com.example.contentproviderapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contentproviderapp.databinding.ItemSmsBinding

class SmsAdapter(private val smsList: List<Sms>) : RecyclerView.Adapter<SmsAdapter.SmsViewHolder>() {

    class SmsViewHolder(private val binding: ItemSmsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(sms: Sms) {
            binding.senderTextView.text = sms.sender
            binding.messageTextView.text = sms.message
            binding.dateTextView.text = sms.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmsViewHolder {
        val binding = ItemSmsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SmsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SmsViewHolder, position: Int) {
        holder.bind(smsList[position])
    }

    override fun getItemCount(): Int = smsList.size
}