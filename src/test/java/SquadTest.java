import org.junit.Test;
import static org.junit.Assert.

public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("megaMindClub", 10, "Guru");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_squadInstantiatesWithName_String() {
        Squad testSquad = new Squad("megaMindClub", 10, "Guru");
        assertEquals("nerdsClub", testSquad.getName());
    }
    @Test
    public void getSize_squadInstantiatesWithSize_int() {
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        assertEquals(5, testSquad.getSize());
    }
    @Test
    public void getCause_squadInstantiatesWithCause_String() {
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        assertEquals("megaMind", testSquad.getCause());
    }
    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("megaMind", 10, "Guru");
        Squad secondSquad = new Squad("rome", 4, "high");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }
    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
    @Test
    public void getId_squadsInstantiatesWithAnId_1() {
        Squad.clear();
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        assertEquals(1, testSquad.getId());
    }
    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstSquad = new Squad("megaMind", 10, "Guru");
        Squad secondSquad = new Squad("rome", 4, "high");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }
    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        assertEquals(0, testSquad.getHeroes().size());
    }
     @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        Hero testHero = new Hero("Flash", 20, "Wise", "slow");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }
     @Test
    public void heroAlreadyExists_checksIfHeroExistsinSquads_true() {
        Squad testSquad = new Squad("megaMind", 10, "Guru");
        Hero testHero = new Hero("Flash", 20, "Wise", "slow");
        testSquad.addHero(testHero);
        assertTrue(testSquad.heroAlreadyExists(testHero))
    }


}