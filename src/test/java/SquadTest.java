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

}
