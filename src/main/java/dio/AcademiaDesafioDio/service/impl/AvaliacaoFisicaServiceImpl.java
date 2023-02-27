package dio.AcademiaDesafioDio.service.impl;

import dio.AcademiaDesafioDio.entity.Aluno;
import dio.AcademiaDesafioDio.entity.AvaliacaoFisica;
import dio.AcademiaDesafioDio.entity.form.AvaliacaoFisicaForm;
import dio.AcademiaDesafioDio.entity.form.AvaliacaoFisicaUpdateForm;
import dio.AcademiaDesafioDio.repository.AlunoRepository;
import dio.AcademiaDesafioDio.repository.AvaliacaoFisicaRepository;
import dio.AcademiaDesafioDio.infra.jackson.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
