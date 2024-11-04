package best.skn.utils;

import best.skn.utils.color.Color;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

  @Test
  void blueText() {
    System.out.println(Color.blue("Hello SKN! 👋"));
  }

  @Test
  void redText() {
    System.out.println(Color.red("You should die soon, SKN! 💀"));
  }

  @Test
  void greenText() {
    System.out.println(Color.green("Hello Wang So! 🧛"));
  }
}
