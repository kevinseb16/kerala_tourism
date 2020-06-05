package com.example.android.kerala_tourism

import android.os.Bundle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.kerala_tourism.databinding.FragmentBeachesBinding

class beachesfragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {

        val binding: FragmentBeachesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_beaches, container, false)
        val dataList = ArrayList<Model>()
        dataList.let {
            it.add(Model(R.drawable.kovalam_beach,"Kovalam is a beachside, quaint little town near Thiruvananthapuram. This town has three beaches, separated by rocks. The Lighthouse beach is one of the most romantic beaches in Kerala and is considered as the paradise of the south.","Kovalam Beach"))
            it.add(Model(R.drawable.kappad_beach,"Kappad has interesting history attached to it. The explorer Vasco Da Gama landed on the shores of the town Calicut now known as Kozhikode, when he docked in India in the year 1498. Another romantic getaway, this beach is serene and not too overwhelming which makes it one of the best beaches in Kerala.","Kappad Beach"))
            it.add(Model(R.drawable.kannur_beach,"If you want to enjoy a book on a hammock or bathe in warm waters, Kannur is the perfect beach. A lesser known beach, it is not very crowded yet one of the best beaches in Kerala. No kidding, the setting is enough for anyone to fall in love with this beach.","Kannur Beach Lesser Known But Beautiful"))
            it.add(Model(R.drawable.marari,"Marari beach in Kerala is a lover’s paradise. With high waves, turquoise skies and an expansive sandy beach, sitting on the shores of Marari is almost next to meditating. It is so serene and peaceful that it won’t be wrong to term it as the best beach in Kerala.","Marari Beach: For The Romantic Setting"))
            it.add(Model(R.drawable.cherai_beach,"Another one of the best beaches in Kerala, Cherai beach is near Kochi and is a nice place to enjoy beach fishing. The beach is clean and offers a serene environment to cuddle with your loved one. Make sure you include this place in your  romantic Kerala beaches itinerary.","Cherai Beach: Perfect For Beach Fishing"))
            it.add(Model(R.drawable.varkala_beach,"Blue skies, coconut palms, lapping waters, cool sea breeze, sounds romantic, doesn’t it? Varkala is a beautiful coastal town and has some of the most peaceful seaside cliffs and good beaches in Kerala.","Varkala Beach: Peaceful Is The Word"))
            it.add(Model(R.drawable.alapuzha_beach,"One of the most visited beaches in Kerala, Alappuzha is popularly referred to as Venice of the east. It is one of the most picturesque beaches of Alleppey. Besides the houseboats, Alappuzha also offers the perfect romantic setting for newlyweds and couples looking for beaches near Alleppey.","Alappuzha Beach: Picturesque Got A New Name"))
            it.add(Model(R.drawable.somatheeram_beach,"With an ayurvedic beach resort, it is the perfect getaway to calm your senses and enjoy the big waves lapping against the shores of Kerala. Somatheeram is like a big tropical garden beside a beach. Great ambiance, undisturbed beach bathing, and soothing calmness make this beach a romantic hotspot and it won’t be wrong to call it the best beach in Kerala for honeymoon.","Somatheeram Beach: Popular For The Ayurvedic Resort"))
            it.add(Model(R.drawable.bekal_beach,"Bekal beach and fort, for all its exotic charm, is the best sea beach in Kerala. Coupled with pristine waters, white sand and a postcard perfect fort, this beach will strum your romantic chords.","Bekal Beach: Beach With A Fort"))
            it.add(Model(R.drawable.payolli_beach,"Counted among comparatively good beaches in Kerala, Payyoli is rather quiet and desolate sojourn away from rush hour crowds! This beach is near Kozhikode and is a perfect romantic getaway. This beach is known for being a breeding ground for turtles. Watching baby turtles make their journey into the sea, what could be more romantic?","Payyoli Beach: Quiet & Desolate But Stunning"))
        }
        val adaptor=listadaptor(dataList)
        binding.beachesfragment.adapter=adaptor


        return binding.root
    }
}