package br.com.inclusion.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.inclusion.databinding.FragmentGestureBinding
import br.com.inclusion.ui.viewmodel.GestureViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class GestureFragment : Fragment() {

    private var _binding: FragmentGestureBinding? = null
    private val binding get() = _binding!!
    private val gestureViewModel: GestureViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGestureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}