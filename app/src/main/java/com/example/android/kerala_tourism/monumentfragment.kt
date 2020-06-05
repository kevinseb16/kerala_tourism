package com.example.android.kerala_tourism

import android.os.Bundle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.kerala_tourism.databinding.FragmentBeachesBinding
import com.example.android.kerala_tourism.databinding.FragmentMonumentsBinding

class monumentfragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentMonumentsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_monuments, container, false)
        val dataList = ArrayList<Model>()
        dataList.let {
            it.add(Model(R.drawable.bekal_fort_monu,"Bekal Fort dates back to 300 years. Situated on the backdrop of Arabian Seashore in Kasaragod district, this is the largest fort of the state spread over 40 acres. Shaped like a giant keyhole, the fort houses observation towers that offer breathtaking views, a water tank, a Hanuman temple, and an ancient mosque.","Bekal Fort"))
            it.add(Model(R.drawable.anjuthengu_mon,"Anjuthengu means five coconut trees. This fort is located in the groves of coconut near the famous beach of Varkala. The English East India Company laid its foundation in 1684. The fort was leased to trade in spices, cash crops, and other businesses. ","Anjuthengu Fort"))
            it.add(Model(R.drawable.dutch_mon,"Built by the Portuguese in 1557 and presented to Raja Veera Kerala Varma of Kochi, the Palace was renovated in 1663 by the Dutch. The palace has a Bhagavathi Temple in the central courtyard. It is built like the typical Kerala style mansion; the Nalukettu. The double storeyed palace stands by the panoramic Kochi backwaters.","Dutch Palace"))
            it.add(Model(R.drawable.padmana_mon,"Padmanabhapuram Palace is a magnificent wooden palace of the 16th century. It lies at the land’s end of mainland India; Kanyakumari in Tamil Nadu. The palace reflects the royal splendor of erstwhile Travancore (1550 to 1750 AD). In spite of the location, the palace comes under the Government of Kerala’s administration. ","Padmanabhapuram Palace"))
            it.add(Model(R.drawable.hill_mon,"The Hill Palace is Kerala’s first heritage museum. Owned and inhabited by the royal family of Cochin, the palace has been handed to government supervision in the 1980s. Noted for royal collections of the erstwhile Maharaja of Kochi, it is one of the must-visit sites.","Hill Palace"))
            it.add(Model(R.drawable.thalaserry_mon,"Thalassery fort is situated at the heart of Thalassery city in Kannur district. The fort was the military center of British rule on the Malabar Coast. Standing as the monument of colonialism, British East India Company constructed this fort with carved doors, secret tunnels, and two underground chambers.","Thalassery Fort"))
            it.add(Model(R.drawable.krishna_mon,"Krishnapuram Palace is an 18th-century palace built by Anizham Thirunal Marthanda Varma in the Alleppey district of Kerala. It is one rare specimen of the Kerala style of architecture. The royal home of the rulers of Kayamkulam Kingdom, the palace has memorabilia of the bygone era. ","Krishnapuram Palace"))
            it.add(Model(R.drawable.jewish_syna_mon,"Kerala is one of the few places the Jewish community made an impact in India. In the coastal city of Kochi, Jewish Synagogue or Paradesi synagogue is a major historical monument. The place of worship is one of the oldest existing synagogues in the world.","Jewish Synagogue"))
            it.add(Model(R.drawable.bolghatti_mon,"Bolghatty Palace is located on an island in the Arabian Sea. This is one of the oldest Dutch Palaces outside Holland. Built-in the 18th century, the place was the home of the Dutch Governor then later transferred to the British Governors. The beautiful monument has been converted into a heritage hotel. ","Bolghatty Palace"))
            it.add(Model(R.drawable.palakad_mon,"Palakkad Fort is located in the town of Palakkad in Kerala known as Tippu’s Fort. Built by Tippu Sultan’s father Hyder Ali (1717 – 1782) when he captured the northern regions of Kerala. Tippu Sultan was known as the “Tiger of Mysore”. He was a fierce patriot and fought against the British in India. ","Palakkad Fort"))
        }
        val adaptor=listadaptor(dataList)
        binding.monumentfragment.adapter=adaptor

        return binding.root
    }
}