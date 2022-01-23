package dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class RepositorioDTO {
    private long id;
    private Date fCreacion;

    @Override
    public String toString() {
        return "RepositorioDTO{" +
                "id=" + id +
                ", fCreacion=" + fCreacion +
                '}';
    }
}