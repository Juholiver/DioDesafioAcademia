package dio.AcademiaDesafioDio.service;

import dio.AcademiaDesafioDio.entity.Matricula;
import dio.AcademiaDesafioDio.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

  Matricula create(MatriculaForm form);

 
  Matricula get(Long id);

  
  List<Matricula> getAll(String bairro);

 
  void delete(Long id);

}