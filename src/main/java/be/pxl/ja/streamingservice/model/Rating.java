package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little Kids", 0),
    OLDER_KIDS("Older Kids", 7),
    TEENS("Teens", 12),
    MATURE("Mature", 16);

    private String rating;
    private int minimumAge;

    Rating(String rating, int minimumAge) {
        this.rating = rating;
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
}
