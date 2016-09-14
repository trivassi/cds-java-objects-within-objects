import java.util.List;
import java.util.ArrayList;

public class CD {
  private String mGenre;
  private String mAlbum;
  private static List<CD> instances = new ArrayList<CD>();
  private int mId;

  public CD (String genre, String album) {
    mGenre = genre;
    mAlbum = album;
    instances.add(this);
    mId = instances.size();
  }

  public String getGenre() {
    return mGenre;
  }

  public String getAlbum() {
    return mAlbum;
  }

  public static List<CD> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static CD find(int id) {
    return instances.get(id - 1);
  }
}
