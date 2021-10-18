import baseline.Website;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution43Test {

    @Test
    void Test1(){
        Website Testwebsite = new Website("Amogus.com","obama", true, false);

        Assertions.assertEquals("src/main/java/baseline/Amogus.com",Testwebsite.returnPath());
    }
}
//"src/main/java/baseline/Amogus.com"