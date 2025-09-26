import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Mockito.*;

@RunWith( PowerMockRunner.class )
@PrepareForTest( AgaUtils.class )
public class BookTest {


    @Test
    public void testGetTitle(){
        //arrange
        Book book = new Book();
        String exp = "TODAY IS THE DAY";

        //act
        String act = book.getTitle();

        //assert
        Assert.assertEquals(exp, act);
    }

}
