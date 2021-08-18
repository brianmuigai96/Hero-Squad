import org.junit.Test;
import static org.junit.Assert.

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        assertEquals(true, myHero instanceof Hero);
    }
     @Test
    public void getName_forHeroesName_String() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        String expected = "Rashid";
        assertEquals(expected, myHero.getName());
    }
      @Test
    public void getAge_forHeroesName_String() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        int expected = 65;
        assertEquals(expected, myHero.getAge());
    }
     @Test
    public void getWeakness_forHeroesName_String() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        String expected = "cut";
        assertEquals(expected, myHero.getWeakness());
    }
    @Test
    public void getPower_forHeroesName_String() {
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        String expected = "cut";
        assertEquals(expected, myHero.getPower());
    }
     @Test
    public void getId_forHeroesName_int() {
        Hero.clear();
        Hero myHero = new Hero("Rashid",65,"cut","cut");
        assertEquals(1, myHero.getId());
    }
}
