package dio.AcademiaDesafioDio.infra.jackson;
import dio.AcademiaDesafioDio.entity.AvaliacaoFisica;
import dio.AcademiaDesafioDio.entity.form.AvaliacaoFisicaForm;
import dio.AcademiaDesafioDio.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
    void delete(Long id);

    
}
