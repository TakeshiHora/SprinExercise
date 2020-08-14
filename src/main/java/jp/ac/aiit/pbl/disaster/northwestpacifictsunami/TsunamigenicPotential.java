package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import java.util.Arrays;

/**
 * Enumeration for TsunamigenicPotential.
 */
public enum TsunamigenicPotential {
    tsunamigenicPotentialNoPossibilityOfaTSUNAMI(0,"THERE IS NO POSSIBILITY OF A TSUNAMI"),
    tsunamigenicPotentialPossibilityOfaDestructiveOCEANWIDE(1,"THERE IS A POSSIBILITY OF A DESTRUCTIVE OCEAN-WIDE TSUNAMI"),
    tsunamigenicPotentialPossibilityOfaDestructiveRegionalTSUNAMI(2,"THERE IS A POSSIBILITY OF A DESTRUCTIVE REGIONAL TSUNAMI"),
    tsunamigenicPotentialPossibilityOfaDestructiveLocalTSUNAMINearTheEpicenter(3,"THERE IS A POSSIBILITY OF A DESTRUCTIVE LOCAL TSUNAMI NEAR THE EPICENTER"),
    tsunamigenicPotentialPossibilityVerySmallPossivilityOfaDestructiveLocalTSUNAMI(4,"THERE IS A VERY SMALL POSSIBILITY OF A DESTRUCTIVE LOCAL TSUNAMI"),
    tsunamigenicPotentialUndefinedCode_5(5,"undefined code"),
    tsunamigenicPotentialUndefinedCode_6(6,"undefined code"),
    tsunamigenicPotentialOther(7,"その他の津波発生の可能性有無");

    private Integer id;
    private String tsunamigenicPotential;

    TsunamigenicPotential(Integer id, String tsunamigenicPotential) {
        this.id = id;
        this.tsunamigenicPotential = tsunamigenicPotential;
    }

    public Integer getId(){
        return this.id;
    }

    public static TsunamigenicPotential getById(int id) {
        return Arrays.stream(TsunamigenicPotential.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
