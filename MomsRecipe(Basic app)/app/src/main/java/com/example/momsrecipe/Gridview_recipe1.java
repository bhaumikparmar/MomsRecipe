package com.example.momsrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Gridview_recipe1 extends AppCompatActivity {
    ImageView i7,i8,i9,i10,i11,i12;
    Button b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_recipe1);

        i7 = findViewById(R.id.imageView7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Mexican Sandwich\n\n\n" +
                        "Ingredients\n\n" +
                        "12 bread slices\n" +
                        "3 tbsp. - butter\n" +
                        "1 small onion, chopped\n" +
                        "1 small tomato, chopped\n" +
                        "1 small boiled potato, chopped\n" +
                        "1-2 green chillies, chopped fine\n" +
                        "1 cup - boiled corn\n" +
                        "1/2 cup - grated cheese\n" +
                        "salt to taste\n" +
                        "1/2 tsp - pepper\n" +
                        "2 tbsp. - tomato sauce\n" +
                        "2 tbsp. - chilli sauce\n" +
                        "1 cup - milk\n" +
                        "1 tbsp. - butter\n" +
                        "1 tbsp. - all purpose flour\n\n\n" +
                        "INSTRUCTION\n\n" +
                        "1.Preparing white sauce:\n" +
                        "2.Heat 1 tbsp. butter in a pan. Add all purpose flour and fry lightly. Add in the milk and stir till it thickens to a sauce-like consistency.\n" +
                        "3.Now add chopped onion, tomato, potato, green chillies, boiled corn, half the cheese, salt and pepper, and saute for 10 mins.\n" +
                        "4.Now, toast the bread slices.\n" +
                        "5.Apply butter on one side only.\n" +
                        "6.Spread the vegetable mixture on the buttered side. Sprinkle the remaining grated cheese on top.\n" +
                        "7.Drizzle tomato and chilli sauce, and bake at 350 degree F or 160 degree C for ten mins. or till cheese melts.\n" +
                        "8.Serve hot.");
                startActivity(intent);
            }
        });
        i8 = findViewById(R.id.imageView8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Dal Dhokali\n\n\n" +
                        "INGREDIENTS\n\n" +
                        "½ cup toor dal (rinsed)\n" +
                        "▢1½ cup water\n" +
                        "▢1 tsp oil\n" +
                        "▢2 tbsp peanuts\n" +
                        "▢1 tsp ghee / clarified butter\n" +
                        "▢1 tsp mustard\n" +
                        "▢½ tsp cumin / jeera\n" +
                        "▢1 chilli (broken)\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢few curry leaves\n" +
                        "▢1 tomato (finely chopped)\n" +
                        "▢1 tsp ginger garlic paste\n" +
                        "▢1½ cup water\n" +
                        "▢¼ tsp turmeric\n" +
                        "▢¾ tsp kashmiri red chilli powder\n" +
                        "▢¼ tsp cumin powder\n" +
                        "▢½ tsp coriander pwoder\n" +
                        "▢¼ tsp garam masala\n" +
                        "▢small piece jaggery / gud\n" +
                        "▢¾ tsp salt\n" +
                        "▢1 tsp lemon juice\n" +
                        "▢2 tbsp coriander (finely chopped)\n\n" +
                        "for dhokli:\n" +
                        "▢1 cup wheat flour / atta\n" +
                        "▢¼ tsp turmeric\n" +
                        "▢½  tsp kashmiri red chilli powder\n" +
                        "▢¼ tsp ajwain / carom seeds\n" +
                        "▢½ tsp salt\n" +
                        "▢2 tsp oil\n" +
                        "▢½ cup water\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.in a large kadai heat 1 tsp ghee and splutter tempering.\n" +
                        "2.further add 1 tomato, 1 tsp ginger garlic paste and saute until tomatoes turn soft and mushy.\n" +
                        "3.add in cooked dal, 1½ cup water and mix well adjusting consistency as required.\n" +
                        "4.also add ¼ tsp turmeric, ¾ tsp chilli powder, ¼ tsp cumin powder, ½ tsp coriander powder and ¼ tsp garam masala.\n" +
                        "5.combine well making sure all the spices are mixed well.\n" +
                        "6.additionally add cooked peanuts, small piece jaggery, ¾ tsp salt and 1 tsp lemon juice.\n" +
                        "7.once the dal comes to a boil, drop in dhokli pieces and give a good mix well.\n" +
                        "8.cover and boil for 10-15 minutes or until dhokli is cooked completely.\n" +
                        "9.finally, add 2 tbsp coriander and enjoy dal dhokli with hot steamed rice.");
                startActivity(intent);
            }
        });
        i9 = findViewById(R.id.imageView9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Khandvi\n\n\n"
                + "INGREDIENTS \n\n" +
                "1 cup besan / chickpea flour / gram flour\n" +
                        "▢1 tbsp ginger - chili paste\n" +
                        "▢¼ ts turmeric / haldi\n" +
                        "▢salt to taste\n" +
                        "▢2 cups buttermilk or 1 cup curd + 1 cup water\n" +
                        "▢4 tbsp fresh coconut (grated)\n" +
                        "▢4 tbsp coriander leaves (finely chopped)\n\n" +
                        "for tempering:\n" +
                        "▢3 tsp oil\n" +
                        "▢1 tsp mustard seeds / rai\n" +
                        "▢1 tsp sesame seeds / til\n" +
                        "▢2 dried red chili / lal mirch (broken)\n" +
                        "▢few curry leaves (chopped)\n" +
                        "▢pinch asafoetida / hing\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a small vessel take sieved besan.\n" +
                        "2.also add ginger-chili paste, turmeric and salt to taste.\n" +
                        "3.mix well, and add 2 cups of buttermilk.\n" +
                        "4.mix well with a whisk forming a smooth flowing consistency.\n" +
                        "5.now place the vessel into the cooker.\n" +
                        "6.pressure cook for 3 whistles on medium flame.\n" +
                        "7.once the pressure releases, take the vessel out and mix well.\n" +
                        "8.take a spatula of besan paste and spread immediately over the plate.\n" +
                        "9.allow it to cool for 10 minutes.\n" +
                        "10.now, cut into 2 inch size.\n" +
                        "11.and roll tight making sure there are no cracks forming on khandvi.\n" +
                        "12.furthermore, garnish the khanvi with more coconut and coriander leaves.\n" +
                        "13.also prepare the tempering, by heating oil.\n" +
                        "14.add mustard seeds, sesame seeds, dried red chili, curry leaves and hing.\n" +
                        "15.once the tempering splutter, pour it over the khandvi.\n" +
                        "16.finally, gujarati khandvi is ready to serve with hot chai.");
                startActivity(intent);

            }
        });
        i10 = findViewById(R.id.imageView10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Moong Dalwada\n\n\n" +
                        "INGREDIENTS\n\n" +
                        "1 cup moong dal\n" +
                        "▢¼ cup water\n" +
                        "▢3 tbsp rice flour\n" +
                        "▢2 green chilli (finely chopped)\n" +
                        "▢1 inch ginger (finely chopped)\n" +
                        "▢2 tbsp onion (finely chopped)\n" +
                        "▢2 tbsp coriander (finely chopped)\n" +
                        "▢1 tsp jeera / cumin\n" +
                        "▢½ tsp salt\n" +
                        "▢¼ tsp baking soda\n" +
                        "▢oil for deep frying\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large bowl soak 1 cup moong dal for 4 hours.\n" +
                        "2.drain off the water and blend to smooth paste adding ¼ cup water.\n" +
                        "3.transfer the prepared moong dal batter into bowl.\n" +
                        "4.add in 3 tbsp rice flour for crispy vada. add more rice flour if required to get thick batter.\n" +
                        "5.also add 2 green chilli, 1 inch ginger, 2 tbsp onion, 2 tbsp coriander, 1 tsp jeera and ½ tsp salt. mix well.\n" +
                        "6.further add ¼ tsp baking soda and give a good mix.\n" +
                        "7.now dip your hand in water, and start dropping them one by one to hot oil.\n" +
                        "8.keep the flame in lower to medium stir occasionally.\n" +
                        "9.also fry the vada till they turn golden brown.\n" +
                        "10.drain off the vada on to kitchen towel to absorb oil.\n" +
                        "11.finally, serve moong dal vada with coconut chutney or tomato sauce.\n");
                startActivity(intent);
            }
        });
        i11 = findViewById(R.id.imageView11);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Kachori\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for stuffing:\n" +
                        "▢½ cup moong dal\n" +
                        "▢water (for soaking)\n" +
                        "▢1 tsp ghee / clarified butter\n" +
                        "▢1 tsp fennel (crushed)\n" +
                        "▢1 tsp cumin\n" +
                        "▢pinch hing\n" +
                        "▢¼ tsp turmeric\n" +
                        "▢1 tsp chilli\n" +
                        "▢1 coriander powder\n" +
                        "▢1 tsp garam masala\n" +
                        "▢1 tsp aamchur\n" +
                        "▢¼ ginger powder\n" +
                        "▢½ tsp salt\n" +
                        "▢¼ cup besan\n\n" +
                        "for kachori:\n" +
                        "▢2½ cup maida\n" +
                        "▢½ tsp salt\n" +
                        "▢3 tbsp ghee / clarified butter (hot)\n" +
                        "▢water (for kneading)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.how to make moong dal stuffing for kachori:\n" +
                        "2.firstly, in a bowl soak ½ cup moong dal for 2 hours.\n" +
                        "3.drain off the water and transfer to a mixi jar.\n" +
                        "4.pulse and grind to a coarse paste. keep aside.\n" +
                        "5.in a pan heat 1 tsp ghee. add 1 tsp fennel, 1 tsp cumin, pinch hing.\n" +
                        "6.saute on low flame until the spices turn aromatic.\n" +
                        "7.further add ¼ tsp turmeric, 1 tsp chilli, 1 coriander powder, 1 tsp garam masala, 1 tsp aamchur, ¼ ginger powder and ½ tsp salt.\n" +
                        "8.saute until the spices turn aromatic.\n" +
                        "9.now add ¼ cup besan and roast on low flame until the besan turns aromatic.\n" +
                        "10.add in coarsely ground moong dal.\n" +
                        "11.mix and cook for 5 minutes or until the moong dal is well combined.\n" +
                        "12.moong dal stuffing is ready. keep aside to cool completely.\n\n\n" +
                        "how to make khasta kachori:\n\n" +
                        "1.firstly, in a large bowl take 2½ cup maida, ½ tsp salt and mix well.\n" +
                        "2.pour in 3 tbsp hot ghee and mix well.\n" +
                        "3.crumble and mix making sure the flour is moist.\n" +
                        "4.now add water and start to knead the dough.\n" +
                        "5.add water as required and knead to a smooth and soft dough.\n" +
                        "6.grease the dough with oil, cover and rest for 30 minutes.\n" +
                        "7.after 30 minutes, knead the dough slightly.\n" +
                        "8.pinch a small ball sized dough and tuck well.\n" +
                        "9.grease with oil and roll gently.\n" +
                        "10.place a small ball sized prepared moong dal stuffing.\n" +
                        "11.start to pleat and seal tight. pinch off excess dough.\n" +
                        "12.now roll gently, having a uniform thickness.\n" +
                        "13.drop in hot oil, keeping the flame on low.\n" +
                        "14.do not touch until the kachori start to float by itself. takes approximately 3 minutes.\n" +
                        "15.carefully flip over and fry both sides on low flame.\n" +
                        "16.fry until the kachori turns golden brown and crisp.\n" +
                        "17.drain off the kachori over kitchen paper making sure to remove excess oil.\n" +
                        "18.finally, enjoy moong dal kachori with imli chutney.\n"
                        );
                startActivity(intent);
            }
        });
        i12 = findViewById(R.id.imageView12);
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this,MainActivity2.class);
                intent.putExtra("value","Samosa\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for dough:\n" +
                        "▢2 cup maida / plain flour\n" +
                        "▢¼ tsp ajwain / carom seeds\n" +
                        "▢½ tsp salt\n" +
                        "▢¼ cup oil\n" +
                        "▢½ cup water\n\n" +
                        "for stuffing:\n" +
                        "▢2 tsp oil\n" +
                        "▢1 tsp cumin / jeera\n" +
                        "▢½ tsp coriander seeds (crushed)\n" +
                        "▢½ tsp fennel / saunf\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢1 inch ginger (finely chopped)\n" +
                        "▢1 chilli (finely chopped)\n" +
                        "▢½ cup peas / matar\n" +
                        "▢½ tsp kashmiri red chilli powder\n" +
                        "▢½ tsp coriander powder\n" +
                        "▢¼ tsp cumin powder / jeera powder\n" +
                        "▢½ tsp aamchur / dry mango powder\n" +
                        "▢½ tsp garam masala\n" +
                        "▢¼ tsp pepper (crushed)\n" +
                        "▢¾ tsp salt\n" +
                        "▢4 potato / aloo (boiled & mashed)\n" +
                        "▢5 cashew / kaju (chopped)\n" +
                        "▢2 tbsp raisins / kishmish\n" +
                        "▢2 tbsp coriander (finely chopped)\n\n" +
                        "other ingredients:\n" +
                        "▢water (for sealing)\n" +
                        "▢oil (for deep frying)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.pinch a ball sized dough and grease with oil.\n" +
                        "2.roll the dough into oval shape.\n" +
                        "3.now cut it horizontally, diving into 2 equal portions using a knife.\n" +
                        "4.grease with water and make cone.\n" +
                        "5.stuff 2 tbsp of prepared samosa masala into the cone.\n" +
                        "6.grease little water on the edges.\n" +
                        "7.close and seal tightly by pressing firmly.\n" +
                        "8.deep-fry the samosa on a low flame. alternatively bake at 180 degree celcius for 40 minutes.\n" +
                        "9.stir occasionally, frying the samosa on low flame for atleast 15 minutes.\n" +
                        "10.once the aloo samosa turns golden and crisp, drain off over kitchen paper.\n" +
                        "11.finally, enjoy aloo samosa with green chutney and tamarind chutney.\n");
                startActivity(intent);

            }
        });

        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this, Gridview_recipe.class);
                startActivity(intent);

            }
        });
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe1.this, Gridview_recipe2.class);
                startActivity(intent);

            }
        });
    }

}

