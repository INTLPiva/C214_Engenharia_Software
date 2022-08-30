public interface HorarioServices {
    String busca(int id);

    boolean vazio(int length);

    boolean alcanceSala(int sala);

    boolean trocarSala(int profA, int profB);
}

