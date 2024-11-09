package best.skn.utils.color;

/**
 * Color Class as main API
 * <div>
 *  <p>This is the main API Class to use in order to get colored string output</p>
 *  <p>This Class has 16 methods for returning 8 different colored outputs</p>
 * </div>
 *
 * @author SKN Shukhan
 * @version 1.5.0
 * @since 2024-03-07
 * @use.case Java, Java Spring Boot
 * @dedicated.to Logno, Atoshi and My Parents
 */
public class Color {

  /**
   * Static method to output a black colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Black
   * @since v1.1.0
   */
  public static String black(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.BLACK), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold black colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Black
   * @since v1.1.0
   */
  public static String blackBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.BLACK_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a red colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Red
   * @since v1.1.0
   */
  public static String red(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.RED), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold red colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Red
   * @since v1.1.0
   */
  public static String redBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.RED_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a green colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Green
   * @since v1.1.0
   */
  public static String green(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.GREEN), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold green colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Green
   * @since v1.1.0
   */
  public static String greenBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.GREEN_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a yellow colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Yellow
   * @since v1.1.0
   */
  public static String yellow(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.YELLOW), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold yellow colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Yellow
   * @since v1.1.0
   */
  public static String yellowBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.YELLOW_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a blue colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Blue
   * @since v1.1.0
   */
  public static String blue(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.BLUE), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold blue colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Blue
   * @since v1.1.0
   */
  public static String blueBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.BLUE_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a purple colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Purple
   * @since v1.1.0
   */
  public static String purple(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.PURPLE), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold purple colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Purple
   * @since v1.1.0
   */
  public static String purpleBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.PURPLE_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a cyan colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Cyan
   * @since v1.1.0
   */
  public static String cyan(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.CYAN), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold cyan colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold Cyan
   * @since v1.1.0
   */
  public static String cyanBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.CYAN_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a white colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is White
   * @since v1.1.0
   */
  public static String white(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.WHITE), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Static method to output a bold white colored string
   *
   * @param text a String as parameter
   * @return a String with colored output which is Bold White
   * @since v1.1.0
   */
  public static String whiteBold(String text) {
    return String.format("%s%s%s", ColorMap.getColor(ColorName.WHITE_BOLD), text, ColorMap.getColor(ColorName.RESET));
  }

  /**
   * Protected static method to throw Unsupported Instantiation Error
   *
   * @throws UnsupportedOperationException
   * @since v1.3.0
   */
  protected static void ThrowInstantiationError() throws UnsupportedOperationException {
    throw new UnsupportedOperationException(red("Class Instantiation is not supported!"));
  }

  /**
   * Private constructor to make the class non-instantiable
   *
   * @since v1.3.0
   */
  private Color() {
    ThrowInstantiationError();
  }
}
