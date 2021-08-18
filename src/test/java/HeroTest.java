import org.junit.Test;
import static org.junit.Assert.

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        assertEquals(true, myHero instanceof Hero);
    }
}

