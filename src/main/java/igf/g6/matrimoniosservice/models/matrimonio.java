package igf.g6.matrimoniosservice.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "matrimonio")
public class matrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombreEsposo")
    private String nombreEsposo;
    @Column(name = "nombreEsposa")
    private String nombreEsposa;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "id_esposo")
    private long id_esposo;
    @Column(name = "id_esposa")
    private long id_esposa;


    public matrimonio() {
    }

    public matrimonio(String nombreEsposo, String nombreEsposa, Date fecha, long id_esposa,
                      long id_esposo) {
        this.nombreEsposo = nombreEsposo;
        this.nombreEsposa = nombreEsposa;
        this.fecha = fecha;
        this.id_esposa = id_esposa;
        this.id_esposo = id_esposo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEsposo() {
        return nombreEsposo;
    }

    public void setNombreEsposo(String nombreEsposo) {
        this.nombreEsposo = nombreEsposo;
    }

    public String getNombreEsposa() {
        return nombreEsposa;
    }

    public void setNombreEsposa(String nombreEsposa) {
        this.nombreEsposa = nombreEsposa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getId_esposo() {
        return id_esposo;
    }

    public void setId_esposo(long id_esposo) {
        this.id_esposo = id_esposo;
    }

    public long getId_esposa() {
        return id_esposa;
    }

    public void setId_esposa(long id_esposa) {
        this.id_esposa = id_esposa;
    }
}