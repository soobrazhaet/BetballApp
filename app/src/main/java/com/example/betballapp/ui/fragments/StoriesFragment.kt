package com.example.betballapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.betballapp.R
import com.example.betballapp.databinding.FragmentStoriesBinding
import com.example.betballapp.viewmodel.PlayersBioViewModel


class StoriesFragment : Fragment(R.layout.fragment_stories) {

    lateinit var binding: FragmentStoriesBinding
    val playersBioViewModel: PlayersBioViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoriesBinding.inflate(inflater, container, false)

        binding.imageCruyff.setOnClickListener {
            goBio()
            playersBioViewModel.setData(R.drawable.cruyff_background, "JOHAN CRUYFF", "The \"Flying Dutchman\", as Johan Cruyff is often called, is a football legend both as a player and as a coach. For 752 matches, Johan scored 425 goals. Here are his most significant achievements during the years of his football career: three Golden Balls, three European Cup winners with Ajax, the best player in Europe in the 20th century. As part of his native club, he won everything that was possible. Ajax in those days was a fantastic force both in their own country and abroad. The team won three European Cups in a row: in 1971, 1972 and 1973.\n" +
                    "\n" +
                    "In his honor, the feint \"Cruyff's turn\" was named, which the player first performed in 1974, at the World Championships. After that, many players began to repeat it. It is Cruyff's style of play, both as a player and as a coach, that is commonly referred to as \"total football\". The main principles of \"total football\" were: dominant possession of the ball, hard pressing, universalism of all players, skillful execution of artificial offside.")
        }

        binding.imagePele.setOnClickListener {
            goBio()
            playersBioViewModel.setData(R.drawable.pele_background, "PELE", "Edson Arantis do Nascimenta, known to everyone as Pele, is a legendary figure in football. Pele is a graduate of Santos. The debut, in an official match, occurred at the age of 15, in a match against Corinthians. Already in the first match, he scored a goal. Pele is the only player to have won the World Cup three times. The best player in the world, in the 20th century, according to all football experts. His personal record is 8 goals in a match, which he set in 1964.\n" +
                    "\n" +
                    "During his career, he played 1363 matches in various official and unofficial tournaments, in which he scored 1281 goals. Although these data are criticized, since the exact number of all the friendly matches played by Pele is not known exactly, only one thing cannot be deducted from all this: the title of “King of Football” went to Pele for a reason, but for his great contribution to the development of world football.")
        }

        binding.imageMaradona.setOnClickListener {
            goBio()
            playersBioViewModel.setData(R.drawable.maradona_background, "DIEGO MARADONA", "Maradona is not just a football player, but a legend of Argentinean and world football. Many fans and experts put him above Pele, and disputes over who is the best football player in history are still sharpening.\n" +
                    "The peak of his career came while playing for Napoli, where he moved in 1984 from Barcelona for a then-record \$7.6 million. Together with the Neapolitans, Maradona twice won the gold of the Italian championship, and in 1986 he won the World Cup as part of the Argentina national team. There are still murals depicting Diego in Naples, and fans remember his game with delight.\n" +
                    "Maradona is the national symbol of all of Argentina, and almost everyone knows about the “hand of God” from birth. One of the most famous goals in the history of football, which Maradona scored against England in the quarter-finals of the World Cup, was called the \"Hand of God\". This goal was counted through the inattention of the referees, but for the fans it became a symbol of the \"divine\" game of Maradona.")
        }

        binding.imageGoat.setOnClickListener {
            goBio()
            playersBioViewModel.setData(R.drawable.goat_background, "CRISTIANO RONALDO", "A little west of France is Portugal, where Ronaldo is from. Since this is a player of our time, most of us have seen his game and know his achievements. For those who don't know, here are the most significant ones: 5 Golden Balls, over 800 goals in a career, the best scorer in the history of football, in official matches, 5-time Champions League winner, European champion in 2016. Demonstrates simply incredible physical shape for many years. That's why we love Criro.\n" +
                    "\n" +
                    "At the end of 2022, Ronaldo became a player in the Al-Nasr team from Saudi Arabia. Cristiano Ronaldo is the highest paid soccer player in the world. His salary is about 200 million euros\n" +
                    "per year.")
        }

        binding.imageMessi.setOnClickListener {
            goBio()
            playersBioViewModel.setData(R.drawable.messi_background, "LIONEL MESSI", "Again, fast forward to the present, as this rating is simply not possible without Messi. I didn’t put him next to Ronaldo on purpose. Messi is an icon of modern football.\n" +
                    "\n" +
                    "He currently has 7 Golden Balls. We can't even imagine when this record will be broken. He spent almost his entire football career at Barcelona, where he set an incredible number of records: the record holder for the number of Golden Balls - 6, the record holder for the number of Golden Boots - 6, the best scorer in the history of Barcelona - 672 goals, the top scorer in the history of the championship of Spain - 474 goals.\n" +
                    "\n" +
                    "In July 2021, Messi became a free agent, and due to the difficult financial situation of the club, it was not possible to conclude a new contract. August 10, 2021 Messi officially became a PSG player.\n" +
                    "By 2022, Messi has won every possible trophy, both at club and national level, except for the World Cup. ")
        }

        return binding.root
    }

    private fun goBio(){
        findNavController().navigate(R.id.action_storiesFragment_to_playersBiographyFragment)
    }
}