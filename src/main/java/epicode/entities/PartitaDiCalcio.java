package epicode.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Event {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "squadra_casa")
    private String squadraDiCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;
    @Column(name = "squadra_vicente")
    private String squadraVicente;
    @Column(name = "numero_gol_squadra_casa")
    private int numeroGolSquadraDiCasa;
    @Column(name = "numero_gol_squadra_ospite")
    private int numeroGolSquadraOspite;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, int numeroGolSquadraDiCasa, int numeroGolSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
        if (numeroGolSquadraDiCasa > numeroGolSquadraOspite) {
            squadraVicente = squadraDiCasa;
        } else if (numeroGolSquadraOspite > numeroGolSquadraDiCasa) {
            squadraVicente = squadraOspite;

        } else {
            this.squadraVicente = "pareggio";

        }
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVicente() {
        return squadraVicente;
    }

    public void setSquadraVicente(String squadraVicente) {
        this.squadraVicente = squadraVicente;
    }

    public int getNumeroGolSquadraDiCasa() {
        return numeroGolSquadraDiCasa;
    }

    public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
    }

    public int getNumeroGolSquadraOspite() {
        return numeroGolSquadraOspite;
    }

    public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
    }
}
