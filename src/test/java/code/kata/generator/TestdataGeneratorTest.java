package code.kata.generator;

import code.kata.model.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestdataGeneratorTest {

    private TestdataGenerator underTest = new TestdataGenerator();

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

    @Test
    public void test_generate_givenClassWithLongField_setFieldToMAX_LONG() throws Exception {

        LongClass p = underTest.generate(LongClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getLongField()).isEqualTo(Long.MAX_VALUE);
    }

    @Test
    public void test_generate_givenClassWithLowerCaseLongField_setFieldToIMAX_LONG () throws Exception {

        LowerCaseLongClass p = underTest.generate(LowerCaseLongClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getLongField()).isEqualTo(Long.MAX_VALUE);
    }

    @Test
    public void test_generate_givenClassWithStringField_setFieldToFieldname () throws Exception {

        StringClass p = underTest.generate(StringClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getStringField()).isEqualTo("stringField");
    }

    @Test
    public void test_generate_givenClassWithEnumField_setFieldToFirstValueOfEnum () throws Exception {

        EnumClass p = underTest.generate(EnumClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getEnumField()).isEqualTo(EnumField.YEPP);
    }

    @Test
    public void test_generate_givenClassWithIntegerList_setFieldToListWithOneElementOfMAX_INT () throws Exception {

        ListClass p = underTest.generate(ListClass.class);

        assertThat(p).isNotNull();
        assertThat(p.getIntegerList()).isNotNull().hasSize(1).contains(Integer.MAX_VALUE);
    }

}