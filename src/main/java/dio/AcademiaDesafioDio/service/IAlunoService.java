package dio.AcademiaDesafioDio.service;

import dio.AcademiaDesafioDio.entity.Aluno;
import dio.AcademiaDesafioDio.entity.AvaliacaoFisica;
import dio.AcademiaDesafioDio.entity.form.AlunoForm;
import dio.AcademiaDesafioDio.entity.form.AlunoUpdateForm;

import java.time.LocalDate;
import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoForm form);


  Aluno get(Long id);


  List<Aluno> getAll(String dataDeNascimento);

  Aluno update(Long id, AlunoUpdateForm formUpdate);

 
  void delete(Long id);

  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}