package example;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class PlayTechTest extends PlayTechBaseTest {

  @Test
  @Description("Verify the Careers page on Playtech website")
  public void testCareerPageTitle() {
    navigateToCareers();
    assertCareersPageText();
  }
  @Step("Navigate to Careers page")
  private void navigateToCareers() {
    $(By.xpath("//a[contains(@href, '/careers')]")).click();
  }

  @Step("Assert 'Careers at Playtech' text is present")
  private void assertCareersPageText() {
    $(".display-1").shouldHave(text("Careers at Playtech"));
  }

  @Test
  @Description("Verify the Internship page on Playtech website")
  public void testInternshipPageTitle() {
    navigateToInternship();
    assertInternship();
  }
  @Step("Navigate to Careers page")
  private void navigateToInternship() {
    $(By.xpath("//a[contains(@href, '/internship')]")).click();
  }

  @Step("Assert 'Careers at Playtech' text is present")
  private void assertInternship() {
    $(".display-1").shouldHave(text("Internship"));
  }

  @Step("Navigate to Contact Us page")
  private void navigateToContactUs() {$(By.xpath("//a[contains(@href, '/contact-us')]")).click();
  }

  @Test
  @Description("Verify navigation to specific sections on Playtech website")
  public void testSectionNavigation() {

    navigateToWhoWeAre();
    navigateToInternship();
    navigateToPeopleAndCulture();
    navigateToCareers();
    navigateToContactUs();
    navigateToBlog();
  }

  @Step("Navigate to Who we are page")
  private void navigateToWhoWeAre() {
    $(By.xpath("/html/body/header/div/nav/a[1]")).click();
  }

  @Step("Navigate to People and Culture page")
  private void navigateToPeopleAndCulture() {
    $(By.xpath("/html/body/header/div/nav/a[2]")).click();
  }

  @Step("Navigate to Blog")
  private void navigateToBlog() {$(By.xpath("/html/body/header/div/nav/a[5]")).click();}
}

