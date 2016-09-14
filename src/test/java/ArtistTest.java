import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void newArtist_instantiatesCorrectly() {
    Artist testArtist  = new Artist("test");
    assertEquals(true, testArtist instanceof Artist);
  }
}
