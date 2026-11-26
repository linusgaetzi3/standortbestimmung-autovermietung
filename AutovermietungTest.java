import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutovermietungTest {
    ArrayList<Fahrzeug> fahrzeugArrayList = new ArrayList<>();
    Autovermietung autovermietung = new Autovermietung();
    Fahrzeug auto = new Auto(4, false, 200, "black", "ZH3764367");

    @Test
    void fahrzeugHinzufuegen() {
        autovermietung.fahrzeugHinzufuegen(auto);
        assertEquals(1, autovermietung.fahrzeugArrayList.size());
    }

    @Test
    void sucheNachKennzeichen() {
        autovermietung.fahrzeugHinzufuegen(auto);
        assertSame(auto, autovermietung.sucheNachKennzeichen("zh3764367"));
        assertNull(autovermietung.sucheNachKennzeichen("zh3251"));
    }
                                
    @Test
    void pruefeObFahrzeugVermietet(){
        auto.setVermietet(true);
        autovermietung.fahrzeugHinzufuegen(auto);
        autovermietung.fahrzeugHinzufuegen(new Motorrad(2, false, 180, "silver", "LZ3234"));
        assertEquals(1, autovermietung.pruefeObFahrzeugVermietet());
    }
}