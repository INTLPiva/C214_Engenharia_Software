import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class NovoHorario {
    HorarioServices horarioServices;

    public NovoHorario(HorarioServices service) {
        this.horarioServices = service;
    }

    public HorarioPOJO publicaHorários(int id) {
        String HoráriosPOJOJson = horarioServices.busca(id);

        JsonObject jsonObject = JsonParser.parseString(HoráriosPOJOJson).getAsJsonObject();

        return new HorarioPOJO(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsInt());
    }

    public boolean vazio(int length) {
        return horarioServices.vazio(length);
    }

    public boolean verificaSala(int sala) {
        boolean salaAllow = horarioServices.alcanceSala(sala);
        return salaAllow;
    }

    public boolean trocaSala(int profSalaA, int profSalaB) {
        boolean troca = horarioServices.trocarSala(profSalaA, profSalaB);
        return troca;
    }
}
