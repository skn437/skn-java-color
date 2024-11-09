package best.skn.utils.color;

import java.util.HashMap;
import java.util.Map;

/**
 * ColorMap Class for internal use in Color Class
 *
 * @author SKN Shukhan
 * @version 1.5.0
 * @since 2024-03-07
 * @use.case Java, Java Spring Boot
 * @dedicated.to Logno, Atoshi and My Parents
 */
class ColorMap {

  /**
   * Private constructor to make the class non-instantiable
   *
   * @since v1.3.0
   */
  private ColorMap() {
    Color.ThrowInstantiationError();
  }

  /**
   * Private field to hold ASCII color codes and corresponding names
   *
   * @since v1.1.0
   */
  private static final Map<ColorName, String> colorMap = new HashMap<>() {
    {
      //? Reset
      put(ColorName.RESET, "\033[0m");

      //? Regular
      put(ColorName.BLACK, "\033[0;30m");
      put(ColorName.RED, "\033[0;31m");
      put(ColorName.GREEN, "\033[0;32m");
      put(ColorName.YELLOW, "\033[0;33m");
      put(ColorName.BLUE, "\033[0;34m");
      put(ColorName.PURPLE, "\033[0;35m");
      put(ColorName.CYAN, "\033[0;36m");
      put(ColorName.WHITE, "\033[0;37m");

      //? Bold
      put(ColorName.BLACK_BOLD, "\033[1;30m");
      put(ColorName.RED_BOLD, "\033[1;31m");
      put(ColorName.GREEN_BOLD, "\033[1;32m");
      put(ColorName.YELLOW_BOLD, "\033[1;33m");
      put(ColorName.BLUE_BOLD, "\033[1;34m");
      put(ColorName.PURPLE_BOLD, "\033[1;35m");
      put(ColorName.CYAN_BOLD, "\033[1;36m");
      put(ColorName.WHITE_BOLD, "\033[1;37m");
    }
  };

  /**
   * Protected static method for internal use in Color Class
   *
   * @param colorName ColorName Enum as parameter
   * @return a String holding an ASCII Color Code
   * @since v1.1.0
   */
  protected static String getColor(ColorName colorName) {
    return colorMap.get(colorName);
  }
}
