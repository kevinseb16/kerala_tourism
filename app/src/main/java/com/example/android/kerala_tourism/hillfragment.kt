package com.example.android.kerala_tourism

import android.os.Bundle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.kerala_tourism.databinding.FragmentBeachesBinding
import com.example.android.kerala_tourism.databinding.FragmenthillstationsBinding

class hillfragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmenthillstationsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragmenthillstations, container, false
        )
        val dataList = ArrayList<Model>()
        dataList.let {
            it.add(Model(R.drawable.wayanad_hill,"With its mist clad mountains and mountainous rivers, Wayanad is an idyllic destination for a weekend getaway. The majestic beauty, thick rainforest, dazzling waterfalls and spice plantations provide not just a lot to see but also loads of adventure sports to indulge in. Visit to decide if it is the best hill station in Kerala."," Wayanad – For Mist Clad Mountains"))
            it.add(Model(R.drawable.munnar_hill,"The famed hill station of Munnar is as popular for its romantic locale as for it’s thriving tea gardens. And if you plan well, you can see the valley turn blue during the bloom of Neelakurinji, which flowers only once in twelve years.","Munnar – For Thriving Tea Gardens"))
            it.add(Model(R.drawable.vagamon,"Encircled by a string of thee hills, Vagamon is a place of inexplicable beauty. With a combinations of meadows, forests and hills there is a lot of natural beauty to appreciate in this paradisiacal hill station. Go for a nature trails with your loved one to see untamed buffaloes and elephants bathing in the small waterbodies for a romantic afternoon.","Vagamon – A Paradisiacal Hill Station"))
            it.add(Model(R.drawable.ponmudi_hill,"Ponmudi is one of the enchanting hill stations near Trivandrum with narrow winding pathways which offers picturesque views to those who travel by road. With a beautiful array of mountain flowers, exotic butterflies and small rivulets, it is sight best enjoyed sitting next to your loved one.","Ponmudi – An Enchanting Hill Station"))
            it.add(Model(R.drawable.silent_hill,"For an atypical holiday experience that you will remember for years, visit the Silent Valley. Unlike many of the commercial hill stations, much of the natural charm here is still well preserved today and it is also home to a number of rare species and the Kurumbar Tribes."," Silent Valley – A Preserved Beauty"))
            it.add(Model(R.drawable.idukii,"Idukki is one of the most nature rich areas of Kerala and offers diverse attractions like wildlife sanctuaries, spice plantations, mountain treks, and elephant rides among others. There are very few hill stations near Kochi and Idukki happens to be the closest one."," Idukki – For Natural Beauty"))
            it.add(Model(R.drawable.thekkadii,"Prepare to explore the wild side of Kerala at Thekkady. Uniquely rich and varied in its flora and fauna, this exotic hill station provides much to experience.","Thekkady – Rich In Flora And Fauna"))
            it.add(Model(R.drawable.lakkidi_hill,"Being small in size is one of the advantages of Lakkidi in Kerala. Also known as one of the most famous hill stations in Kerala, it is said that you can explore the entire place on foot and witness the captivating sceneries with your loved ones.","Lakkidi – Explore The Place On Foot"))
            it.add(Model(R.drawable.peermade_hill,"This small yet humble hill station in Kerala sits peacefully amid the glorious lush sceneries all around. You have ample of options to explore here, such as Thrissanku Hills, Grampi and Peeru hills. This place is named after the famous Sufi Saint Peer Mohammed and adds more to the charm of Kerala.","Peermade – A Peaceful Getaway"))
            it.add(Model(R.drawable.malampuzha_hill,"They say there is something in store for everyone in Malampuzha, which is why you cannot miss out on one of the best hill stations in Kerala. Explore the rock gardens or spot the various species of fishes at the fish-shaped aquarium here or simply visit the amusement parks for fun-packed holiday with your folks.","Malampuzha – For A Beautiful Experience"))
        }
        val adaptor=listadaptor(dataList)
        binding.hillfragment.adapter=adaptor
        return binding.root
    }
}