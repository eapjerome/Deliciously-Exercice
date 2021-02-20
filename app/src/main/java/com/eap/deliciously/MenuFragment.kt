package com.eap.deliciously

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_tutoriel.setOnClickListener {
            findNavController().navigate(R.id.tutorielFragment)
        }

        btn_profil.setOnClickListener {
            findNavController().navigate(R.id.profilFragment)
        }

        btn_remarques.setOnClickListener {
            findNavController().navigate(R.id.remarquesFragment)
        }

        btn_site.setOnClickListener {
            findNavController().navigate(R.id.webViewFragment)
        }

        btn_retour.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}