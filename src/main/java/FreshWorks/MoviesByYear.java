package FreshWorks;

import java.util.*;

public class MoviesByYear {

    public static void main(String[] args) {
        String moviesAndYears = "Alexander-2018 Bobby-2015 GameOfThrones-2021 Shadow-2006";

        // Split the string by spaces and hyphens to get individual movie-year pairs
        String[] movieYearPairs = moviesAndYears.split(" ");
     /*   for (int i = 0; i < movieYearPairs.length; i++) {
            System.out.println(movieYearPairs[i]);
        }*/

        HashMap<String,Integer> movieYearMap = new HashMap<>();
        for(int i=0;i<movieYearPairs.length;i++){
          String[] tempArray =  movieYearPairs[i].split("-");
          String movieName = tempArray[0];
          int year = Integer.parseInt(tempArray[1]);
            movieYearMap.put(movieName,year);
        }

     //   movieYearMap.forEach((k,v) -> System.out.println(k+" "+v));

        List<Map.Entry<String,Integer>> movieYearList = new ArrayList<>(movieYearMap.entrySet());
        Collections.sort(movieYearList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

for(Map.Entry<String,Integer> entry : movieYearList){
    System.out.println(entry);
}


    }
}
