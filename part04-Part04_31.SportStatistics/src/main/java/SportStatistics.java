
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user information
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String usersTeam = scanner.nextLine();
        
        // Instantiate Scanner and read data from file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // read through the file
            
            // initialize variables
            int numberOfGames = 0;
            int wins = 0;
            int losses = 0;
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                if (line.isEmpty()){
                    continue;
                }
                
                // Split and parse the line
                String[] lineContents = line.split(",");
                String homeTeam = lineContents[0];
                String visitingTeam = lineContents[1];
                int homeTeamScore = Integer.parseInt(lineContents[2]);
                int visitingTeamScore = Integer.parseInt(lineContents[3]);
                
                if (usersTeam.equals(homeTeam)) {
                    numberOfGames++;
                    if (homeTeamScore > visitingTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (usersTeam.equals(visitingTeam)) {
                    numberOfGames++;
                    if (visitingTeamScore > homeTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            // Display results to user
            System.out.println("Games: " + numberOfGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    
}
