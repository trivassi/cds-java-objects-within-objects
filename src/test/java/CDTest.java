import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void CD_createsInstance_true() {
    CD newCD = new CD("Rock", "Parachutes");
    assertEquals(true, newCD instanceof CD);
  }

  @Test
  public void CD_getGenre_String() {
    CD newCD = new CD("Rock", "Parachutes");
    assertEquals("Rock", newCD.getGenre());
  }

  @Test
  public void CD_getAlbumString() {
    CD newCD = new CD("Rock", "Parachutes");
    assertEquals("Parachutes", newCD.getAlbum());
  }

  @Test
  public void all_returnsAllInstancesOfRectangle_true() {
    CD firstCD = new CD("Rock", "Parachutes");
    CD secondCD = new CD("Roc", "Parachute");
    assertTrue(CD.all().contains(firstCD));
    assertTrue(CD.all().contains(secondCD));
  }
}
