package code.kata.generator;

import code.kata.model.Person;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestdataTest {

    private Testdata underTest = new Testdata();

    @Test
    public void test_generate() throws Exception {

        Person p = underTest.generate(Person.class);

        assertThat(p).isNotNull();
        assertThat(p.getAge()).isEqualTo(Integer.MAX_VALUE);
    }

}