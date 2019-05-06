package array;

public class AddBorder {


  public static String [] addBorder(String[] picture) {
    int nPictureRows = picture.length;
    int rowSize = picture[0].length();

    String[] result = new String[nPictureRows + 2 ];

    String border = getStringFromRepeatedChar('*', rowSize + 2);

    //Upper border
    result[0] = border;

    //Middle
    for(int row = 0; row < nPictureRows; row++) {
      result[row + 1] = "*" + picture[row] + "*";
    }

    //Lower border
    result[nPictureRows+1] = border;

    return result;
  }

  static String getStringFromRepeatedChar(char c, int nTimes) {
    StringBuilder s = new StringBuilder("");
    for(int i = 0; i <nTimes; i++ ) {
      s.append(c);
    }
    return s.toString();
  }

}
