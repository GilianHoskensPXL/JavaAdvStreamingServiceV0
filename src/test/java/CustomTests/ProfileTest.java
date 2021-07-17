package CustomTests;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfileTest {
    private Profile profile;

    @BeforeEach
    public void init() {
        profile = new Profile("Gilian Hoskens", LocalDate.of(1995, 8, 6));
    }

    @Test
    public void getAgeShouldReturnCorrectAge() {
        assertEquals(25, profile.getAge());
    }

    @Test
    public void allowedToWatchShouldReturnTrueWhenProfileAgeIsHigherOrEqualToMinimumAge() {
        Content interstellar = new Movie("Interstellar", Rating.TEENS);

        assertTrue(profile.allowedToWatch(interstellar));
    }
}
