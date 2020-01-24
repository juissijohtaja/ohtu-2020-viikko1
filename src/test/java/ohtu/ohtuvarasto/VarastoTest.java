package ohtu.ohtuvarasto;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VarastoTest {

    Varasto varasto;
    Varasto varasto2;
    Varasto varasto3;
    Varasto varasto4;
    Varasto varasto5;
    double vertailuTarkkuus = 0.0001;

    @Before
    public void setUp() {
        varasto = new Varasto(10); // tilavuus ok
        varasto2 = new Varasto(-4); // tilavuus kelvoton
        varasto3 = new Varasto(10, 5);  // tilavuus ok ja alkusaldo ok
        varasto4 = new Varasto(10, -5); // tilavuus ok, alkusaldo kelvoton
        varasto5 = new Varasto(-10, 5); // tilavuus kelvoton, alkusaldo ok
    }

    @Test
    public void konstruktoriLuoTyhjanVaraston() {
        assertEquals(0, varasto.getSaldo(), vertailuTarkkuus);
    }

    @Test
    public void uudellaVarastollaOikeaTilavuus() {
        assertEquals(10, varasto.getTilavuus(), vertailuTarkkuus);
    }

    @Test
    public void lisaysLisaaSaldoa() {
        varasto.lisaaVarastoon(8);

        // saldon pitäisi olla sama kun lisätty määrä
        assertEquals(8, varasto.getSaldo(), vertailuTarkkuus);
    }

    @Test
    public void lisaysLisaaPienentaaVapaataTilaa() {
        varasto.lisaaVarastoon(8);

        // vapaata tilaa pitäisi vielä olla tilavuus-lisättävä määrä eli 2
        assertEquals(2, varasto.paljonkoMahtuu(), vertailuTarkkuus);
    }

    @Test
    public void ottaminenPalauttaaOikeanMaaran() {
        varasto.lisaaVarastoon(8);

        double saatuMaara = varasto.otaVarastosta(2);

        assertEquals(2, saatuMaara, vertailuTarkkuus);
    }

    @Test
    public void ottaminenLisääTilaa() {
        varasto.lisaaVarastoon(8);

        varasto.otaVarastosta(2);

        // varastossa pitäisi olla tilaa 10 - 8 + 2 eli 4
        assertEquals(4, varasto.paljonkoMahtuu(), vertailuTarkkuus);
    }

    // omat testit 6

    @Test
    public void lisaysTayteenMaxSaldo() {
        varasto.lisaaVarastoon(18);

        // saldon pitäisi olla sama kun lisätty määrä
        assertEquals(10, varasto.getSaldo(), vertailuTarkkuus);
    }

    @Test
    public void virheellinenLisaysSaldo() {
        varasto.lisaaVarastoon(-4);

        // saldon pitäisi olla sama kun lisätty määrä
        assertEquals(0, varasto.getSaldo(), vertailuTarkkuus);
    }

    @Test
    public void virheellinenOttaminenEiLisääTilaa() {
        varasto.lisaaVarastoon(8);

        varasto.otaVarastosta(-2);

        // varastossa pitäisi olla tilaa 10 - 8 + 2 eli 4
        assertEquals(2, varasto.paljonkoMahtuu(), vertailuTarkkuus);
    }

    @Test
    public void kokoSaldonOttaminenTyhjentaaTilan() {
        varasto.lisaaVarastoon(8);

        varasto.otaVarastosta(20);

        // varastossa pitäisi olla tilaa 10 - 8 + 2 eli 4
        assertEquals(10, varasto.paljonkoMahtuu(), vertailuTarkkuus);
    }

    @Test
    public void kelvottomallaVarastollaOikeaTilavuus() {
        assertEquals(0, varasto2.getTilavuus(), vertailuTarkkuus);
    }

    @Test
    public void tilavuusJaAlkusaldoVarastollaOikeaTilavuusJaTyhjaTila() {
        assertEquals(10, varasto3.getTilavuus(), vertailuTarkkuus);
        assertEquals(5, varasto3.paljonkoMahtuu(), vertailuTarkkuus);
    }

    @Test
    public void tilavuusJaKelvotonAlkusaldoVarastollaOikeaTilavuusJaTyhjaTila() {
        assertEquals(10, varasto4.getTilavuus(), vertailuTarkkuus);
        assertEquals(10, varasto4.paljonkoMahtuu(), vertailuTarkkuus);
    }

    @Test
    public void tilavuusKelvotonJaAlkusaldoVarastollaOikeaTilavuusJaTyhjaTila() {
        assertEquals(0, varasto5.getTilavuus(), vertailuTarkkuus);
    }

    @Test
    public void varastollaOikeaTulostus() {
        assertEquals("saldo = 0.0, vielä tilaa 10.0", varasto.toString());
    }

}