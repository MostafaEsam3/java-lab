import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class LabTwo {
    public static void main(String[] args) {
        List<Countries> countries = new ArrayList<Countries>();
          countries.add(new Countries("BLR", "Belarus", "Europe",10236000,207600,13714,3520
          ));
          countries.add(new Countries("BRB", "Barbados", "North America",270000,430,2223,174

          ));
          countries.add(new Countries("CAF", "Central African Republic","Africa",3615000,622984,1054,1889

          ));
          countries.add(new Countries("CAN", "Canada", "North America",31147000,9970610,598862,1822));
          Optional<Integer> maxPopulaiton =  countries.stream().map(b -> b.getPopulation()).max(Comparator.naturalOrder());

          Optional<Integer> minPoplation =  countries.stream().map(b -> b.getPopulation()).max(Comparator.reverseOrder());

          System.out.println("Max " + maxPopulaiton.get());

          System.out.println("min " + minPoplation.get());


          for (Countries countries2 : countries) {
            Optional<Integer> maxPopulationInCountry = countries.stream().filter(b -> b.getContient() == countries2.getContient()).map(b -> b.getPopulation()).max(Comparator.naturalOrder());

            System.out.println("max "+ countries2.getContient() + " " + maxPopulationInCountry.get());
          }




    }


}


// try {
//   File myObj = new File("./Countries.csv");
//   Scanner myReader = new Scanner(myObj);
//   while (myReader.hasNextLine()) {
//     StringTokenizer data = new StringTokenizer(myReader.nextLine(),",");
//     countries.add(new Countries(data.nextToken(),data.nextToken(),data.nextToken(),
//     Integer.parseInt(data.nextToken()),
//     Integer.parseInt(data.nextToken()),
//     Integer.parseInt(data.nextToken()),
//     Integer.parseInt(data.nextToken())
//     ));

//   }

//   myReader.close();
// } catch (FileNotFoundException e) {
//   System.out.println("An error occurred.");
//   e.printStackTrace();
// }