package best.skn.utils.color;

/**
 * ColorName Enum for internal use in Color Class
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-03-07
 * @use.case Java, Java Spring Boot
 * @dedicated.to Logno, Atoshi and My Parents
 */
public enum ColorName {
  /**
   * Reset element
   *
   * @since v1.1.0
   */
  RESET("Reset"),
  /**
   * Black element
   *
   * @since v1.1.0
   */
  BLACK("Black"),
  /**
   * Red element
   *
   * @since v1.1.0
   */
  RED("Red"),
  /**
   * Green element
   *
   * @since v1.1.0
   */
  GREEN("Green"),
  /**
   * Yellow element
   *
   * @since v1.1.0
   */
  YELLOW("Yellow"),
  /**
   * Blue element
   *
   * @since v1.1.0
   */
  BLUE("Blue"),
  /**
   * Purple element
   *
   * @since v1.1.0
   */
  PURPLE("Purple"),
  /**
   * Cyan element
   *
   * @since v1.1.0
   */
  CYAN("Cyan"),
  /**
   * White element
   *
   * @since v1.1.0
   */
  WHITE("White"),
  /**
   * Bold Black element
   *
   * @since v1.1.0
   */
  BLACK_BOLD("Bold Black"),
  /**
   * Bold Red element
   *
   * @since v1.1.0
   */
  RED_BOLD("Bold Red"),
  /**
   * Bold Green element
   *
   * @since v1.1.0
   */
  GREEN_BOLD("Bold Green"),
  /**
   * Bold Yellow element
   *
   * @since v1.1.0
   */
  YELLOW_BOLD("Bold Yellow"),
  /**
   * Bold Blue element
   *
   * @since v1.1.0
   */
  BLUE_BOLD("Bold Blue"),
  /**
   * Bold Purple element
   *
   * @since v1.1.0
   */
  PURPLE_BOLD("Bold Purple"),
  /**
   * Bold Cyan element
   *
   * @since v1.1.0
   */
  CYAN_BOLD("Bold Cyan"),
  /**
   * Bold White element
   *
   * @since v1.1.0
   */
  WHITE_BOLD("Bold White");

  /**
   * Private final property for the enum element String value
   *
   * @since v1.3.0
   */
  private final String colorName;

  /**
   * Private constructor for the enum
   *
   * @since v1.3.0
   */
  private ColorName(String name) {
    this.colorName = name;
  }

  /**
   * Public method to get the enum element value
   *
   * @return a String containing the value of enum element
   * @since v1.3.0
   */
  public String getName() {
    return this.colorName;
  }
}
