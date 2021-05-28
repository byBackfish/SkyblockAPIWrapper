package de.bybackfish.api.skyblock.weight;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PlayerWeights {

  @SerializedName("total")
  private PlayerWeight total = new PlayerWeight();

  @SerializedName("skill")
  private PlayerWeight skill = new PlayerWeight();

  @SerializedName("slayer")
  private PlayerWeight slayer = new PlayerWeight();

  @SerializedName("catacombs")
  private PlayerWeight catacombs = new PlayerWeight();

  @SerializedName("overall")
  private double overall;

}
