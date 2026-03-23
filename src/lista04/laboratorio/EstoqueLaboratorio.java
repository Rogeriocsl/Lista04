package lista04.laboratorio;

import java.util.LinkedList;
import java.util.List;

public class EstoqueLaboratorio {
    List<ItemLaboratorio> itens = new LinkedList<>();

    public void cadastrar(ItemLaboratorio item) {
        if (item == null) {
            throw new IllegalArgumentException("Item nao pode ser nulo.");
        }
        itens.add(item);
    }

    public ItemLaboratorio buscarPorCodigo(String codigo) {
        for (ItemLaboratorio item : itens) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }

    public List<ItemLaboratorio> listarEmAlerta() {
        List<ItemLaboratorio> emAlerta = new LinkedList<>();
        for (ItemLaboratorio item : itens) {
            String status = item.getStatus();
            if (status != null && ("ALERTA".equalsIgnoreCase(status) || "ESGOTADO".equalsIgnoreCase(status))) {
                emAlerta.add(item);
            }
        }
        return emAlerta;
    }
}