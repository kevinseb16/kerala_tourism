package com.example.android.kerala_tourism

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.kerala_tourism.databinding.FragmentBackwatersBinding
import com.example.android.kerala_tourism.databinding.FragmentBeachesBinding

class backwatersfragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentBackwatersBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_backwaters, container, false)
        val dataList = ArrayList<Model>()
        dataList.add(Model(R.drawable.allapey_backwaters,"Explore one of the most striking Kerala backwaters, which is in Alleppey. A locale both for tourists and travelers. The best way to go around and explore is either a modest houseboat or a budget-friendly local ferry. Wave to the local children in vivid uniforms and the passing coconut trees.","Allapey Backwaters"))
        dataList.add(Model(R.drawable.kuttanad_bw,"Watch the duck fleet quacking together moving across the backwaters in perfect harmony. Like a patty in a burger, this locale is in between the hills and the sea. The tourists frequent this place, for their passion to witness the shimmering backwaters, that comprises of rivers, canals, and lakes on either side with the lush greenery and rural Kerala lifestyle","Kuttanad Backwaters"))
        dataList.let {
            it.add(Model(R.drawable.kumrakkom_bw,"For a perfect backwater tour in Kerala, enjoy the scenic sites of lush paddy fields and coconut trees swaying, exotic village life right by your side while you sail through a network of canals that mix into the large patch of water in the Vembanad Lake.","Kumarakom Backwaters"))
            it.add(Model(R.drawable.cherrai,"Of all the Kerala backwaters, this is a perfect blend of the sea and the backwaters. This enchanting locale is one amidst the must-see spots for tourists. it's a perfect destination for relaxation with the beachfront and picturesque view. It's a perfect destination for relaxation with the beachfront and picturesque view.","Cherai Island Backwaters"))
            it.add(Model(R.drawable.cochin,"As you know that Cochin is one of the finest harbors in the world as the “Queen of the Arabian Sea”. Soak in the serenity as you enjoy the ferry rides and cruise around the man-made island. The vast greenery will surely make you fall in love with the place with amazing views making it a must visit places during your honeymoon trip to Kerala.","Cochin Backwaters"))
            it.add(Model(R.drawable.kottayam_bw,"Take a trip to Kerala this vacation and enjoy a stay in the serenity along with your loved ones. This Kerala Backwaters Tour will never disappoint you. Nestled amidst the lush green highland and paddy fields Kottayam Backwaters is the perfect holiday place for you. The backwaters are composed of lagoons, lakes, rivers, rivulets, canals, streams and salty seawater.","Kottayam Backwaters"))
            it.add(Model(R.drawable.kozhik_bw,"Kozhikode backwaters are virgin and unspoiled backwaters that provide the visitors to explore the nature’s beauty at its best. The palm-fringed rivulets, lakes, and canals offer the guests with perfect houseboat cruising. Explore the picturesque backwater while sailing on a houseboat, observe majestic surroundings and enjoy the tranquil soothing effect of the enchanting backwaters","Kozhikode Backwaters"))
            it.add(Model(R.drawable.tvm_bw,"If you want some exciting trip then chose the Trivandrum backwater from the Kerala backwaters tours and make it a memorable one. The all-embracing backwaters of Thiruvananthapuram present a beautiful kaleidoscope of the dynamic scenery. Cruise in the traditional houseboats called \"Kettuvalloms\" are available for a tour on the scenic backwaters","Thiruvanathapuram Backwaters"))
            it.add(Model(R.drawable.valiya_bw,"Valiyaparamba Backwaters are the largest backwaters in North Kerala and the third largest backwaters in Kerala. These backwaters in another famous Kerala Backwaters tours which is a hit among the people. These backwaters are in the northern part of the Kavvayi Backwaters which flows through Kasaragod District.","Valiyaparamba Backwaters"))
            it.add(Model(R.drawable.ashtamudi_bw,"Ashtamudi Lake derives its name from eight merging channels. This locale is one of the famous backwaters of Kerala and the houseboat tours here are extremely worthy to hop in. Cruises here give you a knock at the heart and rejuvenate the tired spirit. Let the local men take you on a special voyage to rediscover yourself. The exotic biodiversity shall enchant you forever.","Ashtamudi Backwaters, Kollam"))
            it.add(Model(R.drawable.trissur_bw,"Tour the Kerala backwaters, an offbeat travel locale giving tough competition to the Alleppey backwaters. Carrying a photogenic aura, this destination lets you capture the vivid scenes in the scattered rays. This is a stop offering an insight to the local as well as the touch of modern Kerala.","Thrissur Backwaters"))

        }
        val adaptor=listadaptor(dataList)
        binding.backwatersfragment.adapter=adaptor

        return binding.root
    }
}