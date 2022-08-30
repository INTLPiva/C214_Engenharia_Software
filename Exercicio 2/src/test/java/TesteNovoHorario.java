import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class TesteNovoHorario {
    HorarioServices service;
    NovoHorario novoHorario;

    @Before
    public void setup() {
        //Contexto
        service = new MockHorarioServices();
        novoHorario = new NovoHorario(service);
    }

    @Test
    public void testePublicaHorarioLucas() {
        //Processamento
        HorarioPOJO lucas = novoHorario.publicaHorários(1);

        //Assertiva
        assertEquals("Lucas", lucas.getNomeDoProfessor());
        assertEquals("13:30", lucas.getHorarioDeAtendimento());
        assertEquals("Integral", lucas.getPeriodo());
        assertEquals(5, lucas.getSala());
    }

    @Test
    public void testeModificarHorarioLucas() {
        HorarioPOJO lucas = novoHorario.publicaHorários(1);
        lucas.setHorarioDeAtendimento("17:30");

        assertEquals("17:30", lucas.getHorarioDeAtendimento());
    }

    @Test
    public void testeAlcanceSalaNegativa() {
        HorarioPOJO guilherme = novoHorario.publicaHorários(2);
        int salaCurrent = guilherme.getSala() - 10;
        boolean checkSalas = novoHorario.verificaSala(salaCurrent);

        assertFalse(checkSalas);
    }

    @Test
    public void testeStringContent() {
        HorarioPOJO lucas = novoHorario.publicaHorários(1);
        lucas.setHorarioDeAtendimento("13:30");
        boolean checkEmpty = novoHorario.vazio(lucas.getHorarioDeAtendimento().length());

        assertFalse(checkEmpty);
    }

    @Test
    public void testeReatribuirSala() {
        HorarioPOJO ian = novoHorario.publicaHorários(3);
        ian.setSala(15);
        boolean checkEmpty = novoHorario.vazio(ian.getSala());

        assertFalse(checkEmpty);
    }

    @Test
    public void testeStringVazia() {
        HorarioPOJO ian = novoHorario.publicaHorários(3);
        ian.setHorarioDeAtendimento("");
        boolean checkEmpty = novoHorario.vazio(ian.getHorarioDeAtendimento().length());

        assertTrue(checkEmpty);
    }

    @Test
    public void testeAlcanceSala() {
        HorarioPOJO guilherme = novoHorario.publicaHorários(2);
        boolean checkSalas = novoHorario.verificaSala(guilherme.getSala());

        assertTrue(checkSalas);
    }

    @Test
    public void testeAlcanceSalaAddRemove() {
        HorarioPOJO ian = novoHorario.publicaHorários(3);
        HorarioPOJO guilherme = novoHorario.publicaHorários(2);
        int salaIan = ian.getSala();
        int salaGuilherme = guilherme.getSala();

        ian.setSala(salaGuilherme);
        guilherme.setSala(salaIan);

        boolean checkSalas = novoHorario.trocaSala(ian.getSala(), salaGuilherme);

        assertTrue(checkSalas);
    }

}
