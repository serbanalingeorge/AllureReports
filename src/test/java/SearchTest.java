import base.TestBase;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import pages.GoogleSearchResultsPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

@Features("Google Search feature")
public class SearchTest extends TestBase {

    @Title("Google basic search test")
    @Description("This test searches for something on Google")
    @Stories("Success story")
    @Test
    public void searchTest(){

        String searchText = "Google";
        GoogleSearchPage.search(searchText);
        GoogleSearchResultsPage.verifySearchResult(searchText);
    }

    @Title("Failing Google search Test")
    @Description("This is a test that fails on purpose")
    @Stories("Failure story")
    @Test
    public void failingTest(){
        GoogleSearchPage.causeFailure();
    }

    @Title("Broken Google search Test")
    @Description("This is a test that searches for nonsense element")
    @Stories("Failure story")
    @Test
    public void brokenTest(){
        GoogleSearchPage.causeBrokenTest();
    }

    @Title("Pending Google search Test")
    @Description("This is a test that's currently in development")
    @Stories("Success story")
    @Test(enabled = false)
    public void pendingTest(){
        //TODO: implement some neat google search checks
    }


}
