package com.example.subiyantoroapp

object HeroesData {
    private val Heroes = arrayOf(
        "Naruto",
        "Sasuke",
        "Sakura",
        "Kakashi",
        "Obito",
        "Killer Bee",
        "Shikamaru",
        "Hashirama",
        "Tobirama",
        "Sarutobi",
        "Minato"
    )

    private val Details = arrayOf(
        "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage. In the following years, through many hardships and ordeals, he became a capable ninja regarded as a hero both by the villagers, and soon after, the rest of the world, becoming known as the Hero of the Hidden Leaf (木ノ葉隠れの英雄, Konohagakure no Eiyū, Literally meaning: Hero of the Hidden Tree Leaves). He soon proved to be one of the main factors in winning the Fourth Shinobi World War, leading him to achieve his dream and become the village's Seventh Hokage (七代目火影, Nanadaime Hokage, Literally meaning: Seventh Fire Shadow).",
        "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the \"Supporting Kage\" (支う影, Sasaukage, Literally meaning: Supporting Shadow).",
        "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) is a kunoichi of Konohagakure. When assigned to Team 7, Sakura quickly finds herself ill-prepared for the duties of a shinobi. However, after training under the Sannin Tsunade, she overcomes this, and becomes recognised as one of the greatest medical-nin in the world.",
        "Kakashi Hatake (はたけカカシ, Hatake Kakashi) is a shinobi of Konohagakure's Hatake clan. Famed as Kakashi of the Sharingan (写輪眼のカカシ, Sharingan no Kakashi), he is one of Konoha's most talented ninja; regularly looked to for advice and leadership despite his personal dislike of responsibility. To his students on Team 7, Kakashi teaches the importance of teamwork, a lesson he received, along with the Sharingan, from his childhood friend, Obito Uchiha. After the Fourth Shinobi World War, Kakashi becomes Konoha's Sixth Hokage (六代目火影, Rokudaime Hokage, Literally meaning: Sixth Fire Shadow).",
        "Obito Uchiha (うちはオビト, Uchiha Obito) was a member of Konohagakure's Uchiha clan. He was believed to have died during the Third Shinobi World War, his only surviving legacy being the Sharingan he gave to his teammate, Kakashi Hatake. In truth, Obito was saved from death and trained by Madara Uchiha, but the events of the war left Obito disillusioned with reality, and he inherited Madara's plan to create an ideal world. Resurfacing under the names of Tobi (トビ, Tobi) and Madara Uchiha himself, Obito subtly took control of the Akatsuki, using them as a means to advance his machinations, eventually going public and starting the Fourth Shinobi World War. However, towards the war's conclusion, Obito had a change of heart and, as atonement, sacrificed his life to save the same world he sought to replace.",
        "Killer B (キラービー, Kirā Bī, Viz: Killer Bee) is a shinobi from Kumogakure. He is the most recent jinchūriki of the Eight-Tails, though, unlike his predecessors, he was able to befriend it and hone its power for Kumo's benefit. Despite being responsible for the village's protection, B aspires to be the world's greatest rapper.",
        "Shikamaru Nara (奈良シカマル, Nara Shikamaru) is a shinobi of Konohagakure's Nara clan. Though lazy by nature, Shikamaru has a rare intellect that consistently allows him to prevail in combat. The responsibilities that these successes leave him with cause him frequent annoyance, but he gladly accepts them so that he may be of service to his fellow members of Team Asuma, and to prove himself to generations of the past and future.",
        "Hashirama Senju (千手柱間, Senju Hashirama) was a member of the famed Senju clan. He himself was hailed as the \"God of Shinobi\" for his unmatched ninja prowess. Hashirama sought peace for the shinobi world, and to that end founded Konohagakure with his clan, his childhood friend and rival: Madara Uchiha and the Uchiha clan. He would later become the First Hokage (初代火影, Shodai Hokage, Literally meaning: First or Founding Fire Shadow) of Konohagakure. Although he was not able to achieve peace during his lifetime, his legacy and vision for the world would continue to shape the village and the entire shinobi world even after his death.",
        "Tobirama Senju (千手扉間, Senju Tobirama) was a member of the renowned Senju clan, who, together with his elder brother and the Uchiha clan, founded the first shinobi village: Konohagakure. Throughout his lifetime, Tobirama would work tirelessly to achieve political stability and implement the institutions that made the village system work, thus ensuring Konoha's continuity and prosperity. After his brother's death, he would earn the title of Second Hokage (二代目火影, Nidaime Hokage, Literally meaning: Second Fire Shadow).",
        "Hiruzen Sarutobi (猿飛ヒルゼン, Sarutobi Hiruzen) was the Third Hokage (三代目火影, Sandaime Hokage, Literally meaning: Third Fire Shadow) of Konohagakure. A disciple of the village's previous Hokage, Hiruzen was a powerful ninja, hailed as a \"God of Shinobi\". Though he was only ever directly the teacher of the Sannin, generations of Konoha shinobi benefited from his wisdom during his lifetime.",
        "Minato Namikaze (波風ミナト, Namikaze Minato) was the Fourth Hokage (四代目火影, Yondaime Hokage, Literally meaning: Fourth Fire Shadow) of Konohagakure. He was renowned all over the world as Konoha's Yellow Flash (木ノ葉の黄色い閃光, Konoha no Kiiroi Senkō, English TV: Yellow Flash of the Leaf). He died during the Nine-Tailed Demon Fox's Attack, sacrificing his life to seal a part of the Nine-Tails into his newborn son, Naruto Uzumaki."
    )

    private val Images = arrayOf(
        R.drawable.naruto,
        R.drawable.sasuke,
        R.drawable.sakura,
        R.drawable.kakashi,
        R.drawable.obito,
        R.drawable.bee,
        R.drawable.shikamaru,
        R.drawable.hasirama,
        R.drawable.tobirama,
        R.drawable.sarutobi,
        R.drawable.minato
    )

    val listDataHero: ArrayList<Hero>
        get() {
            val datas = arrayListOf<Hero>()
            for (pos in Heroes.indices) {
                val hero = Hero()
                hero.name = Heroes[pos]
                hero.detail = Details[pos]
                hero.photo = Images[pos]
                datas.add(hero)
            }
            return datas
        }
}