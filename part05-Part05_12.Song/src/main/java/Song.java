public class Song {
    // Variables
    private String artist;
    private String name;
    private int durationInSeconds;
    
    // Constructors
    /**
     * Construct the Song
     * @param artist String: the song's artist
     * @param name String: the name of the song
     * @param durationInSeconds int: the duration of the song
     */
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    // Methods
    /**
     * Compare an object to this Song
     * @param compared: the object to be compared to
     * @return boolean: true if the same; false otherwise
     */
    public boolean equals(Object compared) {
        // if the variables are all in the same location, they are equal
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not the type Song, they are not equal
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // Convert the compared object into a Song
        Song comparedSong = (Song) compared;
        
        // if the values of the object variables are equal, the objects are equal
        if (this.artist.equals(comparedSong.artist)
                && this.durationInSeconds == comparedSong.durationInSeconds
                && this.name.equals(comparedSong.name)) {
            return true;
        }
        
        // otherwise the objects are not equal
        return false;
    }

    @Override
    /**
     * Return a string in the following format:
     * [artist]: [name] ([durationInSeconds]s)
     */
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
