package mapper;

import dao.Departamento;
import dao.Repositorio;
import dto.DepartamentoDTO;
import dto.RepositorioDTO;

public class RepositorioMapper extends BaseMapper<Repositorio, RepositorioDTO>{

    @Override
    public Repositorio fromDTO(RepositorioDTO item) {
        Repositorio repositorio = new Repositorio();
        if (item.getId() != null) {
            repositorio.setId(item.getId());
        }
        repositorio.setfCreacion(item.getFCreacion());
        repositorio.setIssues(item.getIssues());
        repositorio.setCommits(item.getCommits());
        return repositorio;
    }
    @Override
    public RepositorioDTO toDTO(Repositorio item) {
        return RepositorioDTO.builder()
                .id(item.getId())
                .fCreacion(item.getfCreacion())
                .issues(item.getIssues())
                .commits(item.getCommits())
                .build();
    }
}
