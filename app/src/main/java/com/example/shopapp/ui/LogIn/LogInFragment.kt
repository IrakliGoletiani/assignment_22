package com.example.shopapp.ui.LogIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.shopapp.R
import com.example.shopapp.databinding.LogInFragmentBinding
import com.example.shopapp.extensions.setColorToTextView

class LogInFragment : Fragment() {


    private val viewModel: LogInViewModel by viewModels()

    lateinit var binding: LogInFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LogInFragmentBinding.inflate(layoutInflater)

        binding.btnLogIn.button.text = getString(R.string.log_in)

        binding.tvSignUp.setColorToTextView(
            arrayOf(
                getString(R.string.new_user),
                getString(R.string.sign_up),
                getString(R.string.here)
            ),
        arrayOf(R.color.gray,R.color.main_color,R.color.gray)
        )

        return binding.root
    }


}