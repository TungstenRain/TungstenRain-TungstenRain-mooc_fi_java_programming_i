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
    
    //Methods
    /**
     * Determine if this comes before another SimpleDate
     * @param compared SimpleDate: the SimpleDate to be compared
     * @return boolean: true if before; false otherwise
     */
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    /**
     * Advance date by 1 day
     */
    public void advance() {
        if (day < 30) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }
    /**
     * Advance date by given value
     * @param howManyDays int: number of days to advance
     */
    public void advance(int howManyDays) {
        if (howManyDays > 0) {
            for (int i = 0; i < howManyDays; i++) {
                this.advance();
            }
        }
    }
    
    /**
     * Create a new SimpleDate advanced a number of days
     * @param days
     * @return 
     */
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
    
    @Override
    /**
     * Return a String in the following format:
     * [day]:[month]:[year]
     */
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
