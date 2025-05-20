package models.comparision.units;

import org.junit.jupiter.api.Test;

public class VolumeTest {
    @Test
    void RepresentOneGallon() {
        Volume oneGallon = Volume.createFromGallons(1);
        assert(Volume.createFromGallons(1).equals(oneGallon));
    }

    @Test
    void CreateOneGallonOfLiters() {
        Volume oneGallon = Volume.createFromGallons(1);
        Volume inLiters = Volume.createFromLiters(3.78);
        assert(oneGallon.equals(inLiters));
    }
}
