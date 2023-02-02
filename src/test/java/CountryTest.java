import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


//Agenda:

/*
1. @Mock   CountryTest()
2. mock(DAO.class, withSettings().defaultAnswer(new ClonesArguments) - EngineTest()
3. doAnswer(invocation -> {
result.add(invocation.getArgument(0));
return null;
}).when(dao).insert(anyList());
4. anyList(); any()
5. when(persister.getInterval()).thenReturn(1L); v
6. verify(dao, never()).insert(any(), any()); v
7. spy - kiedy chce zachować logike klasy, ale zamockować jedną lub więcej metod klasy. Tworzy obiekty przez konstruktor bezparametrowy

 */
@ExtendWith(MockitoExtension.class)
class CountryTest {

    @Mock
    private Country mockCountry;

    private Country realCountry;

    @BeforeEach
    public void setUp() {
        realCountry = new Country("Poland", 'P');
    }
    @Test
    void getCalculateREAL() {

        assertThat(realCountry.calculateProcent(true)).isEqualTo(20);
        assertThat(realCountry.calculateProcent(false)).isEqualTo(150);
    }

    @Test
    void getCalculateMOCKED_true() {
        when(mockCountry.calculateProcent(true)).thenReturn(300);

        assertThat(mockCountry.calculateProcent(true)).isEqualTo(300);


    }

    @Test
    void getCalculateMOCKED_false() {
        when(mockCountry.calculateProcent(false)).thenReturn(900);


        assertThat(mockCountry.calculateProcent(false)).isEqualTo(900);
    }
}