
public class Main {

    public static void main(String[] args) {
        // Instantiate SimpleDate Class
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
        
        // Instantiate new SimpleDate class and advance it by several weeks
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }
        
        // Display results to user
        System.out.println("The date after 790 days from the examined Friday is " + date.afterNumberOfDays(790));
        
        // Instantiate SimpleDate Class
        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);
        
        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
