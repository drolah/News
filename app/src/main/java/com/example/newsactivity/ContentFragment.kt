package com.example.newsactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ContentFragment : Fragment() {

    private var detailText: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val detailTextView: TextView = view.findViewById(R.id.detail_text)
        detailText?.let {
            detailTextView.text = it
        }
    }

    fun setDetailText(text: String) {
        detailText = text
    }
}