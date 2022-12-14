package com.example.gmailcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.gmailcloneapp.databinding.ActivityMainBinding
import com.example.gmailcloneapp.databinding.FragmentAuthBinding

class AuthFragment : Fragment() {

    private  var _binding : FragmentAuthBinding ? = null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Button.setOnClickListener {
            val action = AuthFragmentDirections.actionAuthFragmentToMailsFragment()
            findNavController().navigate(action)
        }
    }


}



