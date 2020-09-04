package code.kata.generator;

import code.kata.model.IntClass;
import code.kata.model.IntegerClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestdataTest {

    private Testdata underTest = new Testdata();

    @Test
    public void test_generate_givenClassWithIntegerField_setFieldToINT_MAX() throws Exception {

        IntegerClass p = underTest.generate(IntegerClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getIntegerField()).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    public void test_generate_givenClassWithIntField_setFieldToINT_MAX() throws Exception {

        IntClass p = underTest.generate(IntClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getIntField()).isEqualTo(Integer.MAX_VALUE);
    }

}