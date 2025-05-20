package models;

import org.junit.jupiter.api.Test;

public class VolumeTest {
    @Test
    void RepresentOneGallon() {
        Volume oneGallon = Volume.createInGallons(1);
        assert(Volume.createInGallons(1).equals(oneGallon));
    }

    @Test
    void CreateOneGallonOfLitres() {
        Volume oneGallon = Volume.createInGallons(1);
        Volume inLitres = Volume.createInLitres(3.78);
        assert(oneGallon.equals(inLitres));
    }
}
