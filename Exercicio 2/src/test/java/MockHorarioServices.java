public class MockHorarioServices implements HorarioServices {

    @Override
    public String busca(int id) {
        if (id == 1) {
            return HorarioStatic.Lucas;
        } else if (id == 2) {
            return HorarioStatic.Guilherme;
        } else if (id == 3) {
            return HorarioStatic.Ian;
        } else {
            return null;
        }
    }

    @Override
    public boolean vazio(int length) {
        if (length > 0) {
            return false;
        }
        return true;
    }

    public boolean alcanceSala(int sala) {
        if (sala > 0 && sala <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean trocarSala(int profSalaCurrentA, int profSalaBeforeA) {

        if (profSalaCurrentA == profSalaBeforeA) {
            return true;
        } else {
            return false;
        }
    }
}



