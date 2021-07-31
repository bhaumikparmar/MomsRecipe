package com.example.momsrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Gridview_recipe extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_recipe);

        i1 = findViewById(R.id.imageView1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Aloo Tikki\n\n\n"+
                        "INGREDIENTS: \n\n"+
                        "▢3 potato / aloo (boiled & grated)\n" +
                        "▢1 chilli (finely chopped)\n" +
                        "▢1 tsp ginger garlic paste\n" +
                        "▢¼ tsp turmeric\n" +
                        "▢½ tsp kashmiri red chilli powder\n" +
                        "▢½ tsp cumin powder / jeera powder\n" +
                        "▢½ tsp aamchur / dry mango powder\n" +
                        "▢½ tsp chaat masala\n" +
                        "▢½ tsp salt\n" +
                        "▢2 tbsp mint / pudina (chopped)\n" +
                        "▢2 tbsp coriander (chopped)\n" +
                        "▢2 tbsp corn flour\n" +
                        "▢oil ( for frying)\n\n\n"+
                        "INSTRUCTIONS\n\n"+
                       "1.firstly, in a large mixing bowl take 3 boiled and grated potato. make sure to pressure cook potatoes for 4-5 whistles and drain off the water as soon as pressure releases.\n"+
                        "2.add 1 chilli, 1 tsp ginger garlic paste, ¼ tsp turmeric and ½ tsp chilli powder.\n"+
                        "3.also add ½ tsp cumin powder, ½ tsp aamchur, ½ tsp chaat masala and ½ tsp salt.\n"+
                        "4.further add 2 tbsp mint and 2 tbsp coriander.\n"+
                        "5.now add 2 tbsp cornflour and mix well alternatively use poha powder or rice flour as it helps to absorb moisture.\n"+
                        "6.mix well forming a soft dough.\n"+
                        "7.grease hand with oil and prepare ball-sized tikki.\n"+
                        "8.shallow fry in hot oil. you can alternatively roast or deep fry.\n"+
                        "9.roast on low flame until it turns golden brown.\n"+
                        "10.flip over and cook on both sides.\n"+
                        "11.finally, enjoy aloo tikki with green chutney, tamarind chutney or prepare aloo tikki chaat.");
                startActivity(intent);
            }
        });
        i2 = findViewById(R.id.imageView2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Khaman Dhokla\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for batter:\n" +
                        "▢1½ cup besan / gram flour\n" +
                        "▢3 tbsp rava / semolina / suji (fine)\n" +
                        "▢½ tsp ginger paste\n" +
                        "▢2 chilli (finely chopped)\n" +
                        "▢¼ tsp turmeric\n" +
                        "▢1 tsp sugar\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢½ tsp salt\n" +
                        "▢1 tbsp lemon juice\n" +
                        "▢1 tbsp oil\n" +
                        "▢1 cup water\n" +
                        "▢½ tsp eno fruit salt\n\n" +
                        "for tempering:\n" +
                        "▢3 tsp oil\n" +
                        "▢½ tsp mustard\n" +
                        "▢½ tsp cumin / jeera\n" +
                        "▢1 tsp sesame / til\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢few curry leaves\n" +
                        "▢2 chilli (slit)\n" +
                        "▢¼ cup water\n" +
                        "▢1 tsp sugar\n" +
                        "▢¼ tsp salt\n" +
                        "▢1 tsp lemon juice\n\n" +
                        "for garnishing:\n" +
                        "▢2 tbsp coconut (grated)\n" +
                        "▢2 tbsp coriander (finely chopped)\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large mixing bowl sieve 1½ cup besan and 3 tbsp rava.\n" +
                        "2.add ½ tsp ginger paste, 2 chilli, ¼ tsp turmeric, 1 tsp sugar, pinch hing, ½ tsp salt, 1 tbsp lemon juice and 1 tbsp oil.\n" +
                        "3.prepare a smooth batter adding 1 cup of water or as required.\n" +
                        "4.additionally, add ½ tsp of eno fruit salt. you can alternatively use a pinch of baking soda.\n" +
                        "5.immediately steam the dhokla batter for 20 minutes.\n" +
                        "6.further, cut the dhokla and pour tempering.\n" +
                        "7.garnish the dhokla with 2 tbsp chopped coriander leaves and 2 tbsp fresh grated coconut.\n" +
                        "8.finally, serve instant khaman dhokla with green chutney and tamarind chutney.");
                startActivity(intent);
            }
        });
        i3 = findViewById(R.id.imageView3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Bhel Puri\n\n\n" +
                        "INGREDIENTS\n\n" +
                        "▢2 cup murmura / puffed rice / churumuri\n" +
                        "▢½ onion (finely chopped)\n" +
                        "▢½ potato / aloo (boiled & cubed)\n" +
                        "▢3 papdi (crushed)\n" +
                        "▢3 tbsp mixture\n" +
                        "▢2 tbsp fried peanuts\n" +
                        "▢2 tbsp tomato (finely chopped)\n" +
                        "▢½ tsp chaat masala\n" +
                        "▢¼ tsp kashmiri red chilli powder\n" +
                        "▢¼ tsp salt\n" +
                        "▢3 tbsp tamarind chutney / imli chutney\n" +
                        "▢2 tbsp green chutney\n" +
                        "▢1 tsp lemon juice\n" +
                        "▢2 tbsp sev\n" +
                        "▢1 tsp coriander (finely chopped)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large mixing bowl take 2 cups murmura. dry roast murmura if they are not crisp.\n" +
                        "2.add ½ onion, ½ potato, 3 crushed papdi, 3 tbsp mixture and 2 tbsp fried peanuts.\n" +
                        "3.also add 2 tbsp tomato, ½ tsp chaat masala, ¼ tsp chilli powder and ¼ tsp salt.\n" +
                        "4.mix well making sure the spices are combined well.\n" +
                        "5.further add 3 tbsp tamarind chutney, 2 tbsp green chutney and 1 tsp lemon juice.\n" +
                        "6.mix well without turning murmura soggy.\n" +
                        "7.add 2 tbsp sev and give a mix.\n" +
                        "8.finally, enjoy bhel puri topped with few crushed papdi and garnished with onion, coriander.\n");
                startActivity(intent);

            }
        });
        i4 = findViewById(R.id.imageView4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Gujrati Handvo\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for handvo batter:\n" +
                        "▢1 cup rice\n" +
                        "▢½ cup chana dal\n" +
                        "▢¼ cup toor dal\n" +
                        "▢2 tbsp urad dal\n" +
                        "▢½ cup curd / yogurt\n" +
                        "▢1 cup bottle gourd / lauki (grated)\n" +
                        "▢½ cup cabbage (grated)\n" +
                        "▢¼ cup carrot (grated)\n" +
                        "▢3 tbsp coriander (finely chopped)\n" +
                        "▢½ tsp ginger paste\n" +
                        "▢1 green chilli (finely chopped)\n" +
                        "▢½ tsp sugar\n" +
                        "▢¼ tsp kashmiri red chilli powder\n" +
                        "▢¼ tsp turmeric / haldi\n" +
                        "▢2 tsp oil\n" +
                        "▢¾ tsp salt\n" +
                        "▢1 tsp eno / fruit salt\n\n" +
                        "for tempering:\n" +
                        "▢3 tsp oil\n" +
                        "▢¾ tsp mustard\n" +
                        "▢½ tsp cumin / jeera\n" +
                        "▢1 tsp sesame / til\n" +
                        "▢few curry leaves\n" +
                        "▢pinch hing / asafoetida\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, soak 1 cup rice, ½ cup chana dal, ¼ cup toor dal, 2 tbsp urad dal for 3-4 hours.\n" +
                        "2.add ½ cup curd and blend to a smooth but slightly coarse paste.\n" +
                        "3.further add 1 cup grated bottle gourd, ½ cup grated cabbage, ¼ cup grated carrot and 3 tbsp coriander.\n" +
                        "4.also add ½ tsp ginger paste, 1 green chilli, ½ tsp sugar, ¼ tsp chilli powder, ¼ tsp turmeric, 2 tsp oil and ¾ tsp salt.\n" +
                        "5.mix well making sure the batter is slightly thick like idli batter consistency.\n" +
                        "6.now add 1 tsp eno / fruit salt and mix gently.\n" +
                        "7.bake the handvo in over or cook on tawa");
                startActivity(intent);
            }
        });
        i5 = findViewById(R.id.imageView5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Pasta\n\n\n" +
                        "INGREDIENTS\n\n" +
                        "4 cup water\n" +
                        "▢1 tsp oil\n" +
                        "▢1 tsp salt\n" +
                        "▢1 cup elbow macaroni\n" +
                        "▢4 tsp mayonnaise (eggless)\n" +
                        "▢½ tsp pepper\n" +
                        "▢1 tsp lemon juice\n" +
                        "▢¼ onion (sliced)\n" +
                        "▢½ carrot (julienne)\n" +
                        "▢¼ capsicum (julienne)\n" +
                        "▢5 cherry tomato (halves)\n" +
                        "▢2 tbsp spring onion (chopped)\n" +
                        "▢1 tsp dill leaves / sabbasige soppu / soa (chopped)\n\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.firstly, in a large saucepan boil 4 cup water along with 1 tsp oil and ¾ tsp salt.\n" +
                        "2.once the water comes to a boil, add 1 cup elbow macaroni.\n" +
                        "3.boil for 8 minutes or till it turns al dente\n" +
                        "4.drain off the pasta and pour a cup of cold water to stop the cooking process. keep aside.\n" +
                        "5.now in a large bowl take 4 tsp eggless mayonnaise.\n" +
                        "6.also add ½ tsp pepper, 1 tsp lemon juice and ¼ tsp salt.\n" +
                        "7.mix well and salad dressing is ready.\n" +
                        "8.now add ¼ onion, ½ carrot, ¼ capsicum, 5 cherry tomato and 2 tbsp spring onion.\n" +
                        "9.also, add cooked and cooked macaroni.\n" +
                        "10.mix gently, making sure the dressing is coated well.\n" +
                        "11.cover and rest in the refrigerator for an hour to absorb all the flavours.\n" +
                        "12.finally, serve pasta salad / macaroni salad garnished with chopped dill leaves.");
                startActivity(intent);
            }
        });
        i6 = findViewById(R.id.imageView6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this,MainActivity2.class);
                intent.putExtra("value","Pani Puri\n\n\n" +
                        "INGREDIENTS \n\n" +
                        "for puri:\n" +
                        "▢1 cup rava / semolina / suji (coarse)\n" +
                        "▢2 tbsp maida / plain flour\n" +
                        "▢3 tbsp oil\n" +
                        "▢¼ cup hot water\n" +
                        "▢oil (for frying)\n\n" +
                        "for theeka pani:\n" +
                        "▢¼ cup mint / pudina\n" +
                        "▢½ cup coriander\n" +
                        "▢1 inch ginger\n" +
                        "▢2 chilli\n" +
                        "▢small ball sized tamarind\n" +
                        "▢1 tsp chaat masala\n" +
                        "▢1 tsp cumin powder\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢¾ tsp salt\n" +
                        "▢4 cup cold water\n\n" +
                        "for khatta meetha pani:\n" +
                        "▢1 cup tamarind extract\n" +
                        "▢3 tbsp jaggery / gud\n" +
                        "▢1 tsp chaat masala\n" +
                        "▢1 tsp cumin powder\n" +
                        "▢¼ tsp pepper powder\n" +
                        "▢¼ tsp kashmiri red chilli powder\n" +
                        "▢pinch hing / asafoetida\n" +
                        "▢¾ tsp salt\n" +
                        "▢3 cup cold water\n\n" +
                        "for aloo stuffing:\n" +
                        "▢3 potato / aloo (boiled & mashed)\n" +
                        "▢½ onion (finely chopped)\n" +
                        "▢2 tbsp coriander (finely chopepd)\n" +
                        "▢½ tsp cumin powder\n" +
                        "▢½ tsp chaat masala\n" +
                        "▢¼ tsp pepper powder\n" +
                        "▢½ tsp kashmiri red chilli powder\n" +
                        "▢½ tsp salt\n\n" +
                        "for serving:\n" +
                        "▢2 tbsp boondi\n\n" +
                        "INSTRUCTIONS\n\n" +
                        "1.puri recipe for pani puri:\n" +
                        "2.firstly, in a large bowl take 1 cup rava and 2 tbsp maida.\n" +
                        "3.add 3 tbsp oil, crumble and mix well making sure the rava turns moist.\n" +
                        "4.now add ¼ cup hot water and start to knead.\n" +
                        "5.knead for 5 to 8 minutes or until the dough is formed.\n" +
                        "6.sprinkle water as required and knead to a smooth and soft dough.\n" +
                        "7.cover the dough and rest for 20 minutes.\n" +
                        "8.after 20 minutes, continue to knead for 2 more minutes.\n" +
                        "9.now pinch a very small ball sized dough.\n" +
                        "10.roll and flatten into small disk making sure it is thin.\n" +
                        "11.deep fry in hot oil, do not overcrowd the oil.\n" +
                        "12.flip over once the puri puffs up.\n" +
                        "13.fry on medium flame until it turns golden brown and crisp from both the sides.\n" +
                        "14.drain off over kitchen paper to get rid off excess oil.\n" +
                        "15.puri is ready for pani puri. once cooled completely, you can store in an airtight container and use it for a week.\n\n" +
                        "theeka pani preparation:\n" +
                        "1.firstly, in a small blender take ¼ cup mint, ½ cup coriander, 1 inch ginger, 2 chilli and small ball sized tamarind.\n" +
                        "2.blend to smooth paste adding water as required.\n" +
                        "3.transfer theeka pani puri paste into a large bowl.\n" +
                        "4.add 1 tsp chaat masala, 1 tsp cumin powder, pinch hing, ¾ tsp salt and 4 cup cold water.\n" +
                        "5.mix well and theeka pani is ready to enjoy with golgappa.\n\n" +
                        "for khatta meetha pani preparation:\n" +
                        "1.firstly, in a large bowl take 1 cup tamarind extract and 3 tbsp jaggery.\n" +
                        "2.also add 1 tsp chaat masala, 1 tsp cumin powder, ¼ tsp pepper powder, ¼ tsp chilli powder, pinch hing, ¾ tsp salt and 3 cup cold water.\n" +
                        "3.mix well and khatta meetha pani is ready to enjoy with golgappa.\n\n" +
                        "aloo stuffing preparation:\n" +
                        "1.firstly, in a small bowl take 3 potato, ½ onion and 2 tbsp coriander.\n" +
                        "2.also add ½ tsp cumin powder, ½ tsp chaat masala, ¼ tsp pepper powder, ½ tsp chilli powder and ½ tsp salt.\n" +
                        "3.mix well making sure everything is well combined.\n" +
                        "4.aloo stuffing is ready to enjoy with puchka.\n" +
                        "5.assembling pani puri for serving:\n" +
                        "6.firstly, just before serving add handful of boondi to theeka pani and khatta meetha pani.\n" +
                        "7.make a small hole in centre of puri.\n" +
                        "8.stuff a tsp of prepared aloo stuffing into puri.\n" +
                        "9.dip into theeka pani or khatta meetha pani and enjoy.\n" +
                        "10.finally, pani puri recipe is ready to serve.");
                startActivity(intent);

            }
        });

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gridview_recipe.this, Gridview_recipe1.class);
                startActivity(intent);

            }
        });

    }

}

