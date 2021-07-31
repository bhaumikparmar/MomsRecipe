package com.example.momsrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Gridview_recipe2 extends AppCompatActivity {
    ImageView i13,i14,i15,i16,i17,i18;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_recipe2);

        i13 = findViewById(R.id.imageView13);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Bread Pakoda\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for stuffing:\n" +
                        "▢3 potato / aloo (boiled & mashed)\n" +
                        "▢1 green chilli (finely chopped)\n" +
                        "▢1 inch ginger (finely chopped)\n" +
                        "▢¼ tsp kashmiri red chilli powder / lal mirch powder\n" +
                        "▢½ tsp aamchur / dry mango powder\n" +
                        "▢2 tbsp coriander (finely chopped)\n" +
                        "▢½ tsp chaat masala\n" +
                        "▢¼ tsp salt\n\n" +
                        "for besan batter:\n" +
                        "▢1 cup besan / gram flour\n" +
                        "▢2 tbsp rice flour\n" +
                        "▢¼ tsp kashmiri red chilli powder / lal mirch powder\n" +
                        "▢½ tsp salt\n" +
                        "▢pinch of soda\n" +
                        "▢½ cup water or as required\n\n" +
                        "other ingredients:\n" +
                        "▢4 slices bread (white / brown)\n" +
                        "▢4 tsp green chutney\n" +
                        "▢oil for deep frying\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large mixing bowl take 3 boiled potato.\n" +
                        "2.also add 1 green chilli, 1-inch ginger, 2 tbsp coriander,¼ tsp chilli powder, ½ tsp aamchur and ½ tsp chaat masala.\n" +
                        "3.combine all the ingredients well and aloo stuffing is ready.\n" +
                        "4.further, spread 1 tsp of green chutney over bread slice and cut half.\n" +
                        "5.spread a tbsp of prepared aloo stuffing over half slice of bread.\n" +
                        "6.cover with another half slice and dip into besan batter covering both sides.\n" +
                        "7.deep fry immediately into hot oil.\n" +
                        "8.splash oil over bread pakora and fry on medium flame flipping occasionally.\n" +
                        "9.fry till the pakora turns golden and crisp.\n" +
                        "10.finally, serve bread pakora with green chutney or tomato sauce.");
                startActivity(intent);
            }
        });
        i14 = findViewById(R.id.imageView14);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Gujrati Thepla\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "▢2 cups wheat flour / atta\n" +
                        "▢¼ cup besan / gram flour\n" +
                        "▢½ tsp kashmiri red chili powder / lal mirch powder\n" +
                        "▢1 tsp sesame seeds / til\n" +
                        "▢¼ tsp turmeric / haldi\n" +
                        "▢½ tsp carom seeds / ajwain\n" +
                        "▢1 green chili (chopped)\n" +
                        "▢salt to taste\n" +
                        "▢1 inch ginger (grated)\n" +
                        "▢1 cup methi leaves / fenugreek leaves (finely chopped)\n" +
                        "▢½ cup curd / yogurt (fresh / sour)\n" +
                        "▢water as required (to knead dough)\n" +
                        "▢2 tsp oil\n" +
                        "▢5 tsp oil / ghee (for roasting)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large mixing bowl take wheat flour and besan.\n" +
                        "2.also add chili powder, turmeric, sesame seeds, carom seeds and salt.\n" +
                        "3.additionally, add green chili and ginger.\n" +
                        "4.now add finely chopped methi leaves.\n" +
                        "5.give a rough mix making sure the spices are combined well.\n" +
                        "6.furthermore, add half cup of curd and combine the dough well.\n" +
                        "7.additionally, add some water and knead the dough.\n" +
                        "8.knead the dough to smooth and soft texture like of chapathi dough.\n" +
                        "9.add 2 tsp of oil and knead the dough for 5 more minutes.\n" +
                        "10.now pinch a medium sized ball dough, roll and flatten it.\n" +
                        "11.also dust with some wheat flour.\n" +
                        "12.further roll it in a thin circle like chapathi or paratha.\n" +
                        "13.now on a hot tawa place the rolled thepla and cook for a minute.\n" +
                        "14.furthermore, when the base is partly cooked, flip the methi thepla\n" +
                        "15.also brush oil / ghee and press slightly.\n" +
                        "16.finally, serve methi thepla with raita and pickle.");
                startActivity(intent);
            }
        });
        i15 = findViewById(R.id.imageView15);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Batata Vada\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for aloo mixture:\n" +
                        "▢2  tsp  oil\n" +
                        "▢1  tsp  cumin / jeera\n" +
                        "▢pinch  hing / asafoetida\n" +
                        "▢1  chilli ( finely chopped)\n" +
                        "▢3  clove  garlic ( finely chopped)\n" +
                        "▢few curry leaves ( chopped)\n" +
                        "▢¼  tsp  turmeric\n" +
                        "▢3  potato / aloo ( boiled & mashed)\n" +
                        "▢½  tsp  salt\n" +
                        "▢1  tsp  lemon juice\n" +
                        "▢2  tbsp  coriander ( finely chopped)\n\n" +
                        "for besan batter:\n" +
                        "▢2  cup  besan / gram flour\n" +
                        "▢2  tbsp  rice flour\n" +
                        "▢¼  tsp  turmeric\n" +
                        "▢½  tsp  kashmiri red chilli powder\n" +
                        "▢pinch  hing / asafoetida\n" +
                        "▢½  tsp  salt\n" +
                        "▢¾  cup  water\n" +
                        "▢¼  tsp  baking soda\n" +
                        "▢oil (for frying)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a kadai heat 2 tsp oil and splutter 1 tsp cumin, pinch hing, 1 chilli, 3 clove garlic and few curry leaves.\n" +
                        "2.also, add ¼ tsp turmeric and saute slightly.\n" +
                        "3.now add 3 boiled and mashed potato and ½ tsp salt.\n" +
                        "4.mix well making sure everything is well combined.\n" +
                        "5.further, add 1 tsp lemon juice and 2 tbsp coriander.\n" +
                        "6.mix well making sure everything is well combined.\n" +
                        "7.prepare besan batter by sieving 2 cup besan and 2 tbsp rice flour.\n" +
                        "8.also, add ¼ tsp turmeric, ½ tsp chilli powder, pinch hing and ½ tsp salt.\n" +
                        "9.mix well making sure everything is well combined.\n" +
                        "10.further, add ¾ cup water or as required and whisk to a smooth lump-free batter.\n" +
                        "11.add ¼ tsp baking soda and mix well forming a smooth batter.\n" +
                        "12.now take a small ball sized aloo mixture and flatten slightly.\n" +
                        "13.dip in besan batter coating uniformly.\n" +
                        "14.deep fry in hot oil carefully.\n" +
                        "15.stir occasionally, until the batata vada turns golden and crisp.\n" +
                        "16.drain off over kitchen paper to remove excess oil.\n" +
                        "17.finally, enjoy batata vada with dry garlic chutney or as vada pav.");
                startActivity(intent);

            }
        });
        i16 = findViewById(R.id.imageView16);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Dal Fry\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "▢¾ cup toor dal\n" +
                        "▢3½ cup water\n" +
                        "▢1 tbsp ghee / clarified butter\n" +
                        "▢1 tsp mustard / rai\n" +
                        "▢1 tsp jeera / cumin\n" +
                        "▢1 dried red chilli (broken)\n" +
                        "▢few curry leaves\n" +
                        "▢pinch of hing / asafoetida\n" +
                        "▢1 onion (finely chopped)\n" +
                        "▢1 tsp ginger garlic paste\n" +
                        "▢1 green chilli (slit)\n" +
                        "▢¼ tsp turmeric / haldi\n" +
                        "▢½ tsp kashmiri red chilli powder / lal mirch powder\n" +
                        "▢½ tsp coriander powder\n" +
                        "▢1 tomato (finely chopped)\n" +
                        "▢1 tsp salt\n" +
                        "▢¼ tsp garam masala\n" +
                        "▢1 tbsp coriander (finely chopped)\n" +
                        "▢1 tsp kasuri methi / dry fenugreek leaves\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly in a pressure cook ¾ cup toor dal and 3 cup water for 5 whistles.\n" +
                        "2.now in another kadai heat 1 tbsp ghee and splutter 1 tsp mustard, 1 tsp jeera, 1 dried red chilli, few curry leaves and pinch of hing.\n" +
                        "3.add in 1 onion followed by 1 tsp ginger garlic paste and 1 green chilli. saute well.\n" +
                        "4.further add ¼ tsp turmeric, ½ tsp chilli powder and ½ tsp coriander powder. saute on low flame.\n" +
                        "5.additionally add 1 tomato and saute till it turns soft and mushy.\n" +
                        "6.add the cooked dal along with 1 tsp salt. mix well.\n" +
                        "7.simmer for 5 minutes or till dal turns smooth and absorbs flavour.\n" +
                        "8.now add ¼ tsp garam masala, 1 tbsp coriander and 1 tsp crushed kasuri methi.\n" +
                        "9.finally, serve dal fry with hot jeera rice or ghee rice.");
                startActivity(intent);
            }
        });
        i17 = findViewById(R.id.imageView17);
        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Gujrati Patra\n\n\n" +
                        "Ingredients\n\n" +
                        "Chepankilangu Leaves / Arbi Leaves -4\n\n" +
                        "FOR BATTER:\n" +
                        "Gram Flour / Besan / Kadalai Mavu - 1 1/2 cup\n" +
                        "Red Chilli Powder - 1 tblsp\n" +
                        "Salt to taste\n" +
                        "Turmeric Powder - 1 tsp\n" +
                        "Jaggery / Gur - 3 tblsp\n" +
                        "Tamarind Pulp - 3 tblsp\n" +
                        "Ginger Paste - 1 tblsp\n" +
                        "Oil - 1 tblsp\n" +
                        "Water as needed\n\n" +
                        "FOR SEASONING:\n" +
                        "Oil - 2 tblsp\n" +
                        "Mustard Seeds / Kaduku - 1 tsp\n" +
                        "Cumin Seeds / Jeerakam - 1/2 tsp\n" +
                        "Sesame Seeds / Ellu / Til - 2 tblsp\n" +
                        "Curry Leaves - 1 sprig\n\n\n" +
                        "Instructions\n\n" +
                        "1.Mix all ingredients to a smooth thick batter.\n" +
                        "2.Take arbi leaves and remove the thick stalk.\n" +
                        "3.Take each leaf spread batter on top place another leaf and repeat the same.\n" +
                        "4.Roll it tight.\n" +
                        "5.Steam it for 30 mins.\n" +
                        "6.Cool it and cut into pieces.\n" +
                        "7.Now heat oil in a pan, add in mustard, cumin and sesame seeds and let it sizzle.\n" +
                        "8.Add the sliced arbi roll and cook till light golden.\n" +
                        "9.Serve hot.");
                startActivity(intent);
            }
        });
        i18 = findViewById(R.id.imageView18);
        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this,MainActivity2.class);
                intent.putExtra("value","Undhiyu\n\n\n" +
                        "Ingredients\n\n" +
                        "Undhiyu Vegetables\n\n" +
                        "2 tablespoons Ghee\n" +
                        "1 tablespoon Ajwain (Carom seeds)\n" +
                        "1/4 teaspoon Asafoetida (hing)\n" +
                        "1/2 cup Flat Green Beans , cut into 1/2 inch size pieces (surti beans or snow peas_\n" +
                        "1/4 cup Sweet Potatoes , peeled and cubed\n" +
                        "1/4 cup Elephant yam (Suran/Senai/Ratalu) , peeled and cubed\n" +
                        "1/4 cup Purple yam , peeled and cubed\n" +
                        "1/4 cup Raw Banana , peeled and cubed\n" +
                        "Salt , to taste\n\n" +
                        "Vegetables to be stuffed\n\n" +
                        "5 Small Brinjal (Baingan / Eggplant) , with 4 slits on top\n" +
                        "5 Baby Potatoes , peeled, with 4 slits on top\n\n" +
                        "For Undhiyu Masala\n" +
                        "1 cup Fresh coconut , grated\n" +
                        "1/2 cup Coriander (Dhania) Leaves , chopped\n" +
                        "4 cloves Garlic\n" +
                        "1 inch Ginger\n" +
                        "1 Green Chillies\n" +
                        "3 teaspoons Sesame seeds (Til seeds)\n" +
                        "3 teaspoon Coriander (Dhania) Seeds , roasted and powdered\n" +
                        "1/2 teaspoon Turmeric powder (Haldi)\n" +
                        "1/2 teaspoon Red Chilli powder\n" +
                        "1 tablespoon Lemon juice\n" +
                        "2 teaspoons Sugar\n" +
                        "1 teaspoon Salt , to taste\n\n" +
                        "Ingredients for methia muthia\n\n" +
                        "1/4 cup Methi Leaves (Fenugreek Leaves) , finely chopped\n" +
                        "1 cup Gram flour (besan)\n" +
                        "1/2 teaspoon Turmeric powder (Haldi)\n" +
                        "1/2 teaspoon Red Chilli powder\n" +
                        "1/4 teaspoon Asafoetida (hing)\n" +
                        "1/4 teaspoon Enos Fruit Salt\n" +
                        "2 teaspoons Sugar\n" +
                        "1 Lemon , juice extracted\n" +
                        "1 teaspoon Oil\n" +
                        "Salt , to taste\n\n" +
                        "1.To begin making the Gujarati Undhiyu Recipe - Mixed Vegetable With Fenugreek Dumplings, we will firstly make the muthiyas.\n" +
                        "\n" +
                        "2.*Method To Make Methi Muthia:\n" +
                        "\n" +
                        "3.In a small bowl combine all the ingredients for the muthia adding very little water to make firm dough. Divide the dough into 15 small portions. Shape them into ovals and lightly press them down.\n" +
                        "\n" +
                        "4.To pan fry the methi muthia in a paniyaram pan; preheat the pan add oil into the cavities of the pan. Place the muthia in the cavities and drizzle a little more oil on the top. Flip and turn to cook the muthia on all sides. Pan fry the muthia until browned on all sides. \n" +
                        "\n" +
                        "5.You can alternatively steam the Muthia's - Prepare a steamer and place the muthia in the steamer’s colander and allow it to steam for 10 minutes on medium-high heat. After 10 minutes you will notice the colour has changed to golden yellow.T urn off heat; take the colander filled with muthia’s out of the steamer and keep aside. \n" +
                        "\n" +
                        "6.*Method To Make Undhiyu:\n" +
                        "\n" +
                        "7.Add all the ingredients for the Masala into a mixer grinder, add 1/4 to 1/2 cup of water and grind to make a smooth paste. \n" +
                        "\n" +
                        "8.Fill the slit brinjals and baby potatoes with above filling mixture and keep aside. Keep the remaining filling aside.\n" +
                        "\n" +
                        "9.There are two ways you can do the Undhiyu, one in a pressure cooker, which is much faster and also in a pan where we slow cook the Undhiyu.\n" +
                        "\n" +
                        "10.Pressure Cooker Method\n" +
                        "\n" +
                        "11.Into a pressure cooker ; add in two tablespoons of ghee, add the ajwain seeds and allow it to crackle. Add the  stuffed brinjal and baby potatoes.\n" +
                        "\n" +
                        "12.Add the yam, sweet potatoes, raw bananas and beans and layer it with the coconut mixture. Add 1/4 to 1/2 cup of water and pressure cook for 4 to 5 whistles and turn off the heat. Allow the pressure to release naturally\n" +
                        "\n" +
                        "13.Once the pressure released, add the pan fried muthai's. Cover the pan and simmer for another 10 minutes and add more water if required. Cook until you notice all the vegetables and the muthias are well coated with the masala.\n" +
                        "\n" +
                        "14.Heavy Bottomed Pan Method\n" +
                        "\n" +
                        "15.In a heavy bottomed Pan ; add in two tablespoons of ghee, add the ajwain seeds and allow it to crackle. Add the   stuffed brinjal and baby potatoes and shall fry until partially cooked. This process is done on low heat, so it consumes less oil and also cooked evenly from the inside.\n" +
                        "\n" +
                        "16.Add the yam, sweet potatoes, raw bananas and beans and layer it with the coconut mixture. Add 1/4 to 1/2 cup of water and cover the pan and cook until the vegetables are cooked and coated well with the masala. This takes about half an hour.\n" +
                        "\n" +
                        "17.Once its three-fourth done, add the pan fried muthai's. Cover the pan and simmer for another 10 minutes and more water if required. Cook until you notice all the vegetables and the muthias are well coated with the masala.\n" +
                        "\n" +
                        "18.Adjust the taste by adding more or less of salt. Check the consistency of the dish to see if you need to add more or less water to suit your taste. Turn off the heat and transfer to a serving dish.\n" +
                        "\n" +
                        "19.Serve the Gujarati Undhiyu hot garnished with chopped coriander leaves and fresh coconut. Undhiyu on a festive occasion can be served along with Methi Thepla, Khandvi, Puran Poli, Kadhi, Masala Chora Pulav, Paka Kela Raita and Mohanthal.");
                startActivity(intent);

            }
        });

        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe2.this, Gridview_recipe1.class);
                startActivity(intent);

            }
        });
    }

}

