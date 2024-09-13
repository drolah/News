package com.example.newsactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class HeadlinesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_headlines, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView: ListView = view.findViewById(R.id.list_view)
        val items = listOf("Item 1", "Item 2", "Item 3")  // Example list
        listView.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            (activity as? MainActivity)?.onItemSelected(selectedItem)
        }

    }
}