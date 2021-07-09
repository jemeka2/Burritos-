import java.util.ArrayList;
import java.util.Random;
import java.text.NumberFormat;

public class Burritos {
    public static void main(String[] args)
    {
        //Variables
        Random randomizer = new Random();
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();


        //ArrayList
        ArrayList<String> riceList = new ArrayList<>();
        ArrayList<String> meatList = new ArrayList<>();
        ArrayList<String> beansList = new ArrayList<>();
        ArrayList<String> salsaList = new ArrayList<>();
        ArrayList<String> veggiesList = new ArrayList<>();
        ArrayList<String> quesoList = new ArrayList<>();
        ArrayList<String> sourCreamList = new ArrayList<>();
        ArrayList<String> cheeseList = new ArrayList<>();
        ArrayList<String> guacList = new ArrayList<>();



        //adding to ArrayList (I wanted to use List to do this but we haven't learned that yet)
        riceList.add("white,");
        riceList.add("brown,");
        riceList.add("no rice,");
        riceList.add("both,");

        meatList.add("chicken,");
        meatList.add("steak,");
        meatList.add("carnidas,");
        meatList.add("chorizo,");
        meatList.add("sofritas,");
        meatList.add("veggie meat,");
        meatList.add("no meat,");
        meatList.add("all,");

        beansList.add("pinto,");
        beansList.add("black,");
        beansList.add("no beans,");
        beansList.add("both,");

        salsaList.add("mild,");
        salsaList.add("medium,");
        salsaList.add("hot,");
        salsaList.add("no salsa,");
        salsaList.add("all,");

        veggiesList.add("lettuce,");
        veggiesList.add("no veggies,");
        veggiesList.add("fajita veggies,");
        veggiesList.add( "all,");

        cheeseList.add("cheese,");
        cheeseList.add("no cheese,");

        guacList.add("guac,");
        guacList.add("no gauc,");

        quesoList.add("queso,");
        quesoList.add("no queso,");

        sourCreamList.add("sour cream,");
        sourCreamList.add("no sour cream,");

        for(int i = 1; i <= 25; i++){

            //Random Numbers
            int riceNum = randomizer.nextInt(riceList.size());
            int meatNum = randomizer.nextInt(meatList.size());
            int beansNum = randomizer.nextInt(beansList.size());
            int salsaNum = randomizer.nextInt(salsaList.size());
            int veggiesNum = randomizer.nextInt(veggiesList.size());
            int cheeseNum = randomizer.nextInt(cheeseList.size());
            int guacNum = randomizer.nextInt(guacList.size());
            int quesoNum = randomizer.nextInt(quesoList.size());
            int sourCreamNum = randomizer.nextInt(sourCreamList.size());
            int switchNum = 1 + randomizer.nextInt(5);

            double burritoPrice = 3;

            String rice = riceList.get(riceNum);
            if(rice.equals("white,") || rice.equals("brown,")){
                burritoPrice += 0.5;
            }
            else if(rice.equals("both,")){
                burritoPrice += 1.0;
            }

            String meat = meatList.get(meatNum);
            if(meat.equals("chicken,") || meat.equals("steak,") || meat.equals("carnidas,") || meat.equals("chorizo,") || meat.equals("sofritas,") || meat.equals("veggie meat,")){
                burritoPrice += 0.5;
            }
            else if(meat.equals("all,")){
                burritoPrice += 1.0;
            }

            String beans = beansList.get(beansNum);
            if(beans.equals("pinto,") || beans.equals("black,")){
                burritoPrice += 0.5;
            }
            else if(beans.equals("both,")){
                burritoPrice += 1.0;
            }

            String salsa = salsaList.get(salsaNum);
            if(salsa.equals("mild,") || salsa.equals("medium,") || salsa.equals("hot,")){
                burritoPrice += 0.5;
            }
            else if(salsa.equals("all,")){
                burritoPrice += 1.0;
            }

            String veggies = veggiesList.get(veggiesNum);
            if(veggies.equals("lettuce,") || veggies.equals("fajita veggies,")){
                burritoPrice += 0.5;
            }
            else if(veggies.equals("both,")){
                burritoPrice += 1.0;
            }

            String cheese = cheeseList.get(cheeseNum);
            if(cheese.equals("cheese,")){
                burritoPrice += 0.5;
            }

            String guac = guacList.get(guacNum);
            if(guac.equals("guac,")){
                burritoPrice += 0.5;
            }

            String queso = quesoList.get(quesoNum);
            if(queso.equals("queso,")){
                burritoPrice += 0.5;
            }

            String sourCream = sourCreamList.get(sourCreamNum);
            if(sourCream.equals("sour cream,")){
                burritoPrice += 0.5;
            }

            String price = priceFormat.format(burritoPrice);

            switch(switchNum){
                case 1:
                    System.out.printf("Burrito %d: %s %s %s %s %s Price: %s\n", i, rice, meat, beans, salsa, veggies, price);
                    break;
                case 2:
                    System.out.printf("Burrito %d: %s %s %s %s %s %s Price: %s\n", i, rice, meat, beans, salsa, veggies, cheese, price);
                    break;
                case 3:
                    System.out.printf("Burrito %d: %s %s %s %s %s %s %s Price: %s\n", i, rice, meat, beans, salsa, veggies, cheese, guac, price);
                    break;
                case 4:
                    System.out.printf("Burrito %d: %s %s %s %s %s %s %s %s Price: %s\n", i,rice, meat, beans, salsa, veggies, cheese, guac, queso, price);
                    break;
                case 5:
                    System.out.printf("Burrito %d: %s %s %s %s %s %s %s %s %s Price: %s\n",i, rice, meat, beans, salsa, veggies, cheese, guac, queso, sourCream, price);
                    break;
            }
        }
    }
}
