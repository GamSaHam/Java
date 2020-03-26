import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class UnitTest {

    @Test
    public void testIsPresent(){
        Optional<String> empty = Optional.empty();
        assertThat(empty.isPresent() , is(false) );
    }

    @Test
    public void testOf(){
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        assertThat(opt.isPresent(), is(true));
    }

    @Test
    public void testOf2(){
        String name = null;

        try {
            System.out.println(Optional.of(name));
        }catch (NullPointerException e){
            assertTrue(true);
        }
    }

    @Test
    public void testOfNullable(){
        String name = null;

        Optional<String> opt = Optional.ofNullable(name);

        assertFalse(opt.isPresent());
    }

    @Test
    public void testIsEmpty(){
        String name = null;

        Optional<String> opt = Optional.ofNullable(name);

        System.out.println(opt.empty() == Optional.empty());
    }

    @Test
    public void testIfPresent(){
        String name = "Test";

        Optional<String> opt = Optional.ofNullable(name);
        opt.ifPresent(tempName -> {
            System.out.println("is Present");
        });

        System.out.println("is not Present");
    }

    @Test
    public void testOrElse(){
        String name = null;

        String opt = Optional.ofNullable(name).orElse("Name is empty");

        System.out.println(opt);
    }

    @Test
    public void testOrElseGet(){
        String name = null;

        // orElseGet(function)
        String resultName = Optional.ofNullable(name).orElseGet(() -> "john");

        assertThat(resultName, is("john"));
    }

    @Test
    public void testOrElseThrow(){
        String name = null;

        boolean isSuccess = false;
        try {
            String resultName = Optional.ofNullable(name).orElseThrow(Exception::new);
        }catch (Exception e){

            isSuccess  =true;
        }
        assertTrue(isSuccess);
    }

    @Test
    public void testGet(){

        Optional<String> opt = Optional.ofNullable("baeldung");

        assertThat(opt.get(), is("baeldung"));
    }

    @Test
    public void testFilter(){

        Optional<Integer> opt = Optional.ofNullable(2010);

        boolean is2010 =  opt.filter( y -> y == 2010).isPresent();

        assertTrue(is2010);

    }

    @Test
    public void testFilter2(){

        final int MIN = 5;
        final int MAX = 10;

        Optional<Integer> opt = Optional.ofNullable(5);

        boolean isValid =  opt.filter( val -> val >= MIN).filter(val -> val <=MAX).isPresent();

        assertThat(isValid, is(true));
    }

    @Test
    public void testMap(){
        List<String> companyNames = Arrays.asList("paypal", "oracle", "onetwocm");

        Optional<List<String>> listOptional = Optional.ofNullable(companyNames);

        int size = listOptional.map(List::size).orElse(0);

        assertThat(size, is(3));
    }

    @Test
    public void testMap2(){
        String password = " password";

        Optional<String> opt = Optional.ofNullable(password);

        boolean correctPassword = opt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();

        assertThat(correctPassword, is(true));
    }

    @Test
    public void testFindFirst(){
        List<String> companyNames = Arrays.asList("paypal", "oracle", "onetwocm", "bb");

        Optional<String> opt = companyNames.stream().filter(val -> val.length() <= 4 ).findFirst();

        opt.ifPresent(str -> System.out.println(str));
    }




























}
