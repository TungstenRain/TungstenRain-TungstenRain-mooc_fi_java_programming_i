public class SimpleDate {
    // Variables
    private int day;
    private int month;
    private int year;
    
    // Constructors
    /**
     * Construct the SimpleDate
     * @param day int: the day
     * @param month int: the month
     * @param year int: the year
     */
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // Methods
    /**
     * Get the day
     * @return int: the day
     */
    public int getDay() {
        return this.day;
    }
    /**
     * Get the month
     * @return int: the month
     */
    public int getMonth() {
        return this.month;
    }
    /**
     * Get the year
     * @return int: the year
     */
    public int getYear() {
        return this.year;
    }
    
    /**
     * Determine if the SimpleDate is equal to another object
     * @param compared Object: the object to compare
     * @return boolean: true if equal; false otherwise
     */
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // Cast the object to SimpleDate
        SimpleDate otherDate = (SimpleDate) compared;

        // if the object's values are the same, the objects are the same
        if (this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year) {
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }

    @Override
    /**
     * Return the date in the following format:
     * [day].[month].[year]
     */
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
