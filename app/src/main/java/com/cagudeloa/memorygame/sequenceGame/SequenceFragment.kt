package com.cagudeloa.memorygame.sequenceGame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.cagudeloa.memorygame.MainActivity
import com.cagudeloa.memorygame.R
import com.cagudeloa.memorygame.databinding.FragmentSequenceBinding

class SequenceFragment : Fragment() {

    private lateinit var binding: FragmentSequenceBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_sequence, container, false)


        val sequenceGame = SequenceGame(binding, activity as MainActivity)
        sequenceGame.setScores()

        binding.playButton.setOnClickListener {
            sequenceGame.showSquares()
            sequenceGame.hideSquares()
            sequenceGame.setListeners()
        }
        return binding.root
    }
}