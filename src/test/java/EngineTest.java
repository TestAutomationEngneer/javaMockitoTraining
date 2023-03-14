import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class EngineTest {
    Engine engine;
    @Mock
    Engine mockedEngine;

    @Spy
    Engine spyEngine;



    //original sound is brum brum
    //I want to mock wrrrr

    @Test
    void shouldGetgears_RC()
    {
        engine = new Engine("vmock");
        String sound = engine.gearHandler(5);
        assertThat(sound).isEqualTo("Skrzynia jest 5 biegowa");
    }
    @Test
    void shouldGetEngineSound_Mock1()
    {
       Answer<String> ansewrSound = invocationOnMock ->
       {
           var result =  invocationOnMock.getArgument(0, Integer.class); //parametr który podaje do metody gearHandler(3)
           result = result + 3;
           return  "skrzynia jest mockowa i jest " + result + " biegowa";
       };

        when(mockedEngine.gearHandler(anyInt())).thenAnswer(ansewrSound);

        String sound = mockedEngine.gearHandler(3);
        assertThat(sound).isEqualTo("skrzynia jest mockowa i jest 6 biegowa");
    }

    @Test
    void shouldGetEngineSound_Mock2()
    {
        when(mockedEngine.gearHandler(anyInt())).thenReturn("skrzynia jest 15 biegowa z mockiem");

        String sound = mockedEngine.gearHandler(5);
        assertThat(sound).isEqualTo("skrzynia jest 15 biegowa z mockiem");
    }

    @Test
    void shouldGetEngineSound_Mock3()
    {
        doAnswer(invocation -> {
            var result =  invocation.getArgument(0, Integer.class);
            result = result + 3;
            return  "skrzynia jest mockowa i jest " + result + " biegowa";

        }).when(mockedEngine).gearHandler(anyInt());

        String sound = mockedEngine.gearHandler(3);
        assertThat(sound).isEqualTo("skrzynia jest mockowa i jest 6 biegowa");
    }

    @Test
    void shouldGetEngineSound_MockCalculateEnginePower_mocked()
    {
        doAnswer(invocation -> {
            double arg =  invocation.getArgument(0, Integer.class);
           double result = arg + 2999.00;
            return result;

        }).when(mockedEngine).calculateEnginePower(anyInt());

        double resultPower = mockedEngine.calculateEnginePower(1);
        assertThat(resultPower).isEqualTo(3000.00);
    }

    @Test
    void shouldGetEngineSound_MockShowPowerEnginePower_mocked()
    {
        doAnswer(invocation -> {
            double arg =  invocation.getArgument(0, Integer.class);
            double result = arg + 2999.00;
            return result;
        }).when(spyEngine).calculateEnginePower(anyInt());

        double resultPower = spyEngine.showEnginePower(1);
        assertThat(resultPower).isEqualTo(3002.00);
    }

    @Test
    void shouldGetEngineSound_MockCalculateEnginePower_RC()
    {
        engine = new Engine("vmock");
        double result = engine.showEnginePower(10);
        assertThat(result).isEqualTo(7.5);
    }
}
