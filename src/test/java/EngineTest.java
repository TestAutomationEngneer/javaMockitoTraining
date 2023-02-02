import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.internal.stubbing.answers.ClonesArguments;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class EngineTest {


    Engine mockedEngine;

    Country mockedCountry;

    Country realCountry;

    @BeforeEach
    public void setUp() {
        //ustawianie Mocka dla klasy Country
        this.mockedCountry = mock(Country.class, withSettings().defaultAnswer(new ClonesArguments()));
    }


    @Test
    void shouldGetV8EngineType() {

//        //ustawianie Mocka dla klasy Country
//        this.mockedCountry = mock(Country.class, withSettings().defaultAnswer(new ClonesArguments()));

        //Do konstruktora klasy Engine wstawiam mocka Country
        mockedEngine = new Engine("typ silnika", mockedCountry);
        assertThat(mockedEngine.isV8engine(true)).isEqualTo("to silnik v8");
    }

    @Test
    void shouldGetV8EngineTypewithdoAnswer() {

        //doAnswer(invocation -> {})

        //Engine engine = mock(Engine.class);
        doAnswer(invocation -> {
            Object arg0 = invocation.getArgument(0);
            Object arg1 = invocation.getArgument(1);

            System.out.println("ze srodka mocka");
            //assertThat(arg0).isEqualTo("to silnik v8");

            return null;
        }).when(realCountry).calculateProcent(anyBoolean());

    }
}