package lista04.agendaMedica;

public class Consulta {
    int id;
    String nomePaciente;
    String nomeMedico;
    String dataHora;
    String status;
    String observaçoes;

    public Consulta(String nomePaciente, String nomeMedico, String dataHora) {

        if (nomePaciente == null || nomePaciente.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Paciente não pode ser nulo ou vazio.");
        }
        if (nomeMedico == null || nomeMedico.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Medico não pode ser nulo ou vazio.");
        }
        if (dataHora == null || dataHora.trim().isEmpty()) {
            throw new IllegalArgumentException("Data/hora não pode ser nulo ou vazio.");
        }


    }
}
